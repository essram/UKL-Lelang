import java.util.ArrayList;
import java.util.Scanner;

public class Lelang {
    private ArrayList<Integer> idPenawar = new ArrayList<Integer>();
    private ArrayList<Integer> idBarang = new ArrayList<Integer>();
    private ArrayList<Integer> hargaTawar = new ArrayList<Integer>();
    
    Scanner input = new Scanner(System.in);
    boolean lelang = true;
    boolean out = true;
    boolean ambassing = true;
    int wow = 0;
    String winner;
    public void prosesLelang(Masyarakat masyarakat, Barang barang, int index){
        
        
        do {
            System.out.print("Masukkan ID Barang: ");
            index = input.nextInt();
            this.idBarang.add(index);
            if (index >= barang.getJmlBarang()) {
                System.out.println("Id Salah Mohon diisi dengan baik :3");
            }
            if (index <= 0){
                System.out.println("Id Salah Mohon diisi dengan baik :3");
            }
            else{
                System.out.print("\n--------------- Shirakami Fubuki AUCTION ----------------");
                System.out.print(
                        "\nId Barang   : " + barang.getId(index) +
                                "\nDengan Nama : " + barang.getNamaBarang(index) +
                                "\nHarga Awal  : " + barang.getHarga(index) +
                                "\nBerstatus   : " + barang.getStatus(index) +
                                "\n----------------------------------------------------------\n");
         while (lelang) {
         if(barang.getStatus(index) == false){
                        System.out.println("Barang yang akan dilelang sudah tidak ada!");
                        break;
                    }
                    System.out.print("\nMasukan ID Anda : ");
                    int IndexPenawar = input.nextInt(); 
                    this.idPenawar.add(IndexPenawar);
                    if (IndexPenawar >= masyarakat.getJmlMember()) {
                        System.out.println("Id Anda Salah");
                    }
                    if (IndexPenawar <= 0){
                        System.out.println("Id Anda Salah");
                    }
                    else {
                    barang.getHarga(index);
                    System.out.println("Login Sebagai : " + masyarakat.getNama(IndexPenawar));
                    
                    while(ambassing){
                    System.out.println("Silahkan masukkan harga penawaran");
                    System.out.print("Harga : Rp.");
                    int hargaTawar = input.nextInt();

                    if (barang.getHarga(index) <= hargaTawar) {
                        if (wow <= hargaTawar) { 
                            wow = hargaTawar;
                            setId(IndexPenawar);
                            setHarga(hargaTawar);
                        } else {
                            System.out.println("sudah ada yang menawar lebih tinggi");
                            continue;
                            
                        }
                    
                    } else {
                        System.out.println("Harga Dibawah Harga Awal");
                    }
                    System.out.println("-------------------------------------------------\n");

                    System.out.println("Apakah mwu diakhiri lelangnya? [true]/[false] ");
                    System.out.print("Pilihan : ");
                    out = input.nextBoolean();

                        if (out && (wow >= barang.getHarga(index))) {
                            barang.editStatus(index, false);
                            System.out.println("\n---------------- Hasil Pelelangan ---------------");
                            System.out.print(
                                    "Id Barang       : " + barang.getId(index) +
                                            "\nDengan Nama     : " + barang.getNamaBarang(index) +
                                            "\nHarga Awal      : " + barang.getHarga(index) +
                                            "\nBerstatus       : " + barang.getStatus(index) +
                                            "\nDengan Harga    : " + wow +
                                            "\nDimenangkan Oleh: " + masyarakat.getNama(getPemenang(0))+
                                            "\n--------------------------------------------------\n");

                        }
                         if (barang.getStatus(index) == false) {
                            System.out.println("Barang " + barang.getNamaBarang(index) + " Sudah terjual");
                            break;
                        }
                }
            }
            }
            }
            System.out.println("\nApakah Anda Ingin melanjutkan lelang? [true]/[false] ");
            System.out.print("Pilihan : ");
            out = input.nextBoolean();
            System.out.println("");
            System.out.println("LELANG DIAKHIRI GAES");
            System.out.println("");
            System.out.println("kalo mwu nanya-nanya tentang codingan atau seni \nDM @Ichaan.art :D");
        }while(out);
    }    
    public void setIdBarang(Barang barang, int index){
        this.idBarang.add(barang.getId(index));
    }
    public int getPemenang(int index){
        return this.idPenawar.get(index);
    }
    public void setId(int idPenawar) {
        this.idPenawar.set(0,idPenawar);
    }
    public void setHarga(int harga) {
        this.hargaTawar.add(harga);
    }
    public int getHarga(int index) {
        return this.hargaTawar.get(index);
    }
    public int getId(int index) {
        return this.getId(index);
    }
}
