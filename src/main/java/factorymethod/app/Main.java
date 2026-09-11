package factorymethod.app;

import factorymethod.documento.Documento;
import factorymethod.fabrica.FabricaDocumento;
import factorymethod.fabrica.FabricaDocumentoApresentacao;
import factorymethod.fabrica.FabricaDocumentoPlanilha;
import factorymethod.fabrica.FabricaDocumentoTexto;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Documento de Texto ===");
        demonstrar(new FabricaDocumentoTexto());
        System.out.println("=== Documento de Planilha ===");
        demonstrar(new FabricaDocumentoPlanilha());
        System.out.println("=== Documento de Apresentação ===");
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
