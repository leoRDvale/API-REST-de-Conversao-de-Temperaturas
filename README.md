# API-REST-de-Conversao-de-Temperaturas

Crie uma aplicação API REST para realizar a conversão de unidades de temperatura matemática. A API deve seguir o modelo MVC recebendo as requisições, mas separando rigorosamente a regra de negócio do Controller, sem acesso a banco de dados.
Sua tarefa consiste em desenvolver:
Um ConversorController que defina os endpoints da sua aplicação para processar três operações de conversões possíveis, recebendo os valores via Path Variables na URI:
- Celsius para Kelvin
- Celsius para Fahrenheit
- Kelvin para Celsius
- Kelvin para Fahrenheit
- Fahrenheit para Celsius
- Fahrenheit para Kelvin

Uma classe separada chamada TemperatureOperator no pacote principal de seu domínio, que vai abrigar as equações matemáticas para realizar as devidas conversões descritas acima e retornar o resultado numérico.
Uma classe estática NumberConverter, idêntica à vista na aula da calculadora, para validar se o valor passado pelo usuário na URL é numérico real.
Você deve implementar o Tratamento de Exceções. Se o usuário digitar algo diferente de um número (por exemplo, letras como em /conversor/celsiusParaKelvin/abc), o Controller não deve tentar calcular. Ele deve lançar uma exceção personalizada chamada UnsupportedTemperatureTargetException enviando o HTTP Status adequado de 400 BAD REQUEST.
Organize o manipulador global da aplicação criando o CustomizedResponseEntityExceptionHandler estendendo a funcionalidade base do ResponseEntityExceptionHandler do Spring e a estrutura básica da classe ExceptionResponse com o objeto Date, mensagem e detalhes, para padronizar essa e eventuais outras falhas na API.


EXEMPLOS PARA TESTE:

http://localhost:8080/conversor/celsiusParaKelvin/25

http://localhost:8080/conversor/celsiusParaFahrenheit/25

http://localhost:8080/conversor/fahrenheitParaCelsius/32

http://localhost:8080/conversor/kelvinParaFahrenheit/300
