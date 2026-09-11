# Factory Method

## Cenário: Sistema de Gerenciamento de Documentos

**Descrição:**

Imagine que você está desenvolvendo um sistema de gerenciamento de documentos para uma empresa. Neste sistema, os usuários podem criar e manipular diferentes tipos de documentos, como textos, planilhas e apresentações. Cada tipo de documento tem sua própria estrutura e funcionalidades específicas.

**Requisitos:**

1. O sistema deve permitir aos usuários criar documentos de diferentes tipos, como Texto, Planilha e Apresentação.
2. Cada tipo de documento deve ter sua própria classe de fábrica que implementa o Factory Method para criar instâncias desse tipo de documento.
3. Os documentos devem ser salvos e carregados de um sistema de armazenamento, como um arquivo no disco.
4. Os usuários devem poder abrir, editar e salvar documentos.

## Organização das entregas

As etapas foram organizadas nas seguintes branches:

- [v1 — diagrama UML e implementação inicial](https://github.com/Thalisson-Souza/APSOO-factory-Method/tree/v1);
- [v2 — implementação melhorada com SDD/OpenSpec](https://github.com/Thalisson-Souza/APSOO-factory-Method/tree/v2);
- [v3 — extensão com DocumentoImagem e OCP](https://github.com/Thalisson-Souza/APSOO-factory-Method/tree/v3).
