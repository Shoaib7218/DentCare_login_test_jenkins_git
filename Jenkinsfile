pipeline {
    agent any

    tools {
        maven 'Maven_mvn'
        jdk 'Java_jdk_21'
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/Shoaib7218/DentCare_login_test_jenkins_git.git'
            }
        }

        stage('Run Tests') {
            steps {
                bat 'mvn clean test'
            }
        }
    }

    post {
        always {
            junit '**/target/surefire-reports/*.xml'
        }
    }
}