public class ContaPJ extends Conta{

    private double limiteDeEmprestimo;

    public ContaPJ(Integer numero, String titular, double saldo, double  limiteDeEmprestimo){
        super(numero, titular,saldo);
        this.limiteDeEmprestimo = limiteDeEmprestimo;

    }

    public double getLimiteDeEmprestimo() {
        return limiteDeEmprestimo;
    }

    public void setLimiteDeEmprestimo(double limiteDeEmprestimo) {
        this.limiteDeEmprestimo = limiteDeEmprestimo;
    }

    public void emprestimo(double quantia){
        saldo = limiteDeEmprestimo * 1.5;
        if(quantia <= limiteDeEmprestimo){

            saldo += quantia - 10.0;
        }

    }

    @Override
    public void saque(double quantia){

        saldo +=  quantia;
    }
}
