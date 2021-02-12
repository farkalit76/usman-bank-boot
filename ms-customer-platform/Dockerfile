FROM openjdk:8
ADD target/usman-customer-mgmt.jar usman-customer-mgmt.jar
EXPOSE 8091
ENTRYPOINT ["java", "-jar","-Dspring.profiles.active=uat", "usman-customer-mgmt.jar"]