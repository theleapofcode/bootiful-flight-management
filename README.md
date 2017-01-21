# bootiful-flight-management
Spring boot microservice example inspired [Spring microservices] (from https://www.packtpub.com/application-development/spring-microservices) - chapter 2 

## Steps to run

	1. Open project root in terminal Window and run maven build. 
		`mvn clean install -DskipTests`

	2. Start Rabbit MQ. 
		`rabbitmq-server`

	3.Run below commands in separate terminal windows. 

	`java -jar bootiful-flight-fares/target/bootiful-flight-fares-1.0.0.jar`
	`java -jar bootiful-flight-search/target/bootiful-flight-search-1.0.0.jar`
	`java -jar bootiful-flight-checkin/target/bootiful-flight-checkin-1.0.0.jar`
	`java -jar bootiful-flight-book/target/bootiful-flight-book-1.0.0.jar`
	`java -jar bootiful-flight-site/target/bootiful-flight-site-1.0.0.jar`

	4. Open Browser Window at `http://localhost:8001`

	5. When asked for credentials use guest/guest123

	6. Click Search Menu for Search and Booking

	7. Click CheckIn Menu for Checkin

