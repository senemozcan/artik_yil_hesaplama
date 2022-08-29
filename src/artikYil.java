import java.util.Scanner;

public class artikYil {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Yil girin: ");
        int yil = scan.nextInt();

        if (yil % 100 == 0) {
            if (yil % 400 == 0) {
                System.out.println(yil + " bir Artik yildir");
            } else {
                System.out.println(yil + " bir Artik yil değildir");
            }
        } else if (yil % 4 == 0) {
            System.out.println(yil + " bir Artik yildir");
        } else {
            System.out.println(yil + " bir Artik yil değildir");
        }

    }
}