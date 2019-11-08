- get a token 
`curl -X POST "http://localhost:8080/authenticate" -H "accept: application/json" -H "Content-Type: application/json" -d '{"password":"admin","username":"admin"}'`

- get different rest url
`curl http://localhost:8080/hello -H "Authorization: Bearer $token"` 