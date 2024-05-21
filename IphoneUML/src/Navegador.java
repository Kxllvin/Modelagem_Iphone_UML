import java.util.ArrayList;
import java.util.List;

public class Navegador {


    private List<String> abas;
    private String paginaAtual;

    public Navegador() {
        abas = new ArrayList<>();
    }

    public void exibirPagina(String link) {
        paginaAtual = link;
        System.out.println("Exibindo página: " + link);
    }

    public void adicionarNovaAba() {
        abas.add("Nova aba");
        System.out.println("Nova aba adicionada. Total de abas: " + abas.size());
    }

    public void atualizarPagina() {
        if (paginaAtual != null) {
            System.out.println("Atualizando página: " + paginaAtual);
        } else {
            System.out.println("Nenhuma página para atualizar.");
        }
    }

}
