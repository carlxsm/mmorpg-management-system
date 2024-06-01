# Sistema de Gerenciamento de MMORPG

É comum deparar-se com desafios que pedem a implementação de CRUDs básicos, frequentemente focando em temas como cadastro de pessoas, sistemas de bibliotecas, "Netflix" simulados ou "pokedexes". Esses projetos, embora úteis para praticar conceitos fundamentais, acabam tornando-se repetitivos e, muitas vezes, pouco inspiradores.

Por isso, decidi fazer algo diferente e criar um CRUD baseado em algo que realmente me apaixona: MMORPGs (Massively Multiplayer Online Role-Playing Games). Este projeto não só demonstra habilidades técnicas, mas também reflete minha paixão por jogos de RPG, oferecendo um sistema de gerenciamento de personagens e guildas. Com este projeto, espero proporcionar uma visão criativa e envolvente, diferenciando dos desafios comuns que vemos por aí.

## Desafio: Sistema de Gerenciamento de MMORPG

Um RPG (Role-Playing Game) é um jogo onde os jogadores assumem os papéis de personagens em um mundo fictício, desenvolvendo histórias colaborativas e enfrentando desafios variados. Nos MMORPGs (Massively Multiplayer Online Role-Playing Games), essa experiência é ampliada para um ambiente online, onde milhares de jogadores interagem simultaneamente, formando guildas, completando missões e enfrentando inimigos em um mundo vasto e dinâmico.

Para este desafio, você irá criar um sistema de gerenciamento de personagens e guildas para um MMORPG. O objetivo é desenvolver um CRUD completo usando Spring Boot e SQL, permitindo a criação, leitura, atualização e exclusão de personagens, guildas e itens. O sistema deve suportar funcionalidades como associação de personagens a guildas, gerenciamento de inventários e autenticação com JWT. Adicionalmente, a implementação deve incluir documentação com Swagger e boas práticas de segurança e validação de dados.

## Entidades principais

1. **Personagem**:
    - ID (identificador único)
    - Nome
    - Classe (Guerreiro, Mago, Arqueiro, etc.)
    - Nível
    - Experiência
    - Pontos de Vida (HP)
    - Pontos de Mana (MP)
    - Guilda (referência à entidade Guilda)

2. **Guilda**:
    - ID (identificador único)
    - Nome
    - Descrição
    - Data de Criação
    - Líder (referência à entidade Personagem)
    - Membros (lista de Personagens)

3. **Item**:
    - ID (identificador único)
    - Nome
    - Tipo (Arma, Armadura, Poção, etc.)
    - Atributos (Ataque, Defesa, Efeito, etc.)

4. **Inventário**:
    - ID (identificador único)
    - Personagem (referência à entidade Personagem)
    - Item (referência à entidade Item)
    - Quantidade

## Funcionalidades

### Funcionalidades CRUD

- **Personagem**:
    - Criar, ler, atualizar e deletar personagens.
    - Atribuir personagens a uma guilda.
    - Aumentar o nível e a experiência dos personagens.

- **Guilda**:
    - Criar, ler, atualizar e deletar guildas.
    - Adicionar e remover membros (personagens) de uma guilda.
    - Designar um líder de guilda.

- **Item**:
    - Criar, ler, atualizar e deletar itens.
    - Especificar atributos dos itens (ataque, defesa, efeito).

- **Inventário**:
    - Gerenciar inventário de personagens.
    - Adicionar e remover itens do inventário de personagens.
    - Atualizar a quantidade de itens no inventário.

### Funcionalidades Adicionais

- **Swagger/OpenAPI**: Documentação automática e interface de teste interativo da API.
- **Autenticação JWT**: Para autenticar e autorizar acesso à API.
- **Relacionamentos**: Implementação de relacionamentos entre entidades (e.g., muitos-para-um entre Personagem e Guilda, muitos-para-muitos entre Personagem e Item).
- **Filtros e Paginação**: Para listagem de personagens, guildas e itens.
- **Eventos e Missões**: (opcional) Gerenciamento de eventos e missões com recompensas para personagens.
