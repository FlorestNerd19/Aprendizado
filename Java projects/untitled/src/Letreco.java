public class Letreco {
    static void Teste(String[] palavra,String[] chute) {

    }
    public static void main(String[] args) {

        String[] palavra, chute;
        boolean acerto = false;

        //https://www.w3schools.com/java/java_data_types_numbers.asp

        System.out.println("Bem vindo ao jogo!");
        for (int i = 1;i <10;i++){
            System.out.println("Escolha sua palavra");

            //pegar chute e comparar
            for (int j = 0; j<5; j++) {
                Teste(chute[j]);
                System.out.println( chute[j]);
            }
            /*switch (palavra) {
                case "s":
                    System.out.println("Verde");
                    break;
                case "n":
                    System.out.println("Amarelo");
                    break;
                default:
                    System.out.println("Branco");
            */

        }
    }
}
