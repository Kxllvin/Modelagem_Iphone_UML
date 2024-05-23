public class Smartphone {
            public static void main(String[] args) {
                // Testando Reprodutor Musical
                ReprodutorMusical reprodutor = new ReprodutorMusical();
                reprodutor.selecionarMusica("Música 1");
                reprodutor.tocar();
                reprodutor.pausar();
        
                // Testando Aparelho Telefônico
                Telefone telefone = new Telefone();
                telefone.ligar("123456789");
                telefone.atender();
                telefone.iniciarCorreioVoz();
        
                // Testando Navegador na Internet
                Navegador navegador = new Navegador();
                navegador.exibirPagina("https://www.exemplo.com");
                navegador.adicionarNovaAba();
                navegador.atualizarPagina();
            }
}