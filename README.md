# Kubernetes Full Stack Application

This Application should give an overview about a sample application based on mySQL, Python, Java and Angular.
The Application can run without any containers directly on the local machine, only with Docker and of cource with Kubenetes.

#### Purpose
With this application we can show the self healing setup from Kubernetes.
Each generator Pod produces a random number with and sends as well the unique Id from the producer application.

The number of generated Ids will be counted and saved in a Database. based on this we see a graph with how many numbers each pod already generated.

If we delete a generator pod we will see how Kubernetes creates a new Pod and a new line appears on our graph.

## Docker Images
Docker Images are pre-build and accessible from this registry: https://hub.docker.com/u/toky03.

## Source files
The Source files are in the folder Applikationen. 

## Complete Instruction
The full instruction can be found under build in the file kubernetes-full-stack.pdf.

