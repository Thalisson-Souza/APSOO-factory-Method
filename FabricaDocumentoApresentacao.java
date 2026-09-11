/** ConcreteCreator para documentos de apresentação. */
public class FabricaDocumentoApresentacao implements FabricaDocumento {
    @Override
    public Documento criarDocumento() {
        return new DocumentoApresentacao();
    }
}
