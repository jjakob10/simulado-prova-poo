package simulado_q3;

public class Conta {
    private double saldo;
  
    private String nomeCliente;

    public Conta( String nomeCliente,double saldo) {
        this.saldo = saldo;
        this.nomeCliente = nomeCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getSaldo() {
        return saldo;
    }
}
