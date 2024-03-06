FROM eclipse-temurin:17
COPY target/dsp.jar webapp.jar
CMD [ "java","-jar","webapp.jar" ]