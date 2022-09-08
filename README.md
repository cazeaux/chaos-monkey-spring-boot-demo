# Chaos Monkey Spring Boot Demo

A Spring Boot 2 demo using [codecentric's chaos-monkey-spring-demo](https://github.com/codecentric/chaos-monkey-spring-boot)

> The best place on earth is…production!
Josh Long

## Chaos Configuration

See application.yml

## Run

    java -jar your-app.jar --spring.profiles.active=chaos-monkey

## Usage

    curl http://localhost:8080

## Build image

    ./mvnw spring-boot:build-image

To push the image to local kind cluster

    kind load docker-image chaos-monkey-spring-boot-demo:0.0.2 --name my-cluster

## Pre-built image

    docker pull scazeaux/chaos-monkey-spring-boot-demo 
