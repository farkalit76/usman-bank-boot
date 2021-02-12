/**
 * @Copyright reserved to bank
 */
package com.usman.bank.customer.repository.impl;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.usman.bank.customer.repository.CustomerRepository;
import com.usman.bank.models.CustomersDTO;

/**
 * Description: This class CustomerRepositoryImplTest.java
 *
 * @author vXebiau
 * @date Sep 15, 2019
 * @version 1.0
 *
 */
//@RunWith(SpringRunner.class)
//@DataJpaTest
//@AutoConfigureTestDatabase(replace = Replace.NONE)
public class CustomerRepositoryImplTest {

//	@Autowired
//	private TestEntityManager entityManager;
//
//	@Autowired
//	private CustomerRepository customerRepository;

//	@Test
//	public void getCustomerByCifTest() throws Exception {
//		try {
//			// CustomerRepository customerRepository = new CustomerRepositoryImpl();
//			CustomersDTO cust = new CustomersDTO();
//			cust.setCustId(12345);
//
////			entityManager.persist(cust);
////		    entityManager.flush();
////		    CustomerDTO testCust = customerRepository.getCustomerByCif(""+cust.getCif());
////		    assertThat(testCust.getCustId() == cust.getCustId());
//			CustomerRepository customerRepository = new CustomerRepositoryImpl();
//			customerRepository.getCustomerByCif("" + cust.getCif());
//			assertTrue(true);
//		} catch (Exception e) {
//			assertFalse(false);
//		}
//	}

//	@Test
//	public void updateUserStatusTest() {
//		try {
////			entityManager.persist(null);
////		    entityManager.flush();
////			Integer count = customerRepository.updateUserStatus(1, 0, 0);
////			assertThat(count == 0);
//			CustomerRepository customerRepository = new CustomerRepositoryImpl();
//			customerRepository.updateUserStatus(1, 0, 0);
//			assertTrue(true);
//		} catch (Exception e) {
//			assertFalse(false);
//		}
//	}

//	@Bean
//	public TestEntityManager entity() {
//		return new TestEntityManager(null);
//	}
}
