# Mars - REST SpringBoot 

This application controls a robot on Mars

The application is in: <code>https://github.com/ElisonSouza/mars<code>

# Build the robot:
# <code>mvn clean install</code>

# Run the application: 
Ps.: run like a SpringBoot application or using the command below:

<code>java -jar target/mars-1.0.0.jar<code>

# Commands to explore Mars are:
-L (Rotation to Left)
-R (Rotation to Right)
-M (Move)

# Test the mars Robot:

Example: 
<code>curl -s --request http://localhost:8080/rest/mars/MML</code>
Response:
<code>(0, 2, W)</code>