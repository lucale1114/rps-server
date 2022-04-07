# rps-server

This project is based on the Wildfly Application Server. 

## Technology used

* Java
* Wildfly
* Derby
* Ant

## Environment configuration

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

## Build the server in Eclipsee

* Import project in Eclipse.
* Right click on build.xml file in server and choose run as java application.

## Run the project in Eclipse

* Right click on App.java and run as java application.

# Play the game!
