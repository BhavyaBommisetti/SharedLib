def call(body){

def issue = [fields: [ project: [key: 'PRO'],
                       summary: 'BUG created',
                       description: 'jira bug',
                       issuetype: [name: 'Bug']]]
def newIssue = jiraNewIssue issue: issue, site: 'jira'
echo newIssue.data.key
}
