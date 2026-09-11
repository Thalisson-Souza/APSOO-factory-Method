package factorymethod.documento;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/** Novo ConcreteProduct da Etapa 3. */
public class DocumentoImagem implements Documento {
    private final Path caminhoArquivo = Paths.get("documento-imagem.txt");
    private String conteudo = "Imagem inicial.";

    @Override
    public void abrir() {
        try {
            if (Files.exists(caminhoArquivo)) {
                conteudo = Files.readString(caminhoArquivo, StandardCharsets.UTF_8);
            } else {
                System.out.println("Arquivo de imagem não encontrado. Será usado o conteúdo inicial.");
            }
            System.out.println("Documento de imagem aberto: " + conteudo);
        } catch (IOException e) {
            System.out.println("Não foi possível abrir o documento de imagem: " + e.getMessage());
        }
    }

    @Override
    public void editar() {
        conteudo += " Edição realizada na imagem.";
        System.out.println("Documento de imagem editado em memória.");
    }

    @Override
    public void salvar() {
        try {
            Files.writeString(caminhoArquivo, conteudo, StandardCharsets.UTF_8);
            System.out.println("Documento de imagem salvo em " + caminhoArquivo + ".");
        } catch (IOException e) {
            System.out.println("Não foi possível salvar o documento de imagem: " + e.getMessage());
        }
    }
}
