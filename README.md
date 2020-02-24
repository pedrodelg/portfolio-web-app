# portfolio-web-app

Part I

Steps to get the application up and running

Step 1:

Open the comand line interface

Step 2:
Move to the portfoliodemo comand line demo directory, now you just package this up by using the mvnw package command

./mvnw package

this will actually create a JAR file for our application, and if you are using microsoft windows simply just use mvnw package without the dot forward slash

mvnw package

and this jar file is created in the target sub-directory 

Eventually at the end you'll build succes and it created the jar file for us

Step 3: Run app using_ java -jar

- Move to target sub-directory, now you can run the jar by saying java -jar portfoliodemo-0.0.1-SNAPSHOT.jar, and then it should actually start running our given application.

So let's kind of swing over to postman, select get method write the url: http://localhost:8081/api/portfolio/{idportfolio}
and replace {idportfolio} to the idportdolio you want rea

If you want to update a register, go to postman; select put method write this url: http://localhost:8081/api/portfolio and copy the request:

{
    "idPortfolio": 6,
    "description": "Tyrion is the second son and youngest child of Lord Tywin Lannister of Casterly Rock1",
    "imageUrl": "https://cde.laprensa.e3.pe/ima/0/0/2/1/9/219077.jpg",
    "twitterUserName": "@tyrion",
    "title": "Tyrion Lannister",
    "idPortfolioKey": 0
}

you have to replace all the data that you need

*** Software prerequisites, you should have hava jdk 8 and maven installed in your computer.

*** Tecnologies used ****

Spring, springboot, srping MVC, hibernate

***** Total time ***

4 hours


