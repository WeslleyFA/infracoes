# Instruções
###### obs: Tanto a API quanto o Serviço foram feitos em java 11
A ideia é simular um radar. <br>
O repositorio possui 3 projetos, contendo a API (apiInfracoes), o serviço (serviceInfracoes) que consome a API e o front (infracoes-app) feito em Angular.
#
A API possui o perfil de DEV e TEST, o test usa o banco h2 na memória enquanto o DEV usa o Postgres, para alterar, mude no application.properties.<br>

#
Com a API em execução, rode o projeto serviceInfracoes. <br>
Após rodar o serviço, é possivel acompanhar as respostas no console da IDE.

## Front - Opcional
###### Caso queira ver as infrações numa interface web
O front foi feito em Angular, então pra facilitar, o projeto foi dockerizado.<br>
Abra o terminal na pasta raiz do projeto e execute o comando `docker build .` para gerar a imagem.<br>
Feito isso, verifique o ID da mesma usando `docker images` <br>
Por fim, use o comando `docker run -d -p 4200:80 <id da sua imagem>` <br>
Para verificar, ele estará rodando em `http://localhost:4200`
#

