# Three Tier Application Deployment with Docker-Compose

## Introduction
This repository contains configuration files for setting up a multi-container application environment using Docker Compose. The setup includes three services: a database service (`databaseimg`), a backend service (`backendimg`), and a frontend service (`frontendimg`).

## Prerequisites
- Docker
- Docker Compose

## Setup Instructions
1. Clone this repository to your local machine.
2. Navigate to the directory containing the `docker-compose.yml` file.
3. Ensure that Docker and Docker Compose are installed and running on your system.
4. Run the following command to start the services:
   
    ```
    docker-compose up -d
    ```
6. Once the services are up and running, you can access the frontend application at `http://localhost`.

## Configuration Details
### Networks
- A bridge network named `mynetwork` is defined to facilitate communication between the services.

### Volumes
- Three volumes are defined:
  1. `newvolume1` for storing MySQL database data.
  2. `newvolume2` for storing data related to the backend service.
  3. `newvolume3` for storing frontend application files.

### Services
1. **databaseimg**
   - Image: `./database`
   - Environment Variables:
     - `MYSQL_ROOT_PASSWORD`: "1234"
     - `MYSQL_DATABASE`: "studentapp"
     - `MYSQL_USER`: "mayur"
     - `MYSQL_PASSWORD`: "1234"
   - Ports: `3306:3306`
   - Networks: `mynetwork`
   - Volumes: `newvolume1:/var/lib/mysql`

2. **backendimg**
   - Image: `./Backend`
   - Ports: `8080:8080`
   - Depends On: `databaseimg`
   - Networks: `mynetwork`
   - Volumes: `newvolume2:/opt/apache-tomcat-8.5.99`

3. **frontendimg**
   - Image: `./Frontend`
   - Ports: `80:80`
   - Depends On: `backendimg`
   - Networks: `mynetwork`
   - Volumes: `newvolume3:/var/www/html`

## Notes
- Ensure that the necessary Docker images are available locally or are built from the provided Dockerfiles before running the `docker-compose up` command.
- Modify the environment variables, ports, and other configurations as per your requirements.
- to run the project change the ip address in ```Backend/context.xml``` file add the ip of the your instance/vm. also change the ip address in ```Froentend/index.html``` also add ip of your instance/vm.
