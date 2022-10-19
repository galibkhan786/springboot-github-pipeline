FROM openjdk:8
EXPOSE 8888
ADD target/springboot-images-new.jar springboot-images-new.jar
ENTRYPOINT ["java","-jar","/springboot-images-new.jar"]
