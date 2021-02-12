FROM openjdk:8
ADD target/usman-account-mgmt.jar usman-account-mgmt.jar
EXPOSE 8092
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=uat", "-Doracle.jdbc.timezoneAsRegion=false", "usman-account-mgmt.jar"]