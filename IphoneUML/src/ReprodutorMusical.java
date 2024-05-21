public class ReprodutorMusical {
    
        private String musicaAtual;
        private boolean Tocando;
    
        public void tocar() {
            if (musicaAtual != null) {
                Tocando = true;
                System.out.println("Tocando: " + musicaAtual);
            } else {
                System.out.println("Nenhuma música selecionada.");
            }
        }
    
        public void pausar() {
            if (Tocando) {
                Tocando = false;
                System.out.println("Música pausada: " + musicaAtual);
            } else {
                System.out.println("Nenhuma música está tocando no momento.");
            }
        }
    
        public void selecionarMusica(String musica) {
            musicaAtual = musica;
            System.out.println("Música selecionada: " + musica);
        }    
}
