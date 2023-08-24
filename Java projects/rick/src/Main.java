import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Digite um valor a ser convertido");
            float unidade1 = input.nextFloat();

            System.out.println("Escolha o tipo de conversão \n 1) Celcius para Farenheight \n 2) Celcius para Kelvin" +
                    "\n 3) Farenheight para Celcius " +
                    "\n 4) Farenheight para Kelvin" +
                    "\n 5) Kelvin para Celcius" +
                    "\n 6) Kelvin para Farenheight"+
                    "\n 7) Para fechar o programa");
            int conversao = input.nextInt();
            if (conversao == 7){
                System.exit(0);
            }
            System.out.println(conversao(unidade1, conversao));
        }catch(Exception e) {
            System.out.println("Por favor digite um valor.");
        }
    }
    static float conversao(float x, int z){
        float y = 0;
        if (z == 1|| z == 2) {
            if (z == 1) {
                y = (x * 1.8f + 32);
            } else {
                y = x + 273;
            }
        }
        else if (z == 3 || z == 4){
            if (z ==3){
                y = ((x-32)/1.8f);
            }else {
                y = ((x+459.67f)*0.55f);
            }
        }
        else if (z == 5 || z == 6) {
            if (z==5){
                y = x-273;
            }else {
                y = ((x*1.8f)+459.67f);
            }

        }
        return y;}

}