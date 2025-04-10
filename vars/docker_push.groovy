def call(String Project,String ImageTag,String dockerhubUser){
  withCredentials([usernamePassword(credentialsId: 'dockerHubCredentials', usernameVariable: 'dockerHubUser', passwordVariable: 'dockerHubPass')]) {
    sh 'docker login -u ${dockerHubUser} -p ${dockerHubPass}'
  {
    
    sh 'docker push ${dockerHubUser}/${Project}:${ImageTag}'
  
}
