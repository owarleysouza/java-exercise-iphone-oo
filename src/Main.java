//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        iPhone iPhoneDevice = new iPhone();

        iPhoneDevice.adicionarNovaAba();

        iPhoneDevice.exibirPagina("youtube.com");

        iPhoneDevice.atualizarPagina();

        iPhoneDevice.iniciarCorreioVoz();

        iPhoneDevice.ligar("123456789");

        iPhoneDevice.atender();

        iPhoneDevice.selecionarMusica("Me va bonito");

        iPhoneDevice.tocar();

        iPhoneDevice.pausar();

    }
}