FROM node:alpine

LABEL Folder="Nodejs-App"
LABEL Author="Mayur"


COPY ./ ./

RUN npm install

RUN npm start 

EXPOSE 3000

CMD ["node" ,"app.js"]