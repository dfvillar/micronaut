FROM openjdk:14-alpine
COPY build/libs/enigma-all.jar enigma.jar
EXPOSE 8886 8886
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "enigma.jar"]
