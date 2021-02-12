FROM openjdk:8
COPY target/usman-transfer-mgmt.jar usman-transfer-mgmt.jar
COPY target/log4j2.xml log4j2.xml
COPY target/keystore.bin /tmp/keystore.bin
COPY target/resource.cgn /tmp/resource.cgn
COPY target/resource.cgz /tmp/resource.cgz
EXPOSE 8093
COPY transfer-run.sh /transfer-run.sh

ENTRYPOINT ["/transfer-run.sh"]