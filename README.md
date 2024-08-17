# SparkAppBackend

This project is a small demo as was requested by Spark.

## Setup
To set up this application, you will first need to make sure you have Java installed on your machine. You can find the Java JDK [here](https://www.oracle.com/java/technologies/downloads/).

After that, there are two ways to run this application:

### Using a pre-packaged jar
You can download the pre-packaged jar I compiled from [my CDN](https://storage-api.endoy.dev/static-data/spark-demo-backend.jar).

Once you have downloaded the jar, you can run it by executing the following command in the directory where you downloaded the jar:
```bash
java -jar spark-demo-backend.jar
```

### Using the source code
You can checkout this project by running the following command:
```bash
git clone https://github.com/dieterblancke/spark-app-backend.git
```

You'll need to have Maven installed on your machine to build the project. You can find Maven [here](https://maven.apache.org/download.cgi).

Afterwards, you can run the application by starting it's development server with the following command:
```bash
mvn spring-boot:run
```