# SDD — Sistema de Gerenciamento de Documentos

## 1. Objetivo do sistema

Implementar, em Java, um sistema simples de gerenciamento de documentos utilizando o padrão Factory Method.

## 2. Escopo

O sistema deve criar, abrir, editar e salvar documentos dos tipos Texto, Planilha e Apresentação.

## 3. Regras de negócio

### Criação dos documentos

A criação deve ser realizada por uma fábrica concreta. Cada fábrica deve criar somente o documento correspondente:

- `FabricaDocumentoTexto` cria `DocumentoTexto`;
- `FabricaDocumentoPlanilha` cria `DocumentoPlanilha`;
- `FabricaDocumentoApresentacao` cria `DocumentoApresentacao`.

O método responsável pela criação é `FabricaDocumento.criarDocumento()`, que deve retornar um objeto do tipo `Documento`.

### Operações dos documentos

Todos os documentos devem implementar a interface `Documento` e disponibilizar os métodos:

```java
void abrir();
void editar();
void salvar();
```

O comportamento mínimo esperado é:

- `abrir()`: carregar o conteúdo do documento a partir do armazenamento;
- `editar()`: alterar o conteúdo do documento em memória;
- `salvar()`: gravar o conteúdo atual do documento no armazenamento.

As operações devem ser demonstradas após a criação de um documento pela sua fábrica.

### Armazenamento

O conteúdo dos documentos deve ser salvo e carregado por meio de arquivos locais. A representação do conteúdo será simples, apenas para demonstrar as operações exigidas.

### Aplicação do padrão

A implementação deve manter o Factory Method: o cliente deve depender das interfaces `Documento` e `FabricaDocumento`, enquanto cada fábrica concreta define qual documento será criado.

`DocumentoImagem` não faz parte desta etapa.

## 4. Estrutura principal do UML

- `Documento`: Product, com `abrir()`, `editar()` e `salvar()`;
- `DocumentoTexto`: ConcreteProduct;
- `DocumentoPlanilha`: ConcreteProduct;
- `DocumentoApresentacao`: ConcreteProduct;
- `FabricaDocumento`: Creator, com `criarDocumento()`;
- `FabricaDocumentoTexto`: ConcreteCreator de `DocumentoTexto`;
- `FabricaDocumentoPlanilha`: ConcreteCreator de `DocumentoPlanilha`;
- `FabricaDocumentoApresentacao`: ConcreteCreator de `DocumentoApresentacao`.

## 5. Decisões de implementação

- Linguagem: Java;
- armazenamento: arquivos locais;
- conteúdo: texto simples;
- organização: classes e interfaces separadas conforme o UML;
- `Main`: apenas para demonstrar a criação, abertura, edição e salvamento.

## 6. Fora do escopo

Esta etapa não inclui `DocumentoImagem`, banco de dados, frameworks ou uma fábrica única com `if/else`. A estrutura de classes e interfaces do UML deve ser mantida.
