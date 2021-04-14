## TODO

## Zprovoznění v IntelliJ Idea

- Při problémech s certifikáty vypnout jejich kontrolu příkazem 'git config --global http.sslVerify false'
- Nastavit v Settings 'Gradle JVM' na '11'

## Fakta

- Odpovědi jsou v kódování UTF-8

## Rozhodování

- Generování Json odpovědí - 5 krát rychlejší vlastní tvorba oproti jackson, což by mělo být nejrychlejší standardní
  řešení
- Generický Endpoint s parametrem doména - 5% overhead oproti specializovanému endpointu
- Vlastní datová struktura pro cache - několikanásobně rychlejší přístup než do HashSet/Hashmap
- Krátké samostané metody nevadí - compilátor je inlinuje do volajícího kódu (například getry/setry)
- Návratová hodnota v REST controlleru nejde použít opakovaně, nejrychlejší vytvoření odpovědi je přes
  SimpleHttpResponseFactory.INSTANCE

## Názvy

- Aco - autocomplete objects neboli řešitel otázek "A co" se tam má vyplnit

## Micronaut 2.4.2 Documentation

- [User Guide](https://docs.micronaut.io/2.4.2/guide/index.html)
- [API Reference](https://docs.micronaut.io/2.4.2/api/index.html)
- [Configuration Reference](https://docs.micronaut.io/2.4.2/guide/configurationreference.html)
- [Micronaut Guides](https://guides.micronaut.io/index.html)

## Feature http-client documentation

- [Micronaut HTTP Client documentation](https://docs.micronaut.io/latest/guide/index.html#httpClient)

