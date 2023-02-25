public class ContaCorrente extends Conta implements Tributavel{

    private CalculadorImposto calculadorImposto;

    @Override
    public void sacar(double valor) throws Exception {
        super.sacar(valor + 0.20); //Sacar da conta corrente possui uma taxa de 20 centavos.
    }

    public ContaCorrente(int agencia, int numero){
        super(agencia, numero);
        System.out.println("Criando conta...");

    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
        System.out.println("Deposito realizado com sucesso");
    }

    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }

    @Override
    public void close() throws Exception {
        System.out.println("Finalizando criação de conta...");
    }
}
