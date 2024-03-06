import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner nani = new Scanner(System.in);
        Lelang proses = new Lelang();
        Masyarakat masyarakat = new Masyarakat();
        Petugas petugas = new Petugas();
        Barang barang = new Barang();
        Laporan lapor = new Laporan();
        boolean buzz = true;
        System.out.println("==========  Welcome To Shirakami Fubuki Auction  ==========");
        System.out.println("Login Sebagai: ");
        System.out.println("1. Penawar\n2. Petugas\n3. Amimir");
        System.out.print("Input: ");
        int pilih = nani.nextInt();
        if (pilih==1) {
            proses.prosesLelang(masyarakat, barang, pilih);
        }
        else if (pilih==2) {
            System.out.print("Masukkan ID Staff: ");
            int id = nani.nextInt();
            System.out.println("Berhasil Login Sebagai"+petugas.getNama(id));
            System.out.println("1. Cek Laporan Barang\n2. Cek Laporan Client\n3. Cek Laporan Staff");
            int staffaction = nani.nextInt();
            switch(staffaction){
                case 1: 
                    lapor.laporan(barang);
                    break;
                case 2:
                    lapor.laporan(masyarakat);
                    break;
                case 3:
                    lapor.laporan(petugas);
                    break;
            } 
        }
            
        else{
            System.out.println("Aku Pergi...");
            System.out.println("kalo mwu nanya-nanya tentang codingan atau seni \nDM @Ichaan.art :D");
        }
    }
}