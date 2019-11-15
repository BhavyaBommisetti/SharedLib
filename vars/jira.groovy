def call(body){
  DefaultHttpClient client = new DefaultHttpClient();
			
HttpGet getRequest = new HttpGet(url + "rest/auth/latest/session");
getRequest.addHeader("Authorization", "Basic " + userToken);
getRequest.addHeader("accept", "application/json");
HttpResponse getResponse = client.execute(getRequest);

HttpPost postRequest = new HttpPost(http://jira1320.atlassian.net);
def issue = [fields: [ project: [key: 'PRJ'],
                       summary: 'New JIRA Created from Jenkins.',
                       description: 'New JIRA Created from Jenkins.',
                       issuetype: [name: 'Bug']]]
def newIssue = jiraNewIssue issue: issue, site: 'jira'
echo newIssue.data.key
}
