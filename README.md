# beer_api_dio
## Desenvolvimento de testes unitários para validar uma API REST de gerenciamento de estoque de cerveja

Por meio dessa interface, é possível fazer o gerenciamento do estoque de cervejas utilizando operações de criação, busca, listagem, exclusão, incremento e decremento de cerveja no estoque.

Para validar a API REST, foram desenvolvidos, com JUnit e Mockito, os testes unitários de todos os métodos em Service e em Controller. 

Primeiramente, foram desenvolvidos os testes unitários para validar a criação de cerveja no estoque, a busca de cerveja registrada, a exclusão de cerveja e a operação de incremento no estoque, seguindo as instruções do professor na live do projeto. Posteriormente, foram desenvolvidos os testes unitários para validar as operações relacionadas ao incremento acima do valor máximo do estoque e de cerveja com ID inválido, bem como os testes unitários para validar todas as operações envolvendo decremento no estoque.
