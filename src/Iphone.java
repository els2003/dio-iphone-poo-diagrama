import model.Smarthphone;

public class Iphone extends Smarthphone{
    public static void main(String[] args) throws Exception {
        Iphone meuIphone = new Iphone();

        // ReprodutorMusical
        meuIphone.selecionarMusica("Supersonic - Oasis");
        meuIphone.tocar();
        meuIphone.pausar();

        // AparelhoTelefonico
        meuIphone.atender();
        meuIphone.ligar("11999887766");
        meuIphone.iniciarCorreioVoz();

        // NavegadorInternet
        meuIphone.adicionarNovaAba();
        meuIphone.exibirPagina("http://www.youtube.com");
        meuIphone.atualizarPagina();
    }
}
