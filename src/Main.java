import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen bir sesli harf giriniz: ");
        char word = scanner.next().charAt(0);

        // Sesli harf kontrolü
        if ("AEIOUaeiou".indexOf(word) == -1) {
            System.out.println("Sesli bir harf değil");
        } else {
            switch (Character.toUpperCase(word)) {
                case 'A':
                case 'I':
                case 'O':
                case 'U':
                    System.out.println("Kalın sesli harf");
                    break;
                default:
                    System.out.println("İnce sesli harf");
            }
        }

        scanner.close();
    }
}
