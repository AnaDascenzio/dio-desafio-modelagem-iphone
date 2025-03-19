public class App {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();

        System.out.println("=====Player de música=====");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Only one girl in the world");

        System.out.println("=====Navegador internet=====");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.exibirPagina("http://teste.com");

        System.out.println("=====Aparelho telefônico=====");
        iphone.ligar("178881890");
        iphone.atender();
        iphone.iniciarCorreioVoz();
    }
}
