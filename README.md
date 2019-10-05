# 02-microservices-individual-tasks by Philipp Auinger

## Erstellt mit:

```
	mvn io.quarkus:quarkus-maven-plugin:0.11.0:create \
           -DprojectGroupId=at.htl.supermarket \
           -DprojectArtifactId=quarkus-microservice-supermarket \
           -DclassName="at.htl.supermarket.SupermarketResource" \
		   -Dpath="hello"
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
