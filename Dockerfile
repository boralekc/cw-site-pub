FROM ubuntu:latest
RUN mkdir -p /tmp/service
RUN apt-get update
RUN apt install openjdk-17-jdk openjdk-17-jre -y
ADD sw-site-web-1.jar /tmp/service/
CMD ["java", "-jar", "/tmp/service/sw-site-web-1.jar", "some param", "some param"]