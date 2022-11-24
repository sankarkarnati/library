def  newDownload(repo)
{
  git  "https://github.com/sankarkarnati/${repo}"
}

def newBuild()
{
  sh 'mvn package'  
}
