public class Main {
    public static void main(String[] args) {
        demonstrar(new FabricaDocumentoTexto());
        demonstrar(new FabricaDocumentoPlanilha());
        demonstrar(new FabricaDocumentoApresentacao());
    }

    private static void demonstrar(FabricaDocumento fabrica) {
        Documento documento = fabrica.criarDocumento();
        documento.abrir();
        documento.editar();
        documento.salvar();
        System.out.println();
    }
}
