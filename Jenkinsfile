node {
   // def mvnHome = tool 'm3.6.3'
   def mvnHome = tool 'Maven_3.3.9'
    
    stage('Git Checkout') {
        cleanWs()
        git branch: 'ci-cd', 
        url: 'https://github.com/SantoshNGitHub/student-services'
    }
    stage('Build') {
       withEnv(["MVN_HOME=$mvnHome"]) {
             sh '"$MVN_HOME/bin/mvn" clean package'
       } 
    }
}
      