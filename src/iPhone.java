public class iPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    public void tocar(){
        System.out.println("TOCANDO");
    }

    public void pausar(){
        System.out.println("PAUSANDO");
    }

    public void selecionarMusica(String musica){
        System.out.println("SELECIONANDO MÚSICA "+ musica);
    }

    public void atualizarPagina(){
        System.out.println("ATUALIZANDO PAGINA");
    }

    public void adicionarNovaAba(){
        System.out.println("ADICIONANDO ABA");
    }

    public void exibirPagina(String url){
        System.out.println("EXIBINDO "+ url);
    }

    public void atender(){
        System.out.println("ATENDENDO");
    }

    public void iniciarCorreioVoz(){
        System.out.println("INICIANDO CORREIO DE VOZ");
    }

    public void ligar(String numero){
        System.out.println("LIGANDO PARA " + numero);
    }

}
