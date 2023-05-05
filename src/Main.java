import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int result =1;
            // 5^3 = 5*5*5

        System.out.println("Sayi giriniz");
            int a =scanner.nextInt();

        System.out.println("Sayinin ussunu giriniz");
            int b =scanner.nextInt();



            for (int i=1; i<=b; i++)  {

               result*=a;
            }
        System.out.println(result);
    }
}