import java.util.Scanner;

public class Calculo_juros {
    static float Juros(float emprestimo_total, float taxa, int anos){
        //int a = anos;
        float mensal = 0;
        for (int i = 0; i >= anos;i++){

            float juros = emprestimo_total*taxa;
            emprestimo_total =  emprestimo_total + juros;
            mensal = emprestimo_total/12;
            System.out.println(mensal);
        }
        return mensal;
    }
    public static void main(String[] args) {
        //entradas
        // Empréstimo
        //Taxa de Juros anual
        //tempo em anos

        //saidas
        //custo final
        Scanner scan = new Scanner(System.in);
        System.out.printf("Empréstimo:");
        float emprestimo_total = scan.nextFloat();
        System.out.printf("Tempo (em anos):");
        int anos = scan.nextInt();
        System.out.printf("Taxa de Juros Anual:");
        float taxa = scan.nextFloat();
/*
        System.out.printf("Tempo (em anos): \n");
        float anos = scan.nextFloat();
*/

        System.out.println(Juros(emprestimo_total,taxa,anos));








        System.out.printf("Empréstimo:" +emprestimo_total  +
                "\nTaxa de Juros Anual:" +taxa   +
                "\nTempo (em anos):"+ anos   );

    }
}