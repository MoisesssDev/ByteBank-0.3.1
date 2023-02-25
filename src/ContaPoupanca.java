public class ContaPoupanca extends Conta {

    public ContaPoupanca(int agencia, int numero){
        super(agencia, numero);
        System.out.println("Criando conta...");
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
        System.out.println("Deposito realizado com sucesso");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Finalizando criação de conta...");
    }
}
