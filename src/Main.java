import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan veri girişi
        System.out.print("Sayı giriniz: ");
        int n = input.nextInt();

        //Mükemmel sayı koşulu
        int total = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                total += i;
            }
        }
        if (total == n) {
            System.out.println(n + " Mükemmel sayıdır");
        } else {
            System.out.println(n + " Mükemmel sayı değildir");
        }
    }
}