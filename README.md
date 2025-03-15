# Desafio de Programação Itaú - API de Transações
Este repositório contém uma API REST desenvolvida para o desafio de programação do Itaú, com o objetivo de processar transações financeiras e gerar estatísticas em tempo real. A API foi criada utilizando Java 23 e Spring Boot, com armazenamento em memória (sem banco de dados).

## Funcionalidades

### 1. Receber Transações (POST /transacao)
Este endpoint recebe uma transação e valida seus dados (valor e data/hora). As transações válidas são armazenadas em memória.

Requisição:
```json
{
  "valor": 123.45,
  "dataHora": "2025-03-15T17:40:56.789-03:00"
}
```

Respostas:
- `201 Created`: Quando a transação é validada e armazenada.
- `422 Unprocessable Entity`: Quando a transação não atende aos critérios (valor negativo, data futura, etc).
- `400 Bad Request`: Quando a requisição não é válida (JSON mal formado).

### 2. Limpar Transações (DELETE /transacao)
Este endpoint apaga todas as transações armazenadas em memória.

Resposta:
- `200 OK`: Quando todas as transações foram apagadas com sucesso.

### 3. Calcular Estatísticas (GET /estatistica)
Este endpoint calcula e retorna as estatísticas das transações ocorridas nos últimos 60 segundos. As estatísticas incluem:

- `count`: Quantidade de transações.
- `sum`: Soma total dos valores transacionados.
- `avg`: Média dos valores das transações.
- `min`: Valor mínimo das transações.
- `max`: Valor máximo das transações.

Resposta:
```json
{
  "count": 10,
  "sum": 1234.56,
  "avg": 123.456,
  "min": 12.34,
  "max": 123.56
}
```

Se não houver transações nos últimos 60 segundos, todos os valores serão 0.

## Tecnologias Utilizadas

- Java 23
- Spring Boot
- Armazenamento em memória (sem banco de dados)
