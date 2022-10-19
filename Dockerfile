FROM openjdk:8
EXPOSE 8888
ADD target/springboot-github-pipeline.jar
ENTRYPOINT ["java","-jar","/springboot-github-pipeline.jar"]
