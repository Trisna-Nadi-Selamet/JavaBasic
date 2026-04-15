public class StatemenRekursif {

    public void fungsiRekursif(int umur) {

        String info = "";
        int umurSyarat = 20;

        if (umur > umurSyarat) {
            info = "Kamu Masih muda";
            System.out.println(info);
            fungsiRekursif(umur - 1);
        } else {
            info = "Belum Memenuhi Syarat";
            System.out.println(info);

        }

    }

    public static void main(String[] args) {

        StatemenRekursif data = new StatemenRekursif();
        data.fungsiRekursif(30);
    }

}
