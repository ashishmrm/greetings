FROM payara/micro
COPY greetings.war /opt/payara/deployments/
CMD java -jar payara-micro.jar --port 8085 --deploymentDir deployments
