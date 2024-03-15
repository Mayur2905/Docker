# Running Nginx with nginx:1.25.4-alpine Docker Container

This README provides instructions on how to execute the code using the nginx:1.25.4-alpine Docker container. This setup will launch an Nginx server displaying a "Welcome" message.

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
    docker build -t my-nginx-server .
    ```

4. **Run the Docker Container:**

    ```bash
    docker run -d -p 8080:80 --name my-nginx-container my-nginx-server
    ```

    - The `-d` flag runs the container in detached mode.
    - The `-p 8080:80` flag maps port 80 inside the container to port 8080 on your local machine.
    - `--name my-nginx-container` assigns a custom name to the container.

5. **Access the Nginx Server:**

    Open a web browser and go to `http://localhost:8080` to view the "Welcome" message served by the Nginx server.

6. **Stop and Remove the Container (Optional):**

    If you want to stop and remove the container, use the following commands:

    ```bash
    docker stop my-nginx-container
    docker rm my-nginx-container
    ```
