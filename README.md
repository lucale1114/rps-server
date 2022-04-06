# rps-server

This project is based on the Wildfly Application Server. 

## Technology used

* Java
* Wildfly
* Derby
* Ant

## Environment configuration

* Install Wildfly
* Find the standalone deployment directory 
* clone this project
* Change the property "server-dist" in server/build.xml to the standalone deployment directory

## Steps to build the project 

### build the server

* cd server
* ant BuildAll

### build the client

* cd client
* ant BuildAll

# Run the client

* ant run

# Play the game!
