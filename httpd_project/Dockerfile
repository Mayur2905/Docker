FROM centos:7

# Label

LABEL Author="Mayur"

# Install httpd
RUN yum install httpd -y

# Install unzip
RUN yum install unzip -y
# Remove the files
RUN rm -rf /var/www/html/*
# Copy the files
ADD  https://www.free-css.com/assets/files/free-css-templates/download/page292/yogast.zip  /var/www/html/

WORKDIR /var/www/html/

# Unzip the files
RUN unzip yogast.zip

RUN mv yogast-html/* .

EXPOSE 80
# Start the httpd service

CMD httpd -DFOREGROUND
