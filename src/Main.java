import java.util.Scanner;

public class Main {

    // Fibonacci hesabi yapan metot tanimlandi.
    static int fib(int number) {

        // Fibonacci serisinin ilk iki degerini el ile atadik.
        if (number == 1 || number == 2) {
            return 1;
        }

        // Ilk iki adimdan sonra ki adimlar icin kendi kendini cagirttik.
        return fib(number - 1) + fib(number - 2);
    }

    public static void main(String[] args) {

        // Kullanicidan deger alabilmek adina Scanner sinifina ait degisken projeye dahil edildi.
        Scanner input = new Scanner(System.in);

        // Kullanicidan alinan degeri tutabilmek adina degisken tanimlandi.
        int number;

        // Kullanicidan deger alinip ilgili degiskene atandi.
        System.out.print("Basamak sayisini gir: ");
        number = input.nextInt();

        // Metotumuzun ciktisi kullaniciya iletildi.
        System.out.print("Sonuc: " + fib(number));
    }
}