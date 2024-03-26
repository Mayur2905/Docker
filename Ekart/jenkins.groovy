pipeline{
    agent{
        label 'agent1'
    }
    tools{
        jdk 'openjdk11'
        maven 'Maven'

    }
    stages{
        stage('Git Checkout'){
            steps{
                git branch: 'main', url: 'https://github.com/Mayur2905/Ekart_For_MG.git'
            }
        }
        stage('COMPILE'){
            steps{
                sh 'mvn clean compile -DskipTests=true'
            }
        }
        stage('OWASP DEPENDENCY CHECK'){
            steps{
                dependencyCheck additionalArguments: '--scan ./ ', odcInstallation: 'DP'
                dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
            }
        }
        stage('UNIT TESTING'){
            steps{
                sh 'mvn clean package -DskipTests=true'
            }
        }
        stage('BUILD'){
            steps{
                script{
                    withDockerRegistry(credentialsId: '77568') {
                        sh "docker build -t mayurgg7756/ekart:${BUILD_NUMBER} ."
                        sh "docker push mayurgg7756/ekart:${BUILD_NUMBER}"
                    }
                }
            }
        }
        stage('Deploy'){
            steps{
                script{
                    withDockerRegistry(credentialsId: '77568') {
                        sh "docker run -d --name ekart -p 8080:8070 mayurgg7756/ekart:${BUILD_NUMBER}"
                    }
                }
            }
        }
        

    }
}
