import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner bind = new Scanner(System.in);

        System.out.print("Informe Número da Conta: ");
        int numero = bind.nextInt();
        System.out.print("Informe o Titular: ");
        String titular = bind.next();
        System.out.print("Informe seu Saldo: ");
        double saldo = bind.nextDouble();
        System.out.println("Utilize para Conta Poupança(PO)");
        System.out.println("Utilize para Conta Poupança(PJ)");
        System.out.println("Qual tipo de Conta?");
        String tipoDeConta = bind.next();

        if(tipoDeConta.equals("PJ")) {
            double limiteDeEmprestimo = 0;
            ContaPJ contaPJ = new ContaPJ(numero, titular, saldo, limiteDeEmprestimo);

            int opcao = 0;
            while (opcao != 5) {
                System.out.println("1 - Depositar ");
                System.out.println("2 - Sacar");
                System.out.println("3 - Emprestimo");
                System.out.println("4 - Detalhes da Conta ");
                System.out.println("5 - Fechar Programa");
                opcao = bind.nextInt();
                bind.nextLine();

                switch (opcao) {

                    case 1:
                        System.out.println("Qual quantia que deseja depositar?");
                        double quantia = bind.nextDouble();
                        contaPJ.deposito(quantia);

                        break;
                    case 2:
                        System.out.println("Qual quantia que deseja Sacar?");
                        quantia = bind.nextDouble();
                        contaPJ.saque(quantia);
                        break;

                    case 3:
                        System.out.println("Qual quantia você deseja fazer o Emprestimo?");
                        quantia = bind.nextDouble();
                        contaPJ.emprestimo(quantia);
                        break;

                    case 4:
                        System.out.println("Número da Conta:" + contaPJ.getNumero());
                        System.out.println("Nome do Titular: " + contaPJ.getTitular());
                        System.out.println("Saldo da Conta: " + contaPJ.getSaldo());
                        System.out.println("Limite de Emprestimo:" + contaPJ.getLimiteDeEmprestimo());

                        break;
                    case 5:
                        System.out.println("Fim das operações!");
                        break;

                }
            }
        }
        if(tipoDeConta.equals("PO")) {

            double taxaDeJuros = 0.2;
            ContaPoupanca contaPoupanca = new ContaPoupanca(numero, titular, saldo, taxaDeJuros);
            int opcao = 0;
            while (opcao != 4) {
                System.out.println("1 - Depositar ");
                System.out.println("2 - Sacar");
                System.out.println("3 - Detalhes da Conta ");
                System.out.println("4 - Fechar Programa");
                opcao = bind.nextInt();
                bind.nextLine();


                switch (opcao) {

                    case 1:
                        System.out.println("Qual quantia que deseja depositar?");
                        double quantia = bind.nextDouble();
                        contaPoupanca.deposito(quantia);
                        break;

                    case 2:
                        System.out.println("Qual quantia que deseja sacar?");
                        quantia = bind.nextDouble();
                        contaPoupanca.saque(quantia);
                        break;

                    case 3:
                        System.out.println("Número da Conta:" + contaPoupanca.getNumero());
                        System.out.println("Nome do Titular: " + contaPoupanca.getTitular());
                        System.out.println("Saldo da Conta: " + contaPoupanca.getSaldo());
                        System.out.println("Taxa de Juros:" + contaPoupanca.getTaxaDeJuros());

                        break;
                    case 4:
                        System.out.println("Fim das operações!");
                        break;
                }
            }

        }else{

            System.out.println("Essa tipo conta não existe!!");

        }
    }
}
