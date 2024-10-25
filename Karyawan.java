package SIA.pbo_ithb_reg_2024_modul_3;

import java.util.ArrayList;
import java.util.List;

public class Karyawan extends Staff{
    double salary;
    List<PresensiStaff> presensiStaff = new ArrayList<>();

    public Karyawan(String nama, String alamat, String tTL, String telepon, int nik, double salary, List<PresensiStaff> presensiStaff) {
        super(nama, alamat, tTL, telepon, nik);
        this.salary = salary;
        this.presensiStaff = presensiStaff;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<PresensiStaff> getPresensiStaff() {
        return presensiStaff;
    }

    public void setPresensiStaff(List<PresensiStaff> presensiStaff) {
        this.presensiStaff = presensiStaff;
    }

    @Override
    public String toString(){
        return super.toString() + "\n Salary : " + salary + "Presensi Staff : " + presensiStaff;
    }


}
