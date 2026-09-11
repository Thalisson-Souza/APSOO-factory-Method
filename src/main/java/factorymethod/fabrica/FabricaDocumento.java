package factorymethod.fabrica;

import factorymethod.documento.Documento;

/** Creator do padrão Factory Method. */
public interface FabricaDocumento {
    Documento criarDocumento();
}
