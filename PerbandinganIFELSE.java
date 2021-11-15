package JavaBasic;

public class PerbandinganIFELSE {
    public static void main (String []args){

        //pernyataan untuk perbandingn nilai true dan false

        int nilai = 60;
        String hadiah; //menampung variable string untuk menentukan hadiah
        int nilai_saya = 50;
    

        if(nilai < nilai_saya){
            hadiah = "Pena";
        }else{
            hadiah = "buku";
        }

        System.out.println("Hadiah Anda Adalah = "+ hadiah);
    }
}
