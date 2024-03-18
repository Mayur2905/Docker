FROM  mysql:5.7
ENV MYSQL_ROOT_PASSWORD=1234
ENV MYSQL_DATABASE=studentapp
ENV MYSQL_USER=root
ENV MYSQL_PASSWORD=1234
ADD https://github.com/Mayur2905/webapp/blob/main/student.sql /docker-entrypoint-initdb.d
EXPOSE 3306
CMD ["mysqld"]
