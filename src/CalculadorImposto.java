public class CalculadorImposto{

    private double totalImpostos;

    public void registra(Tributavel tributavel){
        double valor = tributavel.getValorImposto();
        this.totalImpostos += valor;
    }

    public double getTotalImpostos() {
        return totalImpostos;
    }
}
