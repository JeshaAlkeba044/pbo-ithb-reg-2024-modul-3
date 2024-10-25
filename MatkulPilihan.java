package SIA.pbo_ithb_reg_2024_modul_3;

public class MatkulPilihan extends MataKuliah{
    int jumMinMhs;

    public MatkulPilihan(String kode, int sks, String namaMatkul, int jumMinMhs) {
        super(kode, sks, namaMatkul);
        this.jumMinMhs = jumMinMhs;
    }  
    
    public int getJumMinMhs() {
        return jumMinMhs;
    }

    public void setJumMinMhs(int jumMinMhs) {
        this.jumMinMhs = jumMinMhs;
    }

    @Override
    public String toString(){
        return super.toString() + "\n Jumlah Minimal Mahasiswa : " + jumMinMhs;
    }
}
