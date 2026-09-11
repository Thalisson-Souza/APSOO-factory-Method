/** ConcreteCreator para documentos de texto. */
public class FabricaDocumentoTexto implements FabricaDocumento {
    @Override
    public Documento criarDocumento() {
        return new DocumentoTexto();
    }
}
