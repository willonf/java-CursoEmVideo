package banco;

public class main {
    public static void main(String[] args) {
        ContaBanco contaP1 = new ContaBanco(8762, "cp", "Willon", 100.00f, true);
        ContaBanco contaP2 = new ContaBanco(8223, "cc", "Naty", 1200.87f, true);

        System.out.println(contaP1.getSaldo());
        contaP1.estadoAtual();
    }
}
