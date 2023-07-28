pipeline{
	agent any
	environment {
		DOCKERHUB_PASS = "Shrithika"
	}
	stages{
		stage("Generating Build SWE645 student survey"){
			steps{
				script{
					checkout scm
					sh 'rm -rf *.war'
					sh 'jar -cvf form-0.0.1-SNAPSHOT.jar .'
					sh  "echo '${DOCKERHUB_PASS}' | docker login -u shrithika --password-stdin"
					sh 'docker build -t shrithika/homework3:0.0.1 .'
				}
			}
		}
		stage("Pushing image to docker"){
			steps{
				script{
					sh 'docker push shrithika/homework3:0.0.1'
				}
			}
		}
		stage("Deploying to rancher"){
			steps{
				script{
				
					sh 'kubectl rollout restart deploy d1 -n default'
				}
			}
		}
	}
}
