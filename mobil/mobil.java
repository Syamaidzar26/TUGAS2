package mobil;

/**
 *
 * @author USER
 */
public class mobil {

    // atribut
    String merk;
    String warna;
    int kecepatan;

    public mobil() {
        merk = "Tidak diketahui";
        warna = "Hitam";
        kecepatan = 0;
    }

    public mobil(String merk, String warna, int kecepatan) {
        this.merk = merk;
        this.warna = warna;
        this.kecepatan = kecepatan;
    }

    public void tampilInfo() {
        System.out.println("Merk      : " + merk);
        System.out.println("Warna     : " + warna);
        System.out.println("Kecepatan : " + kecepatan + " km/jam");
        System.out.println("-------------------------");
    }

    // Method dengan nilai balik
    public String kategoriKecepatan() {
        if (kecepatan >= 180) {
            return "mobil Balap";
        } else if (kecepatan >= 120) {
            return "mobil Cepat";
        } else if (kecepatan >= 60) {
            return "mobil Santai";
        } else {
            return "mobil Lambat";
        }
    }
}
