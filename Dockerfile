FROM java:11
EXPOSE 8080
ADD /target/blackjack-0.0.0.jar blackjack-0.0.0.jar
ENTRYPOINT ["java","-jar","blackjack-0.0.0.jar"]