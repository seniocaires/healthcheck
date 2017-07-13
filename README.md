# Healthcheck

Este projeto provê um serviço para retornar o HTTP Status Code 200.

A API é [REST](http://en.wikipedia.org/wiki/Representational_State_Transfer "RESTful") e usa o [Spark](http://sparkjava.com/ "Spark").
Atualmente, o formato de retorno de todos os endpoints é [JSON](http://json.org/ "JSON").

![alt tag](https://raw.githubusercontent.com/seniocaires/healthcheck/master/img/docker-spark.png)

## FAQ
### Como posso testar?

Use o Docker para baixar a imagem e executar um container para testes.

- Baixe a imagem executando o docker pull:
```shell
docker pull seniocaires/healthcheck
```
- Para iniciar um container da imagem recém baixada:
```shell
docker run --rm -p 4567:4567 seniocaires/healthcheck
```

### Quais formatos de retorno são suportados?
Atualmente os dados são retornados no formato [JSON](http://json.org/ "JSON").

### Qual o tipo de autenticação necessária?
Não requer nenhum tipo de autenticação.

## Endpoints

#### Health

    GET health

## Descrição
Retorna o HTTP Status Code 200.

***

## Autenticação
* Não requer autenticação.

***

## Parâmtros
* Não requer parâmetros.

***

## Formato de retorno
Um json vazio

***

## Erros
Nenhum

***

## Exemplo
**Request**

    http://localhost:4567/health

**Pequeno exemplo de retorno**

```json
{}
```

