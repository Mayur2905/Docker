# Jenkins Pipeline for Ekart Application
This Jenkins pipeline automates the build, test, and deployment process for the Ekart application.

## Prerequisites
- Jenkins installed and configured
- Docker installed on Jenkins server
- Jenkins credentials for Docker registry (77568)
## Steps to Implement
 1. ### Add Tools in Jenkins
    - Go to Jenkins dashboard and navigate to ```Manage Jenkins > Global Tool Configuration```.
    - Add JDK and Maven installations:
        - JDK:
            - Name: **openjdk11**
            - Install automatically
        - Maven:
            - Name: **Maven**
            - Install automatically

2. ### Create Jenkins Pipeline
    - Go to Jenkins dashboard and create a new pipeline job.
    - Paste the provided pipeline script into the pipeline script section.

3. ### Add Node 
    -  To run the pipeline on a specific node, modify the agent section in the pipeline script to specify the label of the node.
    
4. ### Run the Pipeline
    - Trigger the pipeline manually or configure it to run automatically on SCM changes

## Pipeline Description

1. **Configure Tools in Jenkins**
    - Configure the JDK tool in Jenkins and name it 'openjdk11'.
    - Configure the Maven tool in Jenkins and name it 'Maven'.

2. **Create Docker Registry Credentials**
    - In Jenkins, navigate to ```Manage Jenkins > Manage Credentials > Jenkins > Global credentials``` and add a new credential for Docker registry with ID '77568'.

3. **Git Checkout Stage**
    - This stage checks out the main branch of the Ekart application repository.

4.  **Compile Stage**
    - This stage compiles the Ekart application using Maven, skipping tests.

5.  **OWASP Dependency Check Stage**
    - This stage performs a security vulnerability check on the application's dependencies using OWASP Dependency Check.
6. **Unit Testing Stage**
    - This stage runs unit tests for the application, skipping the integration tests.
7. **Build Stage**
    - This stage builds a Docker image for the Ekart application and pushes it to the Docker registry.
8. **Deploy Stage**
   - This stage deploys the Ekart application by running a Docker container with the built image.
## Author
   - Mayur Gaikwad
