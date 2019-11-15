def call(body){
 def request = libraryResource 'data.json'
 jiraNewIssue(request)
}
