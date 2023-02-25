public class TesteSaca {
    public static void main(String[] args) {
        Conta conta = new ContaCorrente(12, 2345);

        conta.deposita(1000);
        System.out.println(conta.getSaldo());

        try{
            conta.sacar(1500);
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }


        System.out.println(conta.getSaldo());
    }
}
