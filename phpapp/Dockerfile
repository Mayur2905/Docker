FROM phpmyadmin

LABEL phpmyadmin="latest"

RUN wget https://github.com/jonastaedcke/prjct.git

RUN mv prjct/* /var/www/html

EXPOSE 80

CMD ["phpmyadmin" , "-DFOREGROUND"]