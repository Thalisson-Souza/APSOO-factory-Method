package factorymethod.documento;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/** ConcreteProduct para documentos de apresentação. */
public class DocumentoApresentacao implements Documento {
    private final Path caminhoArquivo = Paths.get("documento-apresentacao.txt");
    private String conteudo = "Apresentação inicial.";

    @Override
    public void abrir() {
        try {
            if (Files.exists(caminhoArquivo)) {
                conteudo = Files.readString(caminhoArquivo, StandardCharsets.UTF_8);
            } else {
                System.out.println("Arquivo de apresentação não encontrado. Será usado o conteúdo inicial.");
            }
            System.out.println("Apresentação aberta: " + conteudo);
        } catch (IOException e) {
            System.out.println("Não foi possível abrir a apresentação: " + e.getMessage());
        }
    }

    @Override
    public void editar() {
        conteudo += " Edição realizada na apresentação.";
        System.out.println("Apresentação editada em memória.");
    }

    @Override
    public void salvar() {
        try {
            Files.writeString(caminhoArquivo, conteudo, StandardCharsets.UTF_8);
            System.out.println("Apresentação salva em " + caminhoArquivo + ".");
        } catch (IOException e) {
            System.out.println("Não foi possível salvar a apresentação: " + e.getMessage());
        }
    }
}
