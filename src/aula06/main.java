package aula06;

public class main {
    public static void main(String[] args) {
        ControleRemoto controle = new ControleRemoto();
        controle.ligarMudo();
        controle.ligar();
        controle.desligar();
        controle.play();
        controle.abrirMenu();
        controle.fecharMenu();
//        controle.setVolume(50); -> setVolume é um método privado da classe ControleRemoto
    }
}
