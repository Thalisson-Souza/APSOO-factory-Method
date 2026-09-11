# Diagrama UML + implementação inicial

## Diagrama UML

O diagrama de classes apresenta os papéis do padrão Factory Method identificados:

- `Documento`: Product;
- `DocumentoTexto`, `DocumentoPlanilha` e `DocumentoApresentacao`: ConcreteProducts;
- `FabricaDocumento`: Creator;
- `FabricaDocumentoTexto`, `FabricaDocumentoPlanilha` e `FabricaDocumentoApresentacao`: ConcreteCreators.

![Diagrama UML com os papéis do Factory Method](anexos/uml_factory_method.png)

## Relação entre o UML e a implementação

A implementação inicial foi criada diretamente a partir do diagrama UML. Como o pedido inicial ainda era genérico e não detalhava regras de negócio ou decisões de implementação, o código foi produzido de forma simples e sem uma organização mais definida.

Essa versão não é a melhor implementação que poderíamos ter e, por isso, a v2 apresenta uma análise crítica e inclui melhorias na organização e no detalhamento do sistema.

[Acessar a v2 — implementação reorganizada com SDD/OpenSpec](https://github.com/Thalisson-Souza/APSOO-factory-Method/tree/v2)

## Resultado da execução

A classe `Main` cria os documentos utilizando suas respectivas fábricas e executa as operações de abertura, edição e salvamento.

```text
Documento de texto aberto: Texto inicial.
Documento de texto editado.
Documento de texto salvo em documento-texto.txt.

Planilha aberta: Planilha inicial.
Planilha editada.
Planilha salva em documento-planilha.txt.

Apresentação aberta: Apresentação inicial.
Apresentação editada.
Apresentação salva em documento-apresentacao.txt.
```
