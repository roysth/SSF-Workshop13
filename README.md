Run spring boot app

```
mvn spring-boot:run -Dspring-boot.run.arguments=--dataDir=C:/Users/Public/data

**For WINDOWS, have to create in the Public folder. Cannot create anything outside.
It is a system thing

this is just a place to store the data. Dont need to be in this folder

if got space, need to add in " " 
for example: mvn spring-boot:run -Dspring-boot.run.arguments=--dataDir="C:/Users/data"
```

Incorporate test started dependencies

```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-test</artifactId>
    <version>2.7.1</version>
    <scope>test</scope>
</dependency>

```

* In order to execute test cases

```
mvn test
```

```
mvn package
```