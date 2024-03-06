public class Conta {

    private int numero;
    private String titular;
    protected double saldo;
    public Conta(Integer numero, String titular, double saldo){
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;

    }
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double quantia){
        saldo += quantia;
    }

    public void saque(double quantia){

        saldo -= quantia + 6.0;
    }
}
