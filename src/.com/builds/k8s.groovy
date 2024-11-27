class k8s {
  def jenkins 
  k8s (jenkins) {
       this.jenkins = jenkins
  }

  def auth_login (gke_cluster_name, gke_zone, gke_project_name) {
    jenkins.sh """#!/bin/bash
    echo "entering into kubernetes gke cluster"
    gcloud config set account <service-account-name>
    #gcloud auth activate-service-account <service-account-name>
    gcloud container cluster get-credentials $gke_cluster_name --zone $gke_zone --project $gke_project_name
    """
  }

  def k8sdeploy() {
    jenkins.sh """#!/bin/bash
    
    """
  }
}
