FROM centos:7

LABEL Folder="Backend"
LABEL Author="Mayur"

USER root
ADD https://dlcdn.apache.org/tomcat/tomcat-8/v8.5.99/bin/apache-tomcat-8.5.99.tar.gz /opt

RUN tar -xvzf /opt/apache-tomcat-8.5.99.tar.gz -C /opt

RUN yum install java-11-openjdk-devel -y

WORKDIR /opt/apache-tomcat-8.5.99/

COPY /root/webapp/student.war /opt/apache-tomcat-8.5.99/webapps

ADD https://github.com/AnupDudhe/DockerImage_studentapp_threetier/blob/main/Backend/context.xml /opt/apache-tomcat-8.5.99/conf/context.xml

COPY /root/webapp/mysql-connector.jar /opt/apache-tomcat-8.5.99/lib/mysql-connector.jar

EXPOSE 8080

CMD ["/opt/apache-tomcat-8.5.99/bin/catalina.sh", "run"]
