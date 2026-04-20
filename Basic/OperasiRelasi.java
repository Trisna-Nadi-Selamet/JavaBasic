package JavaBasic;

public class OperasiRelasi {


    public static void main(String []args){

        // Operasi untuk membandingan nilai"

        //a == b {sama dengan}                      //hasilnya benar jika sama dengan b
        //a != b {tidak sama dengan}                //hasilnya benar jika a tidak sama dengan b
        //a < b  {lebih kecil}                      //hasilnya benar jika a lebih kecil b
        //a > b  {lebih besar}                      //hasilnya benar jika a lebih besar b
        //a <= b {lebih kecil atau sama dengan}     //hasilnya benar jika a lebih kecil sama dengan b
        //a >= b {lebih besar atau sama dengan}     //hasilnya benar jika a lebih besar sama dengan b

        int a = 4;
        int b = 3;


        
        System.out.println("Perbandingan "+ (a == b));
        System.out.println("Perbandingan "+ (a != b));
        System.out.println("Perbandingan "+ (a < b));
        System.out.println("Perbandingan "+ (a > b));
        System.out.println("Perbandingan "+ (a <= b));
        System.out.println("Perbandingan "+ (a >= b));

    }
    
}
