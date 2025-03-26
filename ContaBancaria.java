package Ex_Conta_Bancaria;

public class ContaBancaria {
    // Atributos:
    private double numero;
    private double agencia;
    private double saldo;
    private Cliente titular;
    private boolean status;

    // Construtor:
    public ContaBancaria(double numero, double agencia, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.status = false;
    }

    // Métodos Getters e Setters:
    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public double getAgencia() {
        return agencia;
    }

    public void setAgencia(double agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus() {
        this.status = true;
    }

    // Métodos Especiais:
    public void depositar(double valor) {
        this.setStatus();
        if(valor > 0) {
            this.setSaldo(this.getSaldo() + valor);
        } else {
            System.out.println("Valor insuficiente para deposito.");
        }
    }
        
    public void sacar(double valor) {
        this.setStatus();
        if(valor > 0 && this.getSaldo() >= valor) {
            this.setSaldo(this.getSaldo() - valor);
        } else {
            System.out.println("Valor insuficiente para saque.");
        }
    }
    
    public void transferir(ContaBancaria destino, double valor) {
        this.setStatus();
        destino.setStatus();
        if(valor > 0 && this.getSaldo() >= valor) {
            this.setSaldo(this.getSaldo() - valor);
            destino.setSaldo(destino.getSaldo() + valor);
        } else {
            System.out.println("Valor insuficiente para transferir.");
        }
    }

    public void fecharConta(){
        if(this.getSaldo() == 0){
            this.status = false;
            this.numero = 0;
            this.agencia = 0;
            this.saldo = 0;
            this.titular = null;
            System.out.println("A conta foi encerrada com sucesso");
        } else{
            System.out.println("Não foi possível encerrar a conta" + this.titular);
        }
    }
}
