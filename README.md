# mars

A Rest SpringBoot application to explore Mars.

To build the robot, set up the command: mvn clean install

To run the application, you can run like a SpringBoot application or using the command below:  java -jar target/mars-1.0.jar 

The available commands to explore Mars are: -L (Rotate to Left) -R (Rotate to Right) -M (Move)

To test the mars Robot, you can make a POST request in the URL below with the commands.

Request Example:  curl -s --request POST http://localhost:8080/rest/mars/MMRMMRMM 

Expected response:  (2, 0, S) 

The app also available on Heroku. You can test using:  curl -s --request POST https://marsexplore.herokuapp.com/rest/mars/MMRMMRMM 

Let's explore!
