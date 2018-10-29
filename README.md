# Openshift Play

## rhoar microservices

### rhoar-sample-web
 <br>
 Example from: https://learn.openshift.com/middleware/rhoar-getting-started-spring
 <br>
 Sample web application with Rest services - Spring Boot and RHOAR

### rhoar-sample-circuitbreaker
 <br>
 Example from: https://access.redhat.com/documentation/en-us/red_hat_openshift_application_runtimes/1/html-single/spring_boot_runtime_guide/index
 <br>
 Sample web application with circuit breaker and hystrix dashboard - Spring Boot and RHOAR


## Apache Camel microservices

### camel-sample-service
 Sample Apache Camel route in a spring boot microservice.


## Ansible Playbook


### Docker Release

ansible_playbook/docker_release.yaml

Build a new image from a Dockerfile and release it on a docker registry (tag and push)

usage:

```
ansible-playbook \
-e docker_registry=<url>:<port> \
-e docker_user=***** \
-e docker_password=**** \
-e docker_image=<image_name> \
-e docker_tag=<tag> \
-e dockerfile=<Dockerfile location> \
-e githttpprotocol=<git http/s protocol> \
-e gituser=<git user> \
-e gitpassword=<git password> \
-e gitrepo=<git repository> \
-e gitrepodestinationpath=<git repository> \
-v docker_release.yaml
```

where:<br>
  * docker_registry --> url of the docker registry
  * docker_user --> docker registry user login
  * docker_password --> docker registry password login
  * docker_image --> name of the docker image (e.g. test)
  * docker_tag --> tag of the docker image (e.g. 1)
  * dockerfile --> uri location of Dockerfile
  * githttpprotocol --> git http/s protocol
  * gituser --> git user
  * gitpassword --> git password
  * gitrepo --> git repository
  * gitrepodestinationpath --> directory target where cloning the git repo


### Openshift Release

ocp_importimage_release.yaml

Import an image stream from an external docker registry (e.g. nexus) and create an Openshift application from it.
The application is exposed to external traffic.

usage:

```
ansible-playbook \
-e openshift_master_url=<url> \
-e openshift_cli_command=<oc_client_command> \
-e openshift_user=***** \
-e openshift_password=**** \
-e openshift_namespace=<namespace> \
-e openshift_docker_image=<url>:<port>/<image> \
-e openshift_docker_image_tag=<tag> \
-e openshift_app=<app_name> \
-e openshift_app_replicas=<replicas> \
-v ocp_importimage_release.yaml
```

where:<br>
  * openshift_master_url --> url of the openshift master node (https)
  * openshift_cli_command --> openshift client command (e.g. oc)
  * openshift_user --> openshift user login
  * openshift_password --> openshift password login
  * openshift_namespace --> openshift namespace target (e.g. test)
  * openshift_docker_image --> uri of the docker image in external registry
  * openshift_docker_image_tag --> tag of the docker image in external registry
  * openshift_app --> name of the application in openshift namespace (e.g. test)
  * openshift_app_replicas --> number of pods replicas (e.g. 1)
