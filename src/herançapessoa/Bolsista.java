package herançapessoa;

public class Bolsista extends Aluno{
    private float bolsa;

    public void renovarBolsa(){
        System.out.println("Renovando bolsa de " + this.nome);
    }

    @Override
    public void pagarMensalidade(){
        System.out.println(this.nome + " é bolsista! Mensalidade está pagada!");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
