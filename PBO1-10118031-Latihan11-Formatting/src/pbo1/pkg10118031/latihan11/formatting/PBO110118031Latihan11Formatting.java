package pbo1.pkg10118031.latihan11.formatting;

/**
 *
 * @author Vendetta
 * NAMA              : Rizki Aria Putra
 * KELAS             : PBO1
 * NIM               : 10118031
 * Deskripsi Program : Program ini berisi program untuk 
 *                     formatting angka
 */
public class PBO110118031Latihan11Formatting {

    public static void main(String[] args) {
        int i = 3456764;
        int iMinus = -i;
        System.out.println("i " + i);
        System.out.printf("%%d : %d%n", i);
        System.out.printf("%%10d : %10d%n", i);
        System.out.printf("%%+10d : %+10d%n", i);
        System.out.printf("%%+10d : %+10d%n", iMinus);
        System.out.printf("%%,10d : %,10d%n", i);
        System.out.printf("%%-10d : %-10d%n", i);
        double f = 5675483.982;
        System.out.println("f : " + f);
        System.out.printf("%%f : %f%n", f);
        System.out.printf("%%.2f : %.2f%n", f);
        System.out.printf("%%12.2f : %12.2f%n", f);
        System.out.printf("%%12.2f : %,12.2ff%n", f);

    }

}
