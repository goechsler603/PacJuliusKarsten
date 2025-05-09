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

Requisitos Não Funcionais (RNF)

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
