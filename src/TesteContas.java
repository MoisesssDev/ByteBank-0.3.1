public class TesteContas {
    public static void main(String[] args) throws Exception{
        try(ContaCorrente contaCorrente = new ContaCorrente(12, 15)){
            contaCorrente.deposita(450);
        }

        try(ContaPoupanca contaPoupanca = new ContaPoupanca(15, -2323)) {
            contaPoupanca.deposita(300);
        }

//        ContaCorrente contaCorrente = new ContaCorrente(15, 2345);
//        contaCorrente.deposita(450);
//
//        ContaPoupanca contaPoupanca = new ContaPoupanca(12, 3467);
//        contaPoupanca.deposita(300);
//
//        contaCorrente.transfere(100, contaPoupanca);
//        contaCorrente.sacar(20);
    }
}
