package banco;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco(int numConta, String tipo, String dono, float saldo, boolean status) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = saldo;
        this.status = status;
    }

    public void estadoAtual() {
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Statuds: " + this.getStatus());
    }

    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t.equals("CC")) {
            this.setSaldo(50);
        } else if (t.equals("CP")) {
            this.setSaldo(150);
        }
        System.out.println("CONTA ABERTA COM SUCESSO!");
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Ainda há saldo em conta. Não pode fechar!");
        } else if (this.getSaldo() < 0) {
            System.out.println("Ainda em débito. Não pode fechar!");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }

    }

    public void depositar(float v) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
        } else {
            System.out.println("Conta fechada! Não é possível depositar");
        }

    }

    public void sacar(float v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado da conta" + this.getDono());
            } else {
                System.out.println("Saldo insuficiente para saque!");
            }
        } else {
            System.out.println("Conta fechada! Não é possível sacar.");
        }

    }

    public void pagarMensal() {
        int v;

        if (this.getStatus()) {
            if (this.getTipo().equals("CC")) {
                v = 12;
                this.setSaldo(this.getSaldo() - v);
            } else if (this.getTipo().equals("CP")) {
                v = 20;
                this.setSaldo(this.getSaldo() - v);
            }
            System.out.println("Mensalidade paga com sucesso!");
        } else {
            System.out.println("Conta fechada! Não é possível pagar mensalidade.");
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


}
