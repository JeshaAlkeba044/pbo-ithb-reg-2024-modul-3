package SIA.pbo_ithb_reg_2024_modul_3;

public class PresensiStaff extends Presensi{
    int jam;

    public PresensiStaff(String tanggal, Status status, int jam) {
        super(tanggal, status);
        this.jam = jam;
    }

    public int getJam() {
        return jam;
    }

    public void setJam(int jam) {
        this.jam = jam;
    }

    @Override
    public String toString(){
        return super.toString() + "\n Jam : " + jam;
    }

}
