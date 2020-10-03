properties([
    parameters([
        string(defaultValue: '', description: 'Provide node IP', name: 'node', trim: true)
        ])
    ])

node{
    stage("Pull Repo"){
        git url: 'https://github.com/ceagone/spring-petclinic.git'
    }
