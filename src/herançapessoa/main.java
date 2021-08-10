package herançapessoa;

public class main {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        Aluno a1 = new Aluno();
        Bolsista b1 = new Bolsista();

        v1.setNome("Will");
        v1.setIdade(25);
        v1.setSexo("M");
        System.out.println(v1.toString());
        System.out.println("#########################");
        a1.setNome("Willon");
        a1.setMatricula(8712);
        a1.setCurso("Eng. de Software");
        a1.setIdade(24);
        a1.pagarMensalidade();
        System.out.println("#########################");
        b1.setNome("Godofredo");
        b1.setBolsa(12.5f);
        b1.setSexo("Masculino");
        b1.pagarMensalidade();

    }
}
