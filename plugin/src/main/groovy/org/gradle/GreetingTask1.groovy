package org.gradle

import org.gradle.api.DefaultTask
//import org.gradle.api.SourceTask
import org.gradle.api.tasks.TaskAction
import org.gradle.api.tasks.OutputDirectory
import org.gradle.workers.WorkerExecutor
import javax.inject.Inject
import org.gradle.process.ExecResult
import org.gradle.process.JavaExecSpec
import org.gradle.api.Action
import org.gradle.api.GradleException
import javax.inject.Inject
import org.gradle.workers.WorkerConfiguration

class GreetingTask1 extends DefaultTask {
    @TaskAction
    def greet() {
        try {
            project.exec {
                workingDir '.'
                standardOutput = new ByteArrayOutputStream()
                commandLine 'echo', 'Hello world!'
                1.upto(50) {
                    Thread.sleep(100)
                    println "Test HACK ${it}"
                }

            }
        }
        // })
        catch (Exception e) {
            System.err.println("Error while executing task:"+e.toString())
            throw e
        }
    }
}
