public abstract class Conta implements AutoCloseable {
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int totalDeContas;

    public Conta(int agencia, int numero) {

    }

    public Conta(Cliente titular, int agencia, int numero) {

//        atribuindo ao titular
        this.titular = titular;

//        Validação Agencia.
        if (agencia < 1) {
            throw new IllegalArgumentException("Agencia inválida"); // Faz o tratamento da exceção numero invalido
        }
        this.agencia = agencia;


//          Validação numero da conta.
        if(numero < 1) {
            throw new IllegalArgumentException("Numero da conta inválido"); // Faz o tratamento da exceção numero invalido
        }
            this.numero = numero;


        // this.saldo = 100; // Saldo ficticio, toda conta vai ser aberta com R$100.

        Conta.totalDeContas++; // A cada nova conta criada o nosso contador incrementa +1.

    }


    public abstract void deposita(double valor);

    public String getSaldo() {
        //String seuSaldo = " Seu saldo é: "+ this.saldo;
        return "Seu saldo é: " + this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public Cliente getTitular() {
        return titular;
    }

    public static int getTotalDeContas() {
        return totalDeContas;
    }

    public void sacar(double valor) throws Exception {

        if (this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo insuficiente: " + this.saldo + ", Valor: " + valor);
        }
        this.saldo -= valor;
    }

    public void transfere(double valor, Conta destinoTransferencia) throws Exception {
        this.sacar(valor);
        destinoTransferencia.deposita(valor);
    }

    public void mostrarDadosDaConta() {
        System.out.println("Titular da Conta: " + getTitular().getNome());
        System.out.println("Numero da Conta: " + getNumero());
        System.out.println("Agencia: " + getAgencia());
    }


}
