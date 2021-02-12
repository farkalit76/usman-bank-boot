/**
 * @Copyright reserved to bank
 */
package com.usman.bank.customer.config;

import java.time.Duration;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.serializer.RedisSerializationContext.SerializationPair;

/**
 * Description: This class RedisConfig.java
 *
 * @author vXebiau
 * @date Oct 3, 2019
 * @version 1.0
 *
 */
@Configuration
@EnableCaching
@PropertySource("classpath:application.properties")
public class RedisConfig {

	private static final Logger LOG = LogManager.getLogger(RedisConfig.class);
	
	@Autowired 
	private Environment environment;
	
	@Value("${spring.cache.redis.time-to-live}")
	int ttlValue;
	
	@Bean
	public LettuceConnectionFactory redisConnectionFactory() {
		LOG.debug("LettuceConnectionFactory...");
		RedisStandaloneConfiguration redisConfig = new RedisStandaloneConfiguration();
		redisConfig.setHostName(this.environment.getProperty("spring.redis.host"));
		redisConfig.setPort(Integer.parseInt(this.environment.getProperty("spring.redis.port")));
		redisConfig.setPassword(this.environment.getProperty("spring.redis.password"));
		return new LettuceConnectionFactory(redisConfig);
	}
	
	@Bean
	public RedisCacheConfiguration cacheConfiguration() {
		LOG.debug("RedisCacheConfiguration...ttlValue:"+ttlValue);
		RedisCacheConfiguration cacheConfig = RedisCacheConfiguration.defaultCacheConfig().entryTtl(Duration.ofSeconds(ttlValue)).disableCachingNullValues();
		SerializationPair<String> keySerializationPair = cacheConfig.getKeySerializationPair();
		cacheConfig.serializeKeysWith(keySerializationPair);
		return cacheConfig;
	}
	
	@Bean
	public RedisCacheManager cacheManager() {
		LOG.debug("RedisCacheManager...");
		RedisCacheManager rcm = RedisCacheManager.builder(redisConnectionFactory()).cacheDefaults(cacheConfiguration()).transactionAware().build();
		Collection<String> cacheNames = rcm.getCacheNames();
		LOG.debug("RedisCacheManager...cacheNames:"+cacheNames);
		cacheNames.stream().forEach( ch -> LOG.debug(ch));
		Map<String, RedisCacheConfiguration> cacheConfigurations = rcm.getCacheConfigurations();
		Set<Entry<String, RedisCacheConfiguration>> entrySet = cacheConfigurations.entrySet();
		entrySet.stream().forEach(entry -> LOG.debug("entryset.key:"+entry.getKey() +", value:"+entry.getValue()));
		LOG.debug("RedisCacheManager... ready to use..");
		return rcm;
	}
}
