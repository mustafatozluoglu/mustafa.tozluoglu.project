import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        showMenu();

        System.out.print("Lütfen içmek istediğiniz kahvenin numarasını giriniz: ");
        int order = sc.nextInt();

        if (order > 0 && order < 8)
            System.out.println("\nTeşekkürler kahveniz hazırlanıyor.");

        if (order == 1) {
            System.out.println("Espresso seçtiniz.\n" +
                    "Bu içeceğimiz bir doz espresso içermektedir.\n" +
                    "Afiyet Olsun.");
        } else if (order == 2) {
            System.out.println("Double Espresso seçtiniz.\n" +
                    "Bu içeceğimiz iki doz espresso içermektedir.\n" +
                    "Afiyet Olsun.");
        } else if (order == 3) {
            System.out.println("Cappuccino seçtiniz.\n" +
                    "Bu içeceğimiz bir doz espresso, iki doz sıcak süt ve iki doz süt köpüğü içermektedir.\n" +
                    "Afiyet Olsun.");
        } else if (order == 4) {
            System.out.println("Caffe Latte seçtiniz.\n" +
                    "Bu içeceğimiz bir doz espresso, üç doz sıcak süt ve bir doz süt köpüğü içermektedir.\n" +
                    "Afiyet Olsun.");
        } else if (order == 5) {
            System.out.println("Mocha seçtiniz.\n" +
                    "Bu içeceğimiz bir doz espresso, bir doz sıcak çikolata, bir doz sıcak süt ve bir doz süt köpüğü içermektedir.\n" +
                    "Afiyet Olsun.");
        } else if (order == 6) {
            System.out.println("Americano seçtiniz.\n" +
                    "Bu içeceğimiz dört doz sıcak su ve bir doz espresso içermektedir.\n" +
                    "Afiyet Olsun.");
        } else if (order == 7) {
            System.out.println("Hot Water seçtiniz.\n" +
                    "Bu içeceğimiz bir doz sıcak su içermektedir.\n" +
                    "Afiyet Olsun.");
        } else {
            System.out.println("Hatalı seçim!");
        }



    }

    public static void showMenu() {
        System.out.println("1. Espresso (20₺)\n" +
                            "2. Double Espresso (27₺)\n" +
                            "3. Cappuccino (28₺)\n" +
                            "4. Caffe Latte (28₺)\n" +
                            "5. Mocha (32₺)\n" +
                            "6. Americano (26₺)\n" +
                            "7. Hot Water (5₺)");
    }
}
