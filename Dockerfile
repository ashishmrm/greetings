FROM payara/micro
COPY greetings.war /opt/payara/deployments/
CMD java -jar payara-micro.jar --deploymentDir deployments
