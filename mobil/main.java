
package mobil;

/**
 *
 * @author USER
 */
public class main {
    public static void main(String[] args) {
        mobil mobil1 = new mobil();
        
        mobil mobil2 = new mobil("Toyota", "Merah", 150);

        System.out.println("Mobil 1");
        mobil1.tampilInfo();
        System.out.println("Kategori: " + mobil1.kategoriKecepatan());

        System.out.println("\nMobil 2");
        mobil2.tampilInfo();
        System.out.println("Kategori: " + mobil2.kategoriKecepatan());
    }
}