FROM httpd:2.4.58-alpine

LABEL httpd="latest"

RUN echo "Hello World thsiis from httpd:alpine container $HOSTNAME" > /usr/local/apache2/htdocs/index.html

EXPOSE 80

CMD [ "httpd" , "-DFORGROUND" ]
