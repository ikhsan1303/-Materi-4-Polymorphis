package Latihan3;

public class PembayaranGaji {
    public int hitungGaji(Pegawai peg){
        int uang = peg.gaji();
        
        if(peg instanceof Direktur)
            uang+=((Direktur)peg).tunjangan();
        if(peg instanceof Staf)
            uang+=((Staf)peg).Bonus();
        return uang;
    }
    
    public static void main(String []args){
        PembayaranGaji pg=new PembayaranGaji();
        Staf Ali=new Staf();
        Direktur Tony=new Direktur();
        System.out.println("Gaji yang dibayarkan untuk Staf = "+pg.hitungGaji(Ali));
        System.out.println("Gaji yang dibayarkan kepada Direktur = "+pg.hitungGaji(Tony));
    } 
}
