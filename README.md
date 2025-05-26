# PacJuliusKarsten

### RF01 – Dashboard de Estoque

Ao logar, o usuário deve ver uma tela principal contendo:

Total de produtos cadastrados.

Produtos em alerta (com quantidade abaixo do mínimo).

Quantidade mínima permitida.

Saídas recentes.

### RF02 – Listagem de Materiais

O sistema deve exibir uma tabela com os seguintes dados:

Descrição do material.

Quantidade atual em estoque.

Última data de entrada ou saída.

Opção de edição de dados.

### RF03 – Entradas de Materiais

O sistema deve permitir registrar entradas de materiais escolares.

O usuário deve informar:

Nome do item.

Quantidade.

Data da entrada.

### RF04 – Saídas de Materiais

O sistema deve permitir registrar saídas de materiais escolares.

O usuário deve informar:

Nome do item.

Quantidade (em valor negativo).

Data da saída.

### RF05 – Alerta de Estoque Baixo

O sistema deve identificar e listar os produtos cuja quantidade atual esteja abaixo do mínimo permitido (ex: < 25 unidades).

Estes produtos devem ser destacados na aba “Estoque Baixo”.

### RF06 – Edição de Itens

O sistema deve permitir editar os dados dos itens da tabela.


### RF07 – Navegação pelo Menu

O menu lateral deve permitir navegação entre:

Entradas

Saídas

Estoque baixo

Login

### RF08 – Cadastro de Novos Itens

O sistema deve permitir que o usuário cadastre novos materiais escolares no estoque.

Campos obrigatórios:

Nome do item

Quantidade inicial

Data de entrada

Deve haver validação para evitar duplicidade (não permitir dois itens com o mesmo nome, por exemplo).

### RF09 – Histórico de Movimentações

O sistema deve manter um histórico detalhado de cada movimentação de entrada e saída.

Cada movimentação deve conter:

Nome do item

Tipo da movimentação (entrada ou saída)

Quantidade

Data

Usuário responsável

### RF10 – Pesquisa de Itens

Deve haver um campo de busca na tabela de estoque para localizar rapidamente um item.

A busca deve funcionar por nome parcial, nome completo ou data.

### RF11 – Filtros de Exibição

O sistema deve permitir filtrar os itens na tabela por:

Quantidade (ex: menor que 10)

Data (últimos 7 dias, mês atual etc.)

Tipo de movimentação (entrada/saída)

### RF12 – Controle de Usuários

Deve existir pelo menos dois tipos de usuários:

Administrador: pode cadastrar, editar e remover itens e usuários.

Usuário comum: pode apenas registrar entradas e saídas, sem excluir ou editar diretamente o estoque.

### RF13 – Validação de Estoque

O sistema deve impedir saídas que excedam a quantidade disponível no estoque.

Deve exibir uma mensagem de erro ao tentar remover mais unidades do que existem.

### RF14 – Relatórios

O sistema deve gerar relatórios em PDF ou Excel contendo:

Todos os itens em estoque

Itens com movimentações recentes

Itens em falta ou abaixo do mínimo

O usuário poderá escolher o período de tempo (ex: mês atual, trimestre, ano).

### RF15 – Exportação e Importação de Dados

Deve ser possível exportar e importar dados de estoque via arquivos .csv ou .xlsx.

### RF16 – Notificações de Estoque Baixo

O sistema deve exibir notificações visuais (ex: alerta vermelho) para itens abaixo do mínimo.

Notificações devem aparecer na tela inicial do usuário.

### RF17 – Logoff do Usuário

Deve haver uma opção de “Sair” no menu lateral para encerrar a sessão do usuário.

### RF18 – Recuperação de Senha

O sistema deve oferecer um link para recuperação de senha na tela de login.

O link deve enviar um email com instruções para redefinir a senha.

## Requisitos Não Funcionais (RNF)

### RNF01 – Interface Responsiva

O sistema deve ser responsivo e acessível em dispositivos móveis, tablets e desktops.

### RNF02 – Usabilidade

A interface deve ser intuitiva, com botões bem identificados e fluxos simples.

As cores devem seguir o padrão visual da escola, com contraste suficiente para leitura.

### RNF03 – Segurança

As senhas devem ser armazenadas de forma segura (criptografadas).

Autenticação via redes sociais deve usar OAuth.

### RNF04 – Performance

O tempo de resposta para qualquer ação não deve ultrapassar 2 segundos.

O carregamento da tabela de estoque deve ser otimizado para grandes volumes de dados.

### RNF05 – Confiabilidade

O sistema deve manter registros consistentes das entradas e saídas.

Deve prevenir erros de duplicação ou inconsistência nos dados.

### RNF06 – Backup e Recuperação

O sistema deve prever backup periódico dos dados.

Em caso de falha, deve ser possível restaurar o estoque a partir do último backup.

### RNF07 – Compatibilidade

O sistema deve funcionar nos principais navegadores modernos (Chrome, Firefox, Edge, Safari).

### RNF08 – Escalabilidade

O sistema deve ser capaz de suportar crescimento, com centenas de itens e múltiplos usuários simultâneos.

### RNF09 – Acessibilidade

A interface deve seguir padrões de acessibilidade (ex: contraste, navegação por teclado, suporte a leitores de tela).

### RNF10 – Auditoria

O sistema deve manter registro de todas as alterações feitas por cada usuário (log de ações).

### RNF11 – Atualizações em Tempo Real

Caso o sistema seja utilizado por vários usuários ao mesmo tempo, ele deve atualizar as tabelas em tempo real, evitando inconsistência de dados.

### RNF12 – Manutenção Facilitada

O código do sistema deve ser documentado e estruturado de forma que facilite futuras manutenções.

### RNF13 – Limite de Sessão

Sessões inativas por mais de 30 minutos devem ser encerradas automaticamente por segurança.

## Tabela relacional de banco de dados

![image](https://github.com/user-attachments/assets/615c411b-97c0-4bd8-a307-eaa35f39c438)

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# Projeto de Qualidade

## 1. Introdução ao Projeto 


Nosso projeto será uma aplicação web para controle de estoque geral da escola Julius Karsten. Vamos separar por categorias de itens, como: Esporte, expediente, informática e jogos. 

O foco é melhorar o controle dos itens que eles possuem, pois, como citado pela diretora, muitas vezes eles têm os itens, mas não sabem e acabam gastando mais ou não utilizando, ou eles perdem muito tempo procurando e é um item que eles não têm. 

Para esse projeto utilizaremos diversas tecnologias para o desenvolvimento: 

- Figma: Será feita a prototipagem no figma pois estamos utilizando o mesmo desde o começo da faculdade e já estamos habituados a usá-la; 

- Draw.io: Para a criação dos diagramas escolhemos o Draw.io por já estamos habituados a usar o mesmo; 

- HTML, CSS e JavaScript: O front-end será feito nessas tecnologias por já termos usado elas na matéria de UI/UX e estarmos mais habituados; 

- VScode: É a IDE que mais ajuda na parte do desenvolvimento, com sua IA ela sugere diversas melhorias e acelera o processo; 

- Framework React: O react vai facilitar o nosso desenvolvimento do front-end com módulos de código reutilizáveis; 

- Framework Bootstrap: O bootstrap vai nos ajudar com várias features já prontas que só precisamos implementar no nosso projeto; 

- Java: Optamos pelo java por estarmos fazendo a matéria de Programação Web utilizando o java, e termos mais familiaridade com ela; 

- InteliJ: É uma IDE com uma IA muito avançada que ajuda na codificação do projeto dando dicas e corrigindo erro; 

- Framework Spring boot: Vamos usar o Spring boot para facilitar a criação da aplicação web e a comunicação do backend com o banco de dados; 

 

 

## 2. Plano de Qualidade do Produto 

 

Nosso projeto será um produto de qualidade caso ele atinja uma série de requisitos que foram levantados com antecedência com nossos stakeholders. 

Os principais pontos que devemos focar para entregar um produto de qualidade seriam as principais características listadas abaixo: 

 

Usando como métrica a ISO/IEC 25010: 

(Todas as métricas serão avaliadas com testes unitários, de aceitação, integração e testes para ver se o sistema está intuitivo) 

Funcionalidade 

O sistema deve permitir: cadastro, consulta, edição, baixa e entrada de itens por categoria. 

Suporte a categorias como Esporte, Expediente etc. 

Histórico de movimentações. 

Sistema deve exibir corretamente se o item existe ou não, evitando compras desnecessárias. 

Desempenho e Eficiência 

Web leve, podendo rodar em computadores escolares básicos ou navegadores simples. 

Deve suportar cadastro de centenas de itens por categoria sem lentidão. 

Compatibilidade 

Exportação de relatórios em PDF/Excel para serem usados por outros sistemas. 

Usabilidade 

Interface simples com ícones claros e linguagem acessível. 

Cadastro de item com poucos cliques; busca fácil. 

Visual agradável e limpo, sem poluição de informações. 

Alertas ao tentar cadastrar item duplicado ou retirar item inexistente. 

 

Confiabilidade 

Pouca ou nenhuma falha durante o uso normal. 

Estar disponível durante o horário escolar. 

Backup automático do banco de dados semanalmente. 

Segurança 

Acesso com login/senha. 

Restrições para impedir alteração ou exclusão indevida de itens. 

Manutenibilidade 

Separar por módulos (cadastro, movimentação, relatórios). 

Código limpo e bem documentado para facilitar correções. 

Portabilidade 

Hospedagem leve. 

 

## 3. Plano de Qualidade do Processo 

Com base no CMMI: 

### 3.1. Modelos de processos aplicados 

###3.1.1. Gerenciamento de Requisitos 

Como será implementado: 

Levantamento de Requisitos: Será feito um levantamento com os usuários finais para identificar as necessidades do sistema. 

Documentação dos Requisitos: Todos os requisitos funcionais e não funcionais serão documentados em um Documento de Requisitos (com base na análise da ISO/IEC 25010). 

Gerenciamento de Mudanças: Será implementado um processo de revisão e controle de mudanças no documento de requisitos, para garantir que modificações sejam bem documentadas e aprovadas. 

Como será monitorado: 

Revisões regulares com stakeholders: Reuniões mensais para garantir que os requisitos continuam atendendo às expectativas. 

Testes de Aceitação: Cada requisito será validado com testes de aceitação. 

 

### 3.1.2. Planejamento de Projeto  

Como será implementado: 

Estabelecimento de Cronograma: Com base nos requisitos, será criado um cronograma com marcos importantes para cada fase do projeto. 

Alocação de Recursos: A equipe será dividida de maneira que a especialidade de cada um seja bem usada no sistema. 

Como será monitorado: 

Controle de Prazos: Será avaliado semanalmente se estamos de acordo com os prazos estipulados pelo projeto. 

 

### 3.1.3. Garantia da Qualidade de Processo e Produto  

Como será implementado: 

Plano de Qualidade: Será desenvolvido um Plano de Garantia da Qualidade que incluirá: 

Padrões de código (boas práticas de programação). 

Testes automatizados e manuais. 

Critérios de aceitação para cada funcionalidade. 

Como será monitorado: 

Feedback de Usuário: Após a implementação inicial, os usuários fornecerão feedback sobre a qualidade do sistema, que será analisado para melhorias contínuas. 

### 3.1.4. Gestão de Configuração 

Como será implementado: 

Controle de Versões: Utilização do GitHub para gerenciar as versões do código fonte, documentação e outros artefatos do projeto. 

Gestão de Documentos: A documentação do projeto será armazenada e gerenciada no Notion do Grupo. 

Como será monitorado: 

Rastreamento de Alterações: Cada alteração no código e nos documentos será registrada no GitHub. 

 

### 3.2 Maturidade do Projeto 

Com base nos processos que vamos aplicar no nosso projeto, ele se enquadraria no nível 2: Processos são planejados, executados e monitorados de maneira controlada. 

 	O CMMI tem como um de seus princípios a melhoria contínua, e para avançar para o Nível 3 do CMMI será necessário o aprimoramento principalmente em 2 pontos:  

 

1. Estabelecer métricas claras para a qualidade do software e tempo de resposta do sistema. E utilizar ferramentas como o Google analytics para avaliar essas métricas. 

2.  Padronizar e formalizar o processo de testes para garantir que todas as fases do ciclo de desenvolvimento sejam testadas de maneira consistente. 

 

## 4. Integração entre Qualidade do Produto e do Processo 

A aplicação das práticas de qualidade dos processos é a base para a melhoria contínua do projeto. Com os processos bem documentados, feitos de maneira correta e bem gerenciada, facilita a manutenção e as futuras melhorias do projeto. 

 

 

Exemplos: 

Em uma reunião com a diretora, ela nos disse que, além do controle de estoque por categoria, seria muito bom incluir uma quantidade mínima de cada material, para quando essa quantidade for atingida, os responsáveis serem alertados para a aquisição de mais itens dele. 

 

Com o cronograma que foi criado, estamos sempre cientes sobre o andamento do projeto, e se estamos atrasados ou não. 

 

Alocando os as pessoas do projeto conforme suas especialidades, estamos garantindo que cada ponto do projeto está sendo feito da melhor maneira possível. 

 

Seguindo esses passos, temos certeza de que nosso projeto está sendo desenvolvido com a melhor qualidade que podemos entregar, levando em consideração nosso tempo de entrega. 

 

## 5. Conclusão 

O projeto tenta abordar os principais pilares que sustentam um software de qualidade, tanto sob a perspectiva do produto quanto do processo. O sistema visa atender à demanda real da Escola Julius Karsten por um controle de estoque mais eficiente, prático e confiável. 

Reunimos e organizamos os requisitos funcionais e não funcionais, aplicamos os princípios da norma ISO/IEC 25010 para garantir qualidade do produto, e adotamos práticas baseadas no modelo CMMI Nível 2 para garantir qualidade de processo. A definição clara de funcionalidades, critérios de desempenho, usabilidade, confiabilidade, segurança e manutenibilidade foram fundamentais para o desenho da solução. 

A importância da qualidade no desenvolvimento de software está diretamente ligada à satisfação do usuário final, à redução de retrabalho e à sustentabilidade a longo prazo do sistema. Um projeto que preza por boas práticas, testes, documentação e processos bem definidos tem muito mais chances de sucesso e adoção efetiva por seus usuários. 

Próximos Passos 

Finalização do desenvolvimento e testes automatizados/manuais com base nos requisitos definidos; 

Apresentação e validação com os stakeholders, especialmente com a equipe gestora da escola; 

Documentação final do projeto, incluindo manual de uso e manuais técnicos; 

 
