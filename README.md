<h1 align="center">Kafka Produces</h1>

### Swagger 
  <a href="http://localhost:8080/swagger-ui.html"><img src="https://user-images.githubusercontent.com/68226126/111772571-c57bf900-888b-11eb-9319-95201a499301.png" width="32" height="32"></a>

### Mensagens enviadas para Kafka
<a href="http://127.0.0.1:3030/kafka-topics-ui/#/"><img src="https://user-images.githubusercontent.com/68226126/111794215-c2d9cd80-88a4-11eb-9ec5-ad51ac9c699f.png" width="80" height="32"></a>

### Pré-requisitos

Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas:
- [Git](https://git-scm.com)
- [Docker](https://www.docker.com/products/docker-desktop)
- [Java 8](https://adoptopenjdk.net/) 
- Uma IDE de sua escolha para executar projetos spring boot

### 🔄 Executando aplicação

```bash
# Clone este repositório
$ git clone <https://github.com/hugmartins/kafka-produce.git>

# Importar o projeto para sua IDE
# Inserir o seguinte parâmetro nas VM Options: -Dspring.profiles.active=dev

# Baixar e subir a imagem do Kafka no Docker (executar na pasta do projeto)
$ ~/docker-compose up

# Subir aplicação 
# O servidor inciará na porta:8080 - acesse <http://localhost:8080>
```
