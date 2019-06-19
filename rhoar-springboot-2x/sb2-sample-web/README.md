**Spring Boot and RHOAR sample**

Example based on:

https://access.redhat.com/documentation/en-us/red_hat_openshift_application_runtimes/1/html/spring_boot_2.1.x_runtime_guide/index

**Test the application locally**

```bash
mvn spring-boot:run
```

git status


**Create project and app on OpenShift**

```bash
oc login -u developer -p developer

oc new-project dev --display-name="Dev - Spring Boot App"

oc new-app -e POSTGRESQL_USER=luke -e POSTGRESQL_PASSWORD=secret -e POSTGRESQL_DATABASE=my_data openshift/postgresql-92-centos7 --name=my-database
```

**Deploy on OpenShift**

Deploy on OCP will use the fabric8 maven plugin

```bash
mvn package fabric8:deploy -Popenshift -DskipTests
```
