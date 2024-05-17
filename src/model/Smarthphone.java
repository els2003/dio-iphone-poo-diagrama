package model;

import model.interfaces.AparelhoTelefonico;
import model.interfaces.NavegadorInternet;
import model.interfaces.ReprodutorMusical;

public abstract class Smarthphone implements NavegadorInternet, AparelhoTelefonico, ReprodutorMusical {
    @Override
    public void tocar() {
        System.out.println("TOCANDO MÚSICA.");
    }

    @Override
    public void pausar() {
        System.out.println("MÚSICA PAUSADA.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("MÚSICA SELECIONADA: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("LIGANDO PARA: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO CHAMADA.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ.");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("EXIBINDO PAGINA: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("NOVA ABA ADICIONADA.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("PAGINA ATUALIZADA.");
    }
}
