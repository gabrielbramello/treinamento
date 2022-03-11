# Treinamento

## Introdução

O Esocial é um sistema do governo feito para o cadastramento de informações relativas ao empregador e seus empregados. O Esocial possui o conceito de eventos, que são agrupamentos de informações atrelados a um trabalhador. Cada evento possui um tipo para diferenciar a intenção das informações prestadas. 

De uma forma simplificada, pode-se representar o relacionamento do Evento com o Tipo de Evento da seguinte forma:

![](/diagrama.png)

<b>Considerando que apenas essas duas entidades compõem o domínio da aplicação, desenvolva um API REST, um Cliente Frontend e Operações no Banco de Dados. Abaixo seguem as instruções para o desenvolvimento:</b>

## 1. API

Existe uma estrutura que pode ser utilizada como base na criação do projeto que se encontra na pasta /api. Ela está utilizando o Spring Boot. 

A estrutura inicial do projeto está preparada para utilizar os seguintes bancos de dados:

- MySQL
- Postgress
- Oracle

Porém, caso deseje utilizar outro, é permitido, desde que seja Relacional e aceite SQL padrão ANSI.

O projeto está configurado para inicializar as tabelas do banco de dados para facilitar a montagem do ambiente. 

- O que é esperado:

```
    - Implementar endpoint que realiza a criação de um evento;
    - Implementar endpoint que realiza a consulta de um evento pelo id;
    - Implementar endpoint que realiza a consulta de um evento pelo CPF;
    - Implementar endpoint que realiza a alteração de um evento;
    - Implementar endpoint que altera o tipo de evento do evento;
    - Implementar endpoint que deleta um evento pelo id;
```

- O que será um diferencial:

```
   - Implementação de testes;
   - Manual de execução (Ex: Swagger)
```

## 2. Frontend

Existe uma estrutura inicial que pode ser utilizada para o desenvolvimento do frontend. Não foi instalada nenhuma depedência adicional além do React. Caso sinta necessidade, fique a vontade para adicionar alguma biblioteca/depêndecia de sua preferência.

Para iniciar o projeto entre na pasta /frontend e execute `npm install` para instalar as dependências. Após a instalação execute `npm start` para inicializar.

- O que é esperado:

```
    - Crie um formulário para cadastrar/alterar um evento utilizando a API criada;
    - Consuma os Eventos através da API para exibi-los em uma tabela;
    - Crie um botão na tabela para remoção de um Evento;
```

- O que será um diferencial:

```
    - Leiaute reponsivo;
    - Estilização;
```
## 3. Banco de Dados

Após subir o banco de dados, execute esse script para adicionar os tipos de evento:

~~~sql
insert into tipoevento (codigo, descricao) 
values ('2200', 'Cadastramento Inicial do Vínculo e Admissão/Ingresso de Trabalhador'),
('2299', 'Desligamento'),
('2300', 'Trabalhador Sem Vínculo de Emprego/Estatutário - Início'),
('2399', 'Trabalhador Sem Vínculo de Emprego/Estatutário - Término');
~~~

Feito isso, crie um script com instruções sql que realizem as seguintes atividades:

```
    - Cadastrar 2 eventos na tabela "evento" do tipo S2200; (1 ponto)
    - Cadastrar 1 evento na tabela "evento" do tipo S2300; (1 ponto)
    - Atualizar a data de entrada do evento de "id = 1" para 31/01/2022; (1 ponto)
    - Criar uma consulta que retorne os eventos agrupados por tipo de evento. O resultado deve exibir o “id” do evento e a sua respectiva quantidade; (1 ponto)
    - Criar uma consulta que retorne os tipos de eventos em ordem alfabética, sendo que o tipo evento de descrição "S2300" deve aparecer em 1º registro; (2 pontos)
    - Criar uma consulta que retorne o penúltimo evento cadastrado. OBS: O penúltimo entende-se independente quantos eventos cadastrados, ou seja, não pode usar o filtro por "ID = 3" (exemplo);  (2 pontos)
    - Criar uma consulta que retorne os eventos cadastrados no mês anterior. OBS: independente de qual seja o período atual, sempre buscar o mês anterior, ou seja, não pode usar o filtro fixo "data_entrada = '01/2022' (exemplo); (2 pontos)
```

<b>Ao finalizar o script sql, salve e coloque na raiz do projeto que será enviado.</b>

## Instruções

```
    - A estrutura criada nesse repositório visa apenas facilitar a execução do projeto, porém é permitido criar uma nova caso sinta necessidade, desde que seja feito utilizando as mesmas tecnologias. 
    - Realize um fork do projeto ou crie um projeto novo em seu repositório.
    - Desenvolva as atividades descritas.
    - Ao término encaminhar um email para gabriel.mello@osm.com.br com o link do repositório remoto.
    - Após o recebimento do teste você terá 5 dias corridos para a realização (15/03/2022 às 18h).
    - Dúvidas poderão ser tiradas a qualquer momento por e-mail, desde que não estejam fora de contexto. 
```
