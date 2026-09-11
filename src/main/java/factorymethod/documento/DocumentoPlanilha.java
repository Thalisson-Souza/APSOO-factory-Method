package factorymethod.documento;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/** ConcreteProduct para documentos de planilha. */
public class DocumentoPlanilha implements Documento {
    private final Path caminhoArquivo = Paths.get("documento-planilha.txt");
    private String conteudo = "Planilha inicial.";

    @Override
    public void abrir() {
        try {
            if (Files.exists(caminhoArquivo)) {
                conteudo = Files.readString(caminhoArquivo, StandardCharsets.UTF_8);
            } else {
                System.out.println("Arquivo de planilha não encontrado. Será usado o conteúdo inicial.");
            }
            System.out.println("Planilha aberta: " + conteudo);
        } catch (IOException e) {
            System.out.println("Não foi possível abrir a planilha: " + e.getMessage());
        }
    }

    @Override
    public void editar() {
        conteudo += " Edição realizada na planilha.";
        System.out.println("Planilha editada em memória.");
    }

    @Override
    public void salvar() {
        try {
            Files.writeString(caminhoArquivo, conteudo, StandardCharsets.UTF_8);
            System.out.println("Planilha salva em " + caminhoArquivo + ".");
        } catch (IOException e) {
            System.out.println("Não foi possível salvar a planilha: " + e.getMessage());
        }
    }
}
