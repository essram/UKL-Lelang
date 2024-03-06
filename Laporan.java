public class Laporan {
    public void laporan(Barang barang){
        int x = barang.getJmlBarang();
        System.out.println("\\n==========  Shirakami Fubuki AUCTION - List Barang  ==========\\n");
        for(int i=0;i < x;i++){
            System.out.println("Id Barang\t: " + barang.getId(i) +
                    "\nDengan Nama\t: "+ barang.getNamaBarang(i) +
                    "\nSeharga\t\t: Rp." + barang.getHarga(i) +
                    "\nBerstatus\t: "+ barang.getStatus(i) +
                    "\n---------------------------------------------------------------");
        }
        }
    public void laporan(Petugas petugas){
        int x = petugas.getJmlPetugas();
        System.out.println("\\n==========  Shirakami Fubuki AUCTION - List Employee  ==========\\n");
        for(int i=0;i < x;i++){
            System.out.println("Nama Petugas\t: " + petugas.getNama(i) +
                    "\nAlamat\t:"+ petugas.getAlamat(i) +
                    "\nContact\t: Rp." + petugas.getTelepon(i) +                   
                    "\n---------------------------------------------------------------");
        }
    }
    public void laporan(Masyarakat masyarakat){
        int x = masyarakat.getJmlMember();
           System.out.println("\\n==========  Shirakami Fubuki AUCTION - List Client  ==========\\n");
           for(int i=0;i < x;i++){
               System.out.println("Nama Petugas\t: " + masyarakat.getNama(i) +
                       "\nAlamat\t:"+ masyarakat.getAlamat(i) +
                       "\nContact\t: Rp." + masyarakat.getTelepon(i) +                   
                       "\n---------------------------------------------------------------");
                       }
           System.out.println("kalo mwu nanya-nanya tentang codingan atau seni \nDM @Ichaan.art :D");
    }
    }
