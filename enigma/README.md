# Enigma App

Simple app with Micronaut that gives you a wise advice


## Development instructions

Execute gradle build
```
./gradlew build
```

Access to the service
```
http://localhost:8886/enigma/advice/{your-name}
```

```json
{
  "name": "Peter",
  "advice": "I feel so miserable without you, it’s almost like having you here."
}
```


## Micronaut documentation

- [Micronaut documentation](https://docs.micronaut.io/latest/guide/index.html)
