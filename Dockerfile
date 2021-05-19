FROM adoptopenjdk/openjdk11:latest

RUN apt-get update -y && apt-get upgrade -y
RUN apt-get install -y git
RUN mkdir /work
WORKDIR /work