# Spring Reactive
>Backend Example Reactive Rest API with Spring Boot, Webflux, MongoDB and Spring Reactive Security
 
## Stack
- Spring Boot
- MongoDB

## Run Project

### 1. Create MongoDB Database
Create MongoDB Database with name : `spring`

### 2. Run in console
``` bash
$ ./gradlew bootRun
```
This application will run in `localhost:8080`.

### 3. Login
Login with username `admin` and password `123`

## Endpoint 
1. Get All Person
`localhost:8080/person/all`.
method  : GET.
This endpoint will send all person from database.
2. Post Person
`localhost:8080/person/add`
method  : POST
This endpoint will post person with json like :
```json
{
	"name":"hafidz"
}
```