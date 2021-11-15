package JavaBasic;

public class KonversiData {

    //Tujuan Mengonversi suatu data yang bertipe data tertentu ke jenis tipe data lain
    //Proses Konversi data bisa dilakukan dengan dua cara konvensional dan type-casting.

 public static void main (String  args[]){
  
    int a = 100;
    double b = 4.5;

    String konversi_ke_a = String.valueOf(a);
    String konversi_ke_b = String.valueOf(b);

    System.out.println("Konversi a " + konversi_ke_a );
    System.out.println("Konversi b " + konversi_ke_b );

 }
}
