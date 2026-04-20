import javax.swing.JOptionPane;

public class StatemenSwicht {

    public static void main(String[] args) {
        String pilih = JOptionPane.showInputDialog(""
                + "Menu :\n"
                + "1. Sate Kambing\n"
                + "2. Sate Sapi\n"
                + "3. Sate Ayam\n"
                + "4. Sate Ikan\n");

        int menuPilih = Integer.parseInt(pilih);

        switch (menuPilih) {
            case 1:
                System.out.print("Anda Memilih Sate Kambing ");
                break;
            case 2:
                System.out.print("Anda Memilih Sate Sapi ");
                break;
            case 3:
                System.out.print("Anda Memilih Sate Ayam");
                break;
            case 4:
                System.out.print("Anda Memilih Sate Ikan");
                break;
            default:
                System.out.print("Anda Memilih Salah :: ???");
                break;
        }

    }

}
