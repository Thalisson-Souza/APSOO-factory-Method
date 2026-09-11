# Etapa 3 — Extensão do sistema com DocumentoImagem

## Objetivo

O sistema precisa agora suportar um novo tipo de documento: `DocumentoImagem`. Esse novo tipo deve ser adicionado sem modificar nenhuma classe ou interface existente.

## Classes criadas

Foi criada a classe `DocumentoImagem`, que implementa a interface `Documento`. Ela representa o novo tipo de documento e implementa as operações `abrir()`, `editar()` e `salvar()`, utilizando um arquivo local para armazenar seu conteúdo simples.

Também foi criada a classe `FabricaDocumentoImagem`, que implementa `FabricaDocumento` e possui a responsabilidade de criar somente objetos `DocumentoImagem`.

Para demonstrar o funcionamento, foi criada a classe `MainEtapa3`. Ela é uma nova classe de demonstração e não altera a `Main` da primeira versão.

## Como o Factory Method permitiu a extensão

O Factory Method permitiu adicionar um novo produto com um novo ConcreteProduct e um novo ConcreteCreator. Assim, `DocumentoImagem` e `FabricaDocumentoImagem` foram adicionados sem modificar a interface `Documento`, a interface `FabricaDocumento` ou as classes existentes.

Essa forma de estender segue o OCP, pois o sistema permanece aberto à extensão, mas sem modificar as classes já existentes.

## Comparação com uma fábrica única baseada em condicionais

Se houvesse uma fábrica única com `if/else`, seria necessário alterar essa fábrica para incluir uma nova condição para o tipo imagem. Assim, uma classe já existente precisaria ser modificada sempre que um novo tipo fosse incluído.

Com esse método, a nova criação fica em uma fábrica separada, evitando o crescimento de uma estrutura com condicionais e deixando cada fábrica responsável pelo seu tipo de documento.
