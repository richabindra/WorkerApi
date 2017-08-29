package org.gradle

import org.gradle.api.Project
import org.gradle.api.Plugin
import org.gradle.api.Task

class GreetingPlugin implements Plugin<Project> {
    void apply(Project target) {
       Task A =  target.task('A', type: GreetingTask1)
       Task B =  target.task('B', type: GreetingTask2)
       Task C =  target.task('C', type: GreetingTask3)

       A.dependsOn B
       A.dependsOn C

    }
}
