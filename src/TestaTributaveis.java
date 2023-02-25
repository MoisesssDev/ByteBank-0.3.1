public class TestaTributaveis {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(12, 2323);
        contaCorrente.deposita(250);
        System.out.println(contaCorrente.getValorImposto());

        SeguroDeVida seguroDeVida = new SeguroDeVida();
        System.out.println(seguroDeVida.getValorImposto());

        CalculadorImposto calculadorImposto = new CalculadorImposto();
        calculadorImposto.registra(contaCorrente);
        calculadorImposto.registra(seguroDeVida);
        System.out.println(calculadorImposto.getTotalImpostos());
    }
}
