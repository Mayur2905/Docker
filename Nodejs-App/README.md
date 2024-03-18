# NodeJs Application Using Docker File

## Introduction : 
This document provides a guide for implementing a Docker container for the Node.js Chat App using the provided Dockerfile. The Dockerfile defines the environment and dependencies required to run the application within a Docker container.
Prerequisites:
Docker installed on the host machine.
Internet connectivity to download dependencies during the Docker build process.

**Step 1:**
Login to AWS Console. Start your docker instance.
Connect the aws docker instance.
**Step 2:**
In docker instance create a project directory. E.g. NodeJS_APP

```
mkdir NodeJS_APP
ls
``` 

**Step 3:**
Create Dockerfile inside the project directory.
```
# cd NodeJS_APP/
# vim Dockerfile

```







**Step 4 :**
Paste the following content inside the Dockerfile

```
FROM ubuntu:latest
LABEL app="nodejs"
LABEL Author="Mayur"


RUN  apt update
RUN  apt install nodejs npm -y


RUN git clone https://github.com/owanhunte/nodejs-chat-app.git


WORKDIR nodejs-chat-app


RUN npm install


EXPOSE 3000


CMD [ "npm", "start" ]

```
**Step 5 :**
Create a docker image using docker build.
```
# docker build .

```



**Step 6 :**
List the images using
```
# docker images
```


**Step 7 :**
Create a container using the created image.
```
docker run -d -p 3000:3000 <image id>
```
Eg. 
```
# docker run -d -p 3000:3000 e53
```

**Step 8:**
Check the application 
http://<ip>:3000

In my case it is: **http://18.224.67.18:3000/**



