<img src="https://storage.googleapis.com/golden-wind/experts-club/capa-github.svg" />

## Auto-Configuração de Código com Spring Custom Starter
Este projeto visa exemplificar a utilização do Spring Custom Starter, onde temos um projeto que concentra o código que será utilizado por outros serviços, assim podemos colocar parte da autenticação, configuração de exceção, configuração do log e ..., ou seja, não possui regras de negócios, muito embora todos os serviços tenham de utilizar esses códigos acessórios. 

### Ambiente Utilizado
* Java JDK 16
* Spring 2.60
* Eclipse
* Ubuntu 20.04

### Diretório do Projeto

```sh
.
├── consumer/    # aplicação que faz uso do código do stater, um conjunto de classes de configuraçao e um arquivo xml que configura o log.
├── starter/     #  conjunto de classes que deve ser utilizada por todas as outras.
├── .gitignore   # arquivos que são desconsiderados pelo git
├── pom.xml      # dependências do projeto
└── README.md
```


## Expert

| [<img src="https://avatars.githubusercontent.com/u/1785791?s=400&u=cf86c9ae2216765f948ca2136eda7e632e0cd922&v=4" width="75px;"/>](https://github.com/gustavodsf) |
| :-: |
|[Gustavo Figueiredo](https://github.com/gustavodsf)|
