# Treinamento

## Introdução

O Esocial é um sistema do governo feito para o cadastramento de informações relativas ao empregador e seus empregados. O Esocial possui o conceito de eventos, que são agrupamentos de informações atrelados a um trabalhador. Cada evento possui um tipo para diferenciar a intenção das informações prestadas. 

De uma forma simplificada, pode-se representar o relacionamento do Evento com o Tipo de Evento da seguinte forma:

![](/diagrama.png)

Considerando que apenas essas duas entidades compõem o domínio da aplicação, realize as seguintes atividades:

- Crie uma API Rest a partir da estrutura fornecida para realizar as operações de Select, Insert e Delete de um evento
- Crie um formulário para cadastrar essas informações utilizando a API criada. 
- Consuma os Eventos através da API para exibi-los em uma tabela
- Crie um botão na tabela para remoção de um Evento

## Módulos

## 1. Frontend

Existe uma estrutura inicial que pode ser utilizada para o desenvolvimento do frontend. Não foi instalada nenhuma depedência adicional além do React. Caso sinta necessidade, fique avontade para adicionar alguma biblioteca/depêndecia de sua preferência.

Para iniciar o projeto entre na pasta /frontend e execute `npm install` para instalar as dependências. Após a instalação execute `npm start` para inicializar.

## 2. API

A estrutura que deve ser utilizada encontra-se na pasta /api. Ela está utilizando o Spring 
Boot. 

A estrutura inicial do projeto está preparada para utilizar os seguintes bancos de dados:

- MySQL
- Postgress
- Oracle

Porém, caso deseje utilizar outro, é permitido, desde que seja Relacional e aceite SQL padrão ANSI.

O projeto está configurado para inicializar as tabelas do banco de dados para facilitar a montagem do ambiente. 

## 3. Banco de Dados

Após subir o banco de dados, execute esse script para adicionar os tipos de evento:

~~~sql
insert into tipoevento (codigo, descricao) 
values ('2200', 'Cadastramento Inicial do Vínculo e Admissão/Ingresso de Trabalhador'),
('2299', 'Desligamento'),
('2300', 'Trabalhador Sem Vínculo de Emprego/Estatutário - Início'),
('2399', 'Trabalhador Sem Vínculo de Emprego/Estatutário - Término');
~~~



