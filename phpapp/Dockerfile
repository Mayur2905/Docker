FROM ubuntu:latest

LABEL maintainer="Mayur"

RUN apt-get update -y
RUN apt-get install -y apache2
RUN apt-get install -y git
RUN apt-get install -y php
RUN apt-get install -y libapache2-mod-php
RUN apt-get install -y php-mysql
RUN apt-get install -y php-mbstring


WORKDIR /var/www/html

RUN git pull https://github.com/jonastaedcke/prjct.git .


EXPOSE 80

CMD ["apachectl", "-D", "FOREGROUND"]



FROM python:3.8

LABEL Folder="FlaskApp"
LABEL Author="Mayur"

COPY  . .

RUN pip install -r requirements.txt

EXPOSE 5000

CMD ["flask" ,"run" ,"--host","0.0.0.0"]



FROM node:12

LABEL Folder="ReactApp"
LABEL Author="Mayur"

COPY  . .

RUN npm install

EXPOSE 3000

CMD ["npm" ,"start"]


FROM tomcat:8.0
ADD ./target/*.war /usr/local/tomcat/webapps/
EXPOSE 8080
WORKDIR /usr/local/tomcat/bin
CMD ["catalina.sh", "run"]