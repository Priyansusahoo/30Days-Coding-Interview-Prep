# 13-Day TASKS:
- Solved coding question from Leetcode and GFG.


- Stared DevOps Project
  - Real-Time Kubernetes DevOps Project :
    - Created 3 EC2 instances.
    - 2 EC2 instances of type t2.micro, 10GB(free-tier).
    - 1 EC2 instance of type t2.medium, 8GB(paid).
    - Setup Jenkins in 1st EC2 instance.
    - Setup Ansible, Python in 2nd EC2 instance.
    - Setup Docker, kubectl, minikube in EC2 instance(t2.medium).
    - NOTE :
      - t2.medium required cause minikube created image which require 2 cores while running.