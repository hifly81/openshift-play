**Deploy without pipeline (local ocp)**

 - mvn package fabric8:deploy -Popenshift -DskipTests
 - oc tag camel-sample-service:latest camel-sample-service:0.0.1-SNAPSHOT

**Test local**
mvn spring-boot:run
