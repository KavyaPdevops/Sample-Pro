job('Sample'){
scm{
git('https://github.com/KavyaPdevops/job1.git')
}
triggers{
scm('H/5 * * * *')
}
steps{
batchFile('npm install')
}
}