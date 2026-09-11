package factorymethod.fabrica;

import factorymethod.documento.Documento;
import factorymethod.documento.DocumentoPlanilha;

/** ConcreteCreator para documentos de planilha. */
public class FabricaDocumentoPlanilha implements FabricaDocumento {
    @Override
    public Documento criarDocumento() {
        return new DocumentoPlanilha();
    }
}
