FROM lolhens/baseimage-openjre
ADD target/orderApp.jar orderApp.jar
EXPOSE 80
ENTRYPOINT ["java", "-jar", "orderApp.jar"]