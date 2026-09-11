import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/** ConcreteProduct para documentos de texto. */
public class DocumentoTexto implements Documento {
    private final Path caminhoArquivo = Paths.get("documento-texto.txt");
    private String conteudo = "Texto inicial.";

    @Override
    public void abrir() {
        try {
            if (Files.exists(caminhoArquivo)) {
                conteudo = Files.readString(caminhoArquivo, StandardCharsets.UTF_8);
            }
            System.out.println("Documento de texto aberto: " + conteudo);
        } catch (IOException e) {
            System.out.println("Não foi possível abrir o documento de texto: " + e.getMessage());
        }
    }

    @Override
    public void editar() {
        conteudo += " Edição realizada no documento de texto.";
        System.out.println("Documento de texto editado.");
    }

    @Override
    public void salvar() {
        try {
            Files.writeString(caminhoArquivo, conteudo, StandardCharsets.UTF_8);
            System.out.println("Documento de texto salvo em " + caminhoArquivo + ".");
        } catch (IOException e) {
            System.out.println("Não foi possível salvar o documento de texto: " + e.getMessage());
        }
    }
}
