```bash
# MyCustomNacosAuthSecretKeyForProduction
# TXlDdXN0b21OYWNvc0F1dGhTZWNyZXRLZXlGb3JQcm9kdWN0aW9u
docker run --name nacos-standalone \
    -e MODE=standalone \
    -e NACOS_AUTH_TOKEN=TXlDdXN0b21OYWNvc0F1dGhTZWNyZXRLZXlGb3JQcm9kdWN0aW9u \
    -e NACOS_AUTH_IDENTITY_KEY=eiou \
    -e NACOS_AUTH_IDENTITY_VALUE=naris \
    -p 8080:8080 \
    -p 8848:8848 \
    -p 9848:9848 \
    -d nacos/nacos-server:v2.5.2

```