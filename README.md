# rps-server

This project is based on the Wildfly Application Server. 

## Technology used

* Java
* Wildfly
* Derby
* Ant

## Environment configuration
* Install ant.
* Download and install Wildfly, you should have jdk 8 or 11 for compatibility for wildfly. 
* Create a user by using add-user command from bin directory
  * Give name and password to the user
  * Add the user to the management realm.
  * Respond no when asked if the user user should be used to connect to another AS process.
* Start the server.
* Find the standalone deployment directory
* clone this project
* Change the property "server-dist" in server/build.xml to the standalone deployment directory

## Steps to build the project 

### Build the server in Eclipse

* Import project in Eclipse.
* Right click on build.xml file in server and choose run as java application.

### Build the server in command line

* cd server
* ant BuildAll
* cd ..
* cd client
* ant BuildAll


## Run the project in Eclipse

* Right click on App.java and run as java application.

## Run the project from the command line

* cd client
* ant BuildAll
* ant run


# Play the game!