import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

    @Override
    public void tocar() {
        System.out.println("TOCANDO MUSICA");
    }

    @Override
    public void pausar() {
       System.out.println("PAUSANDO A MUSICA");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("MUDANDO PARA MUSICA "+ musica);
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("EXIBINDO PÁGINA "+ url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PÁGINA");
    }

    @Override
    public void ligar(String numero) {
       System.out.println("LIGANDO PARA "+ numero);
    }

    @Override
    public void atender() {
        System.out.println("ATENDER");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("IINICIAR CORREIO DE VOZ");
    }
    
}
