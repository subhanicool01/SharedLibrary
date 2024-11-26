package com.builds

class Docker {  // class name
    def jenkins
    Docker(jenkins) {
        this.jenkins = jenkins
    }

    // now we added the actual methods 

    def buildApp () {
        //shared library formate
        jenkins.sh """#!/bin/bash                 
        echo "Building the Eureka Application"
        sh "mvn clean package -DskipTests=True"
        echo "Build is done"
        """
    }
}


// Now These is method defining
// And these is source folder, source folder having olny method
// actual code is having on "VARS" folder
