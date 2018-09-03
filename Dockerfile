FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/plusapp.jar /plusapp/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/plusapp/app.jar"]
