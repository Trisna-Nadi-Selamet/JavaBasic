package ClassObject;

public class StatementObject extends StatementClass {

    String merek;

    String getDatamrk(String mrk) {

        merek = mrk;
        return merek;
    }

    public static void main(String[] args) {

        StatementObject data = new StatementObject();

        data.nama = "Barang 01";
        data.harga = "2000";
        data.merek = "3000";

        System.out.println("Nama Barang " + data.nama);
        System.out.println("Nama Harga " + data.harga);
        System.out.println("Nama Merek " + data.merek);
    }

}
