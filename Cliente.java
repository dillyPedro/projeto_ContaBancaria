package Ex_Conta_Bancaria;

public class Cliente extends ContaBancaria{
    private String titular;
    private String cpf;
    private int idade;
    private String sexo;

    public Cliente(double numero, double agencia, double saldo, String titular, String cpf, int idade, String sexo) {
        super(numero, agencia, saldo);
        this.titular = titular;
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if(this.getCpf().length() == 11) {
            this.cpf = cpf;
        } else {
            System.out.println("Não foi possível cadastrar o CPF.");
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void infosConta(){
        System.out.println("Titular: " + this.getTitular());
        System.out.println("Numero: " + this.getNumero());
        System.out.println("Agencia: " + this.getAgencia());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
}
