FROM phpmyadmin

LABEL phpmyadmin="latest"

ADD source dest

ADD https://github.com/jonastaedcke/prjct.git .


EXPOSE 80

CMD ["phpmyadmin" , "-DFOREGROUND"]