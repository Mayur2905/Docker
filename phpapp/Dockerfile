FROM phpmyadmin

LABEL phpmyadmin="latest"

ADD source dest

ADD https://github.com/jonastaedcke/prjct.git /var/www/html/

WORKDIR /var/www/html/

RUN cp -r /var/www/html/prjct/* .

EXPOSE 80

CMD ["phpmyadmin" , "-DFOREGROUND"]