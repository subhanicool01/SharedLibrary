class k8s {
  def jenkins 
  k8s (jenkins) {
       this.jenkins = jenkins
  }

  def auth_login () {
    jenkins.sh """#!/bin/bash
    echo "entering into kubernetes gke cluster"
    gcloud config set account <service-account-name>
    gcloud auth activate-service-account <service-account-name>
    """
  }
}
