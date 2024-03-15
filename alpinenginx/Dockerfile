FROM nginx:1.25.4-alpine

LABEL nginx="alpine"

RUN echo "Welcome to Nginx this is from alpine container $HOSTNAME" > /usr/share/nginx/html/index.html

EXPOSE  80

CMD ["nginx", "-g", "daemon off;"]

