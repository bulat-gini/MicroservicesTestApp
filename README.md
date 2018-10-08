# MicroservicesTestApp

Test microservices application

Includes:
- CatService - on request download images with cats from *The Cat API* and return it
- CountriesService - on request download country's flag from the *REST Countries API* and return it
- UsersInfoService - on request return combined data from CatService and ContriesService
- ServiceRegistry - *Eureka* Service Registry app, wich, obviously, registers all the rest services
- GatewayService - *Zuul* Gateway API application, gateway for other services' apis
- LoggingService - combine and collect logs from all the rest services using *Kafka*
- *Kafka* - for services communication

Application works in Docker.
______________
For running
1. Build maven projects using **`maven_build.sh`** script
2. Run `docker-compose up`
