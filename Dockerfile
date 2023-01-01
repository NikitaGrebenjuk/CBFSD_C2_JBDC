#stage 1
FROM tomcat:11.0.0-jdk17
# another comment
# Copy the WAR file to the webapps directory
COPY target/*.war /usr/local/tomcat/webapps/
env PATH=$PATH:/usr/local/tomcat

# Start Tomcat
#CMD ["catalina.sh", "run"]