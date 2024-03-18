FROM ubuntu:latest

LABEL Folder="Nodejs-App"
LABEL Author="Mayur"

RUN apt-get update -y
RUN apt-get install -y nodejs
RUN apt-get install -y npm

COPY . .

RUN npm install

EXPOSE 3000

CMD ["node", "app.js"]