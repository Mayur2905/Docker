FROM centos:7
LABEL Folder="Frontend"
LABEL Author="Mayur"

RUN yum install httpd -y


ADD index.html /var/www/html/index.html

EXPOSE 80

CMD ["httpd" "-DFORGROUND"]


