## Package 

```bash
mvn package
```

## Build sample docker image

```bash
docker-compose up --build
```

### Connecting to db

```bash
docker exec -it trino trino
trino> use hsqldb.public;
USE
trino:public> create table prueba (id int);
CREATE TABLE
trino:public> select * from prueba;
 id 
----
(0 rows)
```