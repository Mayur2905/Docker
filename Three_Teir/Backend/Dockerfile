FROM  mysql:lastest
ENV MYSQL_ROOT_PASSWORD=1234
ENV MYSQL_DATABASE=studentapp
ENV MYSQL_USER=root
ENV MYSQL_PASSWORD=1234
ADD ./webapp/student.sql /docker-entrypoint-initdb.d
EXPOSE 3306