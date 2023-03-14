# Olympiad project

This is the application for get the traffic data and see some statistics.

### Dependence

- Node.js 
- Npm
- Maven
- Java
- Docker
- Docker compose
- Code IDEA (Intelige Idea or any editor)
- 

### How to run the project
- make sure you have installed docker and docker-compose
- `docker-compose up` should run all necessary parts of application

### What you need to do ?
Run the application and implement tasks in ```Task.md``` file


### Structure

```.
├── Dockerfile
├── README.md
├── TASK.md
├── babel.config.json
├── docker-compose.yml
├── init-data.sh
├── jest.config.ts
├── jest.preset.js
├── nx.json
├── package-lock.json
├── package.json
├── packages
│   ├── backend
│   │   ├── Dockerfile
│   │   ├── HELP.md
│   │   ├── README.md
│   │   ├── mvnw
│   │   ├── mvnw.cmd
│   │   ├── pom.xml
│   │   ├── project.json
│   │   └── src
│   │       ├── main
│   │       │   ├── java
│   │       │   │   └── com
│   │       │   │       └── epam
│   │       │   │           └── olympiad
│   │       │   │               └── transportation
│   │       │   │                   ├── TransportationApplication.java
│   │       │   │                   ├── config
│   │       │   │                   │   └── SwaggerConfig.java
│   │       │   │                   ├── controller
│   │       │   │                   │   ├── AddressController.java
│   │       │   │                   │   ├── CsvController.java
│   │       │   │                   │   └── RouteController.java
│   │       │   │                   ├── model
│   │       │   │                   │   ├── AddressRequest.java
│   │       │   │                   │   ├── AddressResponse.java
│   │       │   │                   │   ├── BaseRequestModel.java
│   │       │   │                   │   ├── BaseResponseModel.java
│   │       │   │                   │   ├── RouteRequest.java
│   │       │   │                   │   └── RouteResponse.java
│   │       │   │                   └── service
│   │       │   │                       ├── AddressService.java
│   │       │   │                       ├── BaseService.java
│   │       │   │                       ├── CsvService.java
│   │       │   │                       └── RouteService.java
│   │       │   └── resources
│   │       │       ├── application.properties
│   │       │       ├── csv
│   │       │       │   ├── addresses.csv
│   │       │       │   └── routes.csv
│   │       │       └── db
│   │       │           ├── db-data.sql
│   │       │           └── db-schema.sql
│   │       └── test
│   │           └── java
│   │               └── com
│   │                   └── epam
│   │                       └── olympiad
│   │                           └── transportation
│   │                               ├── TransportationApplicationTests.java
│   │                               └── service
│   │                                   ├── AddressServiceTest.java
│   │                                   └── CityServiceTest.java
│   └── frontend
│       ├── jest.config.js
│       ├── project.json
│       ├── src
│       │   ├── app
│       │   │   ├── app.jsx
│       │   │   ├── app.module.css
│       │   │   ├── app.spec.js
│       │   │   └── nx-welcome.jsx
│       │   ├── assets
│       │   ├── environments
│       │   │   ├── environment.js
│       │   │   └── environment.prod.js
│       │   ├── favicon.ico
│       │   ├── index.html
│       │   ├── main.jsx
│       │   └── styles.css
│       ├── tsconfig.app.json
│       ├── tsconfig.json
│       ├── tsconfig.spec.json
│       └── webpack.config.js
├── tools
│   ├── generators
│   └── tsconfig.tools.json
└── tsconfig.base.json```
