# Three Tier Application Deployment with Docker

This repository contains Dockerfiles and necessary files to deploy a three-tier application consisting of a backend, frontend, and database components using Docker containers.

## Directory Structure
```
Docker/
│
├── Three_Teir/
│   ├── Backend/
│   │   └── Dockerfile
│   │
│   ├── Frontend/
│   │   └── Dockerfile
│   │   └── index.html
│   │
│   └── database/
│       └── Dockerfile
│       └── student.sql
```
## Components
### Backend

The backend component is based on Apache Tomcat running on CentOS 7. It includes:

- Installation of Java 11
- Deployment of a WAR file (student.war)
- Configuration of Tomcat context (context.xml)
- Addition of MySQL JDBC connector
  
### Frontend
The frontend component is a basic CentOS 7 image with Apache HTTP server installed. It serves a simple HTML page (index.html) at port 80.

### Database
The database component is based on MySQL latest image. It initializes a MySQL database using a provided SQL script (student.sql), setting up necessary schemas and tables. Configuration options such as database name, user credentials, and passwords can be passed through environment variables during container initialization.

## Usage
1. Clone this repository:

```
git clone <repository_url>
```
2. Build Docker images for each component:

```
cd Docker/Three_Teir/Backend/
docker build -t backend .

cd ../../Frontend/
docker build -t frontend .

cd ../../database/
docker build -t database .
```

3. Run Docker containers:

```
docker run -d --name backend backend
docker run -d --name frontend -p 80:80 frontend
docker run -d --name database -e MYSQL_DATABASE=<database_name> -e MYSQL_USER=<username> -e MYSQL_PASSWORD=<password> -e MYSQL_ROOT_PASSWORD=<root_password> database
```
Replace **<database_name>**, **<username>**, **<password>**, and **<root_password>** with your desired values.

4. Access the frontend application in your browser:

```
http://localhost
```

## Author
- Mayur

Make sure to replace **<repository_url>** with the actual URL of your GitHub repository. This README provides a brief overview of the project structure and instructions on how to build and run the Docker containers. Adjustments may be needed based on your specific requirements and environment.
