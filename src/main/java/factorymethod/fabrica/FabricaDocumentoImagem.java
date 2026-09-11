package factorymethod.fabrica;

import factorymethod.documento.Documento;
import factorymethod.documento.DocumentoImagem;

/** Novo ConcreteCreator da Etapa 3. */
public class FabricaDocumentoImagem implements FabricaDocumento {
    @Override
    public Documento criarDocumento() {
        return new DocumentoImagem();
    }
}
