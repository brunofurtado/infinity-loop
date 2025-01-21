# Use an OpenJDK base image
FROM registry.redhat.io/ubi9/openjdk-21-runtime:1.21-1.1733995527

# Set the working directory inside the container
WORKDIR /home/default

# Copy the compiled Java class into the container
COPY HighCPULoadApp.jar /home/default/

# Command to run the Java application
CMD ["java", "-jar", "HighCPULoadApp.jar"]
