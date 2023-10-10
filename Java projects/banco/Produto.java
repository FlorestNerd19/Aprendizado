public class Produto {
    String produto;
    String descricao;
    double valor;
    boolean disponivel;

    void exibirSaldo(){
        System.out.println(titular.nomeTitular + ", seu saldo é "+saldo);
    }
    void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("valor deve ser maior que 0");
        }
        else if (saldo - valor < 0) {
            throw new IllegalStateException("Saldo insuficiente");
        }
        saldo -= valor;

    }
    void deposita(double valor){
        if (valor <=0){
            throw new IllegalArgumentException("Valor deve ser maior que 0");}
        else
            saldo += valor;
    }
}