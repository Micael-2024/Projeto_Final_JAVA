Sistema de Almoxarifado - Projeto Java

Este projeto implementa um sistema de almoxarifado em Java, utilizando conceitos de Programação Orientada a Objetos (POO). Ele abrange o gerenciamento de categorias, itens, funcionários, estoques, e relatórios, com o objetivo de organizar e controlar os recursos do almoxarifado.

🛠 Funcionalidades
Gerenciamento de Categorias: Criação e organização de categorias para os itens.
Cadastro de Itens: Registro de itens com informações específicas, como código e categoria.
Controle de Estoque: Monitora a quantidade de itens disponíveis.
Gestão de Funcionários: Diferencia os papéis dos funcionários, como Gerente e Estoquista.
Relatórios: Gera relatórios detalhados de estoque.

🔑 Principais Conceitos Aplicados
Encapsulamento: Proteção dos atributos e acesso controlado por métodos getters e setters.
Herança e Polimorfismo: Classes especializadas (Gerente, Estoquista) herdando comportamentos e redefinindo tarefas.
Composição: Relacionamento entre as classes (Item possui uma Categoria).
Interface: Uso da interface IRelatorio para padronizar a geração de relatórios.

🗂 Estrutura do Projeto
Pacotes
ProjetoFinal.model: Contém as classes que representam os modelos de dados do sistema.
ProjetoFinal.Interfaces: Contém a classe abstrata.

Principais Classes 
Modelos

- Categoria: Representa as categorias dos itens.
- Item: Representa os itens do almoxarifado.
- Funcionario: Classe base para funcionários, com especializações:
- Gerente: Gerencia a loja e o estoque.
- Estoquista: Organiza os itens no estoque.
- Estoque: Controla a quantidade de itens disponíveis.