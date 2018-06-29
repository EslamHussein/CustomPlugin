package com.flowsure.plugin

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class BumpVersionTask extends DefaultTask {

    def readMe
    def versionName

    File getReadMe() {
        project.file(readMe)
    }

    BumpVersionTask() {

        group = 'pluginBasics'
    }


    @TaskAction
    def bump() {

        description = 'update android version in readme file ;)'

        File readme = getReadMe()
        String contents = readme.getText("UTF-8")
        contents = contents.replaceAll("pluginBasics:.*", "pluginBasics:${versionName}")

        readme.write(contents, "UTF-8")

    }
}
