FROM openjdk:8
ADD target/usman-channel-mgmt.jar usman-channel-mgmt.jar
EXPOSE 8761
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=uat", "usman-channel-mgmt.jar"]