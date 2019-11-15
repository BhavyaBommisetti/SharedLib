def call(body){

def issue = [fields: [ project: [key: 'PRJ'],
                       summary: 'New JIRA Created from Jenkins.',
                       description: 'New JIRA Created from Jenkins.',
                       issuetype: [name: 'Bug']]]
def newIssue = jiraNewIssue issue: issue, site: 'jira'
echo newIssue.data.key
}
