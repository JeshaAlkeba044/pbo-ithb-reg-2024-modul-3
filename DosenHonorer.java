package SIA.pbo_ithb_reg_2024_modul_3;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class DosenHonorer extends Dosen{
    double honorPerSKS;
    List<MatkulAjar> matkulAjar = new ArrayList<>();
    List<PresensiStaff> presensiStaffList = new ArrayList<>();

    public DosenHonorer(String nama, String alamat, String tTL, String telepon, int nik, String departemen, double honorPerSKS) {
        super(nama, alamat, tTL, telepon, nik, departemen);
        this.honorPerSKS = honorPerSKS;
    }

    public double getHonorPerSKS() {
        return honorPerSKS;
    }

    public void setHonorPerSKS(double honorPerSKS) {
        this.honorPerSKS = honorPerSKS;
    }

    public List<MatkulAjar> getMatkulAjar() {
        return matkulAjar;
    }

    public void setMatkulAjar(List<MatkulAjar> matkulAjar) {
        this.matkulAjar = matkulAjar;
    }

    public List<PresensiStaff> getPresensiStaffList() {
        return presensiStaffList;
    }

    public void setPresensiStaffList(List<PresensiStaff> presensiStaffList) {
        this.presensiStaffList = presensiStaffList;
    }

    @Override
    public String toString(){
        return super.toString() + "\n Matkul Ajar :" + matkulAjar + "\n Presensi : "  + presensiStaffList +"\n Honor PerSKS : " + honorPerSKS;
    }

}
