# 02-microservices-individual-tasks by Philipp Auinger

WICHTIG: Mit diesem Projekt greife ich auf ein anderes zu! (https://github.com/1920-5bhif-nvs/01-assignment-quarkus-jpa-philippAuinger)
Das Assignment 01, muss laufen, um die richtigen Ergebnisse zu bekommen.

## Erstellen:

```
mvn io.quarkus:quarkus-maven-plugin:0.11.0:create \
        -DprojectGroupId=at.htl.supermarket \
        -DprojectArtifactId=quarkus-microservice-supermarket \
        -DclassName="at.htl.supermarket.SupermarketResource" \
		-Dpath="hello"
```

## Datenbank starten
```
docker run --name supermarket-postgres -p 5432:5432 -e POSTGRES_PASSWORD=passme -d postgres
```

## Starten:
```
mvn package

mvn compile quarkus:dev
```

## Testen:
```
mvn test quarkus:dev
```

## Swagger - UI - Übersicht:
    http://localhost:8181/swagger-ui

### Installiert mit:     
    mvn quarkus:add-extension -Dextensions="openapi"

## Pfade
```
http://localhost:8181/api/product/count
```
```
http://localhost:8181/api/product/avg/quantity
```
```
http://localhost:8181/api/product/avg/price
```

## Curl-Commands
Curl-Grammatik:
```
curl -H"<Header>" <URL>
```
Abfragen ob der Service läuft:
```
curl -H"Accept: application/json" http://localhost:8181/health
```


## Research

### Istio

is a Tool to manage multiple micro services. At a high level,    
Istio helps reduce the complexity of these deployments, and eases the strain on your development teams.    
It is a completely open source service mesh that layers transparently onto existing distributed applications.     

### Prometheus 
 
is a cross-platform event monitoring tool written in Go.
Which allows you to store metrics in a time series database and alert messages if needed. 
It can also contain Grafanda to produce a dashboard

