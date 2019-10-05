# 02-microservices-individual-tasks by Philipp Auinger

## Erstellen:

```
mvn io.quarkus:quarkus-maven-plugin:0.11.0:create \
        -DprojectGroupId=at.htl.supermarket \
        -DprojectArtifactId=quarkus-microservice-supermarket \
        -DclassName="at.htl.supermarket.SupermarketResource" \
		-Dpath="hello"
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

