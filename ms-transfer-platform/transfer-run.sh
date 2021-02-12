#!/bin/sh
java -Dlogging.config=log4j2.xml -Dspring.profiles.active=uat -Doracle.jdbc.timezoneAsRegion=false -jar usman-transfer-mgmt.jar