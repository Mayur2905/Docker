# Running HTTP Server with httpd:2.4.58-alpine Docker Container

This README provides instructions on how to execute the code using the httpd:2.4.58-alpine Docker container. This setup will launch a basic HTTP server displaying a "Hello World" message.

## Prerequisites

- Docker installed on your system.

## Instructions

1. **Clone the Repository:**

    ```bash
    git clone <repository-url>
    ```

2. **Navigate to the Directory:**

    ```bash
    cd <repository-directory>
    ```

3. **Build the Docker Image:**

    ```bash
    docker build -t my-httpd-server .
    ```

4. **Run the Docker Container:**

    ```bash
    docker run -d -p 8080:80 --name my-httpd-container my-httpd-server
    ```

    - The `-d` flag runs the container in detached mode.
    - The `-p 8080:80` flag maps port 80 inside the container to port 8080 on your local machine.
    - `--name my-httpd-container` assigns a custom name to the container.

5. **Access the HTTP Server:**

    Open a web browser and go to `http://localhost:8080` to view the "Hello World" message served by the HTTP server.

6. **Stop and Remove the Container (Optional):**

    If you want to stop and remove the container, use the following commands:

    ```bash
    docker stop my-httpd-container
    docker rm my-httpd-container
    ```
