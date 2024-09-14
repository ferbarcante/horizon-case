# Banco API

Este é um aplicativo Spring Boot que simula um sistema bancário, permitindo a criação de contas, transferências e consultas. 

## Requisitos

Antes de começar, certifique-se de ter os seguintes softwares instalados:

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white)

## Clonando o Repositório

Clone este repositório para sua máquina local usando o Git:

```bash
git clone https://github.com/SEU_USUARIO/SEU_REPOSITORIO.git
cd SEU_REPOSITORIO
```
## Banco de dados
1. Crie o banco de dados
2. Configure as credenciais no arquivo application.properties:
   ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/nome_do_bd
    spring.datasource.username=seu_usuario
    spring.datasource.password=sua_senha
    spring.jpa.hibernate.ddl-auto=update

   ```
## Executando o projeto 
 Execute pelo comando maven para inicializar o servidor Spring:
   ```bash
    mvn spring-boot:run
   ```
## Testando a API
Você pode testar a API usando Postman ou qualquer outra ferramenta de API. 
