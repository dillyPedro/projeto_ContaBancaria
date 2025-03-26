package Ex_Conta_Bancaria;

public class ContaBancaria {
    private double numero;
    private double agencia;
    private double saldo;
    private Cliente titular;
    private boolean status;

    public ContaBancaria(double numero, double agencia, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.status = false;
    }

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
}
