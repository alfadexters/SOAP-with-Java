# SOAP Hello World Service

A basic SOAP web service implementation using Java and Maven. This service provides a simple "Hello World" operation that demonstrates the fundamental concepts of SOAP architecture.

## Prerequisites

- Java JDK 8 or higher
- Maven 3.6.0 or higher
- Java IDE (Eclipse, NetBeans, IntelliJ IDEA)
- SoapUI (optional, for testing)

## Project Structure

```
Project-Soap/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── mycompany/
│                   └── project/
│                       └── soap/
│                           ├── HelloWorldService.java
│                           └── HelloWorldPublisher.java
└── pom.xml
```

## Setup

1. Clone the repository:
```bash
git clone https://github.com/alfadexters/SOAP-with-Java.git
cd SOAP-with-Java
```

2. Ensure dependencies in `pom.xml` are properly configured:
```xml

    
        com.sun.xml.ws
        jaxws-rt
        2.3.5
    

```

## Main Components

### HelloWorldService.java
- Main SOAP service class
- Annotated with `@WebService`
- Provides the `greet` method that accepts a name and returns a greeting

### HelloWorldPublisher.java
- Class for publishing the web service
- Sets up the endpoint at `http://localhost:8080/HelloWorldService`
- Starts a lightweight HTTP server to serve the WSDL

## Usage

1. Build the project:
```bash
mvn clean install
```

2. Run the service:
- Execute the `HelloWorldPublisher` class
- Or from command line:
```bash
mvn exec:java -Dexec.mainClass="com.mycompany.project.soap.HelloWorldPublisher"
```

3. Verify service availability:
- Open a web browser
- Visit: `http://localhost:8080/HelloWorldService?wsdl`
- You should see the service's WSDL document

## Testing

### Using SoapUI
1. Create new SOAP project in SoapUI
2. Use WSDL URL: `http://localhost:8080/HelloWorldService?wsdl`
3. Generate a test request for the "greet" operation
4. Modify the request XML:
```xml

   
   
      
         Richard
      
   

```

### Expected Response Format
```xml

   
      
         Hello, Richard!
      
   

```

## Features

- Basic SOAP implementation
- JAX-WS usage for web services
- Automatic WSDL generation
- XML messaging support
- Simple greeting operation

## Troubleshooting

1. If service won't start:
   - Verify port 8080 is available
   - Check Java and Maven installation
   - Review dependencies in pom.xml

2. If WSDL is not accessible:
   - Confirm service is running
   - Verify service URL
   - Check firewall settings
