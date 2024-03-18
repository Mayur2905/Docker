FROM node

LABEL Folder="Node-Js"
LABEL Author = "Mayur"

WORKDIR /app

COPY . .

RUN npm install

RUN npm run database

RUN npm start

EXPOSE 3000
