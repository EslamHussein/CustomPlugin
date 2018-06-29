package com.flowsure.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class BumpReadMeVersionPlugin  implements Plugin<Project> {
    @Override
    void apply(Project project) {

        target.task("bumpVersion" , type:BumpVersionTask) {
            readMe = new File(project.rootDir.absolutePath+"/README.md")
            versionName = project.android.defaultConfig.versionName

        }

    }
}
