# spring-cloud-config-client

## Usage:

```
curl http://localhost:8080/whatsup
```

To refresh configs:

```
curl -X POST localhost:8080/actuator/refresh -d {} -H "Content-Type: application/json"
```

See [Config server] (https://github.com/ederwyk/spring-cloud-config-server)
See [Config files] (https://github.com/ederwyk/spring-cloud-config-storage)
