package aula02E03;

public class Caneta {
    private String modelo;
    private String cor;
    private float ponta;
    private int carga;
    private boolean tampada;

    public Caneta(String modelo, String cor, float ponta, int carga) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.carga = carga;
    }

    public void rabiscar() {
        if (this.tampada) {
            System.out.println("ERRO! Não posso rabiscar! A caneta está tampada.");
        } else {
            System.out.println("Estou rabiscando!");
        }
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }

    public void status() {
        System.out.println("INFORMAÇÕES SOBRE A CANETA:");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
}
