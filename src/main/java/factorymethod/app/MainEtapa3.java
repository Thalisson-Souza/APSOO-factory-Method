package factorymethod.app;

import factorymethod.documento.Documento;
import factorymethod.fabrica.FabricaDocumento;
import factorymethod.fabrica.FabricaDocumentoImagem;

/** Demonstração da extensão da Etapa 3. */
public class MainEtapa3 {
    public static void main(String[] args) {
        FabricaDocumento fabrica = new FabricaDocumentoImagem();
        Documento documento = fabrica.criarDocumento();

        documento.abrir();
        documento.editar();
        documento.salvar();
    }
}
