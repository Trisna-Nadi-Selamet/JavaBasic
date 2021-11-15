package JavaBasic;

import javax.swing.JOptionPane;

public class PerbadinganIFELSEIF {

    public static void main (String []args){
    
        //persyaratan untuk seleksi yang lebih kompleks
        //int nilai_khusus = 85;
        String input = JOptionPane.showInputDialog("Masukan Nilai ");
        int nilai = Integer.parseInt(input);
        String grade = "";
        

        if(nilai > 90){
            grade = "A";
        }else if (nilai < 85){
            grade = "B";
        }else{
            grade = "c";
        }

        System.out.println("Hasil nilai = "+ nilai);
        System.out.println("Hasil nilai = "+ grade);
        System.exit(0);
    }

}
