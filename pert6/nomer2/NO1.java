/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author adams
 */
public class NO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // a. Menghitung Deret bilangan prima dan bukan dari 0 – 20
        System.out.println("a. Menghitung Deret bilangan prima dan bukan dari 0 – 20");
        for (int num = 2; num <= 20; num++) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        // b. Menghitung Deret bilangan ganjil dan genap dari 0 – 20
        System.out.println("b. Menghitung Deret bilangan ganjil dan genap dari 0 – 20");
        for (int num = 0; num <= 20; num++) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
        for (int num = 0; num <= 20; num++) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        // c. Huruf Z – A
        System.out.println("c. Huruf Z – A");
        for (char ch = 'Z'; ch >= 'A'; ch--) {
            System.out.print(ch + " ");
        }
        System.out.println();

        // d. Lagu “Anak Ayam Turun N”
        System.out.println("d. Lagu 'Anak Ayam Turun N'");
        int n = 5;  // Ganti dengan angka sesuai jumlah anak ayam
        for (int i = n; i > 0; i--) {
            System.out.println("Anak ayam turun " + i + ", mati satu tinggal " + (i - 1));
        }
        System.out.println("Mama ayam pulang, pulang " + n);
    }
    
}
