public class FungsiParameter {

    // Ini disebut Encapsulation (pembungkusan data + method)
    int umur;
    String name;

    void Parameters(int umur, String name) {
        this.umur = umur;
        this.name = name;
    }

    int getUmur() {
        return umur;
    }

    String getName() {
        return name;
    }

    // Fungsi Code dengan Parameter Biasa
    void setDetail(int nilai) {

        String status = "";

        if (nilai > 6) {
            status = "Lulus";
        } else {
            status = "Tidak Lulus";
        }
        System.out.println("Informasi Nilai : " + nilai + " | " + "Status : " + status);
    }

    public static void main(String[] args) {

        FungsiParameter setFungsi = new FungsiParameter();
        int umur = 20;
        String name = "Trisna Nadi";
        int nilai = 5;
        setFungsi.Parameters(umur, name);

        System.out.println("Umur : " + setFungsi.getUmur());
        System.out.println("Nama : " + setFungsi.getName());
        setFungsi.setDetail(nilai); // Fungsi code parameter
    }

}
