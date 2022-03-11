import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int quant, C = 0, R = 0, S = 0;
        double per;
        String cob;


        for(int i = 1; i <= n; i++){
            quant = input.nextInt();
            cob = input.next();

            if(quant >= 1 && quant <= 15){
                switch(cob){
                    case "C": C += quant; break;
                    case "R": R += quant; break;
                    case "S": S += quant; break;
                }
            }

        }

        System.out.println("Total: " + (C + S + R) + " cobaias");
        System.out.println("Total de coelhos: " + C);
        System.out.println("Total de ratos: " + R);
        System.out.println("Total de sapos: " + S);

        per = (C * 100.00 / (C + S + R));
        System.out.printf("Percentual de coelhos: %.2f%%\n", per);

        per = (R * 100.00 / (C + S + R));
        System.out.printf("Percentual de ratos: %.2f%%\n", per);

        per = (S * 100.00 / (C + S + R));
        System.out.printf("Percentual de sapos: %.2f%%\n", per);

    }
}