package SIA.pbo_ithb_reg_2024_modul_3;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Daftar MataKuliah
        MataKuliah mk1 = new MataKuliah("MK001", 3, "Pemrograman Berorientasi Objek");
        MataKuliah mk2 = new MatkulPilihan("MK002", 3, "Data Mining", 10);
        MataKuliah mk3 = new MataKuliah("MK003", 4, "Sistem Berkas");
        MataKuliah mk4 = new MatkulPilihan("MK004", 3, "Kecerdasan Buatan", 8);
        MataKuliah mk5 = new MataKuliah("MK005", 2, "Prak. Basis Data");

        List<MataKuliah> mataKuliahList = new ArrayList<>();
        mataKuliahList.add(mk1);
        mataKuliahList.add(mk2);
        mataKuliahList.add(mk3);
        mataKuliahList.add(mk4);
        mataKuliahList.add(mk5);

        //Mahasiswa Sarjana
        MhsSarjana sarjana1 = new MhsSarjana("Andi", "Jakarta", "Bandung 10 Mei", "08123456789", 12345, "Informatika");
        MhsSarjana sarjana2 = new MhsSarjana("Dewi", "Bandung", "Bandung 12 Juni", "08223334455", 12346, "Teknik Elektro");
        MhsSarjana sarjana3 = new MhsSarjana("Citra", "Surabaya", "Surabaya 15 Juli", "08334445566", 12347, "Teknik Mesin");
        MhsSarjana sarjana4 = new MhsSarjana("Budi", "Malang", "Malang 18 Agustus", "08445556677", 12348, "Informatika");
        MhsSarjana sarjana5 = new MhsSarjana("Eka", "Semarang", "Semarang 20 September", "08556667788", 12349, "Sistem Informasi");


        sarjana1.getListMatkul().add(mk1);
        sarjana2.getListMatkul().add(mk2);
        sarjana3.getListMatkul().add(mk3);
        sarjana4.getListMatkul().add(mk4);
        sarjana5.getListMatkul().add(mk5);

        System.out.println(sarjana1.toString());
        System.out.println(sarjana2.toString());
        System.out.println(sarjana3.toString());
        System.out.println(sarjana4.toString());
        System.out.println(sarjana5.toString());

        //Mahasiswa Magister
        MhsMagister mhsMagister1 = new MhsMagister("Budi", "Bandung", "15 Mei 1985", "08129876543", 54321, "Sistem Informasi", "Implementasi Machine Learning");
        MhsMagister mhsMagister2 = new MhsMagister("Ratna", "Jakarta", "23 Maret 1987", "08124455666", 54322, "Informatika", "Penelitian Deep Learning");
        MhsMagister mhsMagister3 = new MhsMagister("Rio", "Solo", "12 Agustus 1986", "08125566777", 54323, "Teknik Elektro", "Studi Kendali Robot");
        MhsMagister mhsMagister4 = new MhsMagister("Nina", "Medan", "5 April 1988", "08126677888", 54324, "Teknik Mesin", "Riset Material Cerdas");
        MhsMagister mhsMagister5 = new MhsMagister("Arya", "Bandung", "29 Desember 1984", "08127788999", 54325, "Sistem Informasi", "Penerapan Blockchain");

        mhsMagister1.getListMatkul().add(mk1);
        mhsMagister2.getListMatkul().add(mk2);
        mhsMagister3.getListMatkul().add(mk3);
        mhsMagister4.getListMatkul().add(mk4);
        mhsMagister5.getListMatkul().add(mk5);

        System.out.println(mhsMagister1.toString());
        System.out.println(mhsMagister2.toString());
        System.out.println(mhsMagister3.toString());
        System.out.println(mhsMagister4.toString());
        System.out.println(mhsMagister5.toString());

        //Mahasiswa Doktor
        MhsDoktor mhsDoktor1 = new MhsDoktor("Citra", "Surabaya", "10 Februari 1980", "08121234567", 67890, "Teknik Komputer", "Riset Kecerdasan Buatan", 85, 90, 88);
        MhsDoktor mhsDoktor2 = new MhsDoktor("Dian", "Jakarta", "21 Maret 1981", "08123334455", 67891, "Informatika", "Penelitian Jaringan Saraf", 80, 85, 87);
        MhsDoktor mhsDoktor3 = new MhsDoktor("Faisal", "Makassar", "30 Mei 1979", "08124445566", 67892, "Sistem Informasi", "Riset IoT", 90, 92, 89);
        MhsDoktor mhsDoktor4 = new MhsDoktor("Linda", "Malang", "11 November 1982", "08125556677", 67893, "Teknik Elektro", "Riset Robotika", 88, 91, 85);
        MhsDoktor mhsDoktor5 = new MhsDoktor("Gani", "Bandung", "27 Agustus 1980", "08126667788", 67894, "Sistem Informasi", "Riset Data Mining", 85, 89, 88);

        System.out.println(mhsDoktor1.toString());
        System.out.println(mhsDoktor2.toString());
        System.out.println(mhsDoktor3.toString());
        System.out.println(mhsDoktor4.toString());
        System.out.println(mhsDoktor5.toString());

        //Karyawan
        Karyawan karyawan1 = new Karyawan("Dedi", "Bekasi", "Bekasi, 12 January 1985", "0812341234", 33333, 6000000);
        Karyawan karyawan2 = new Karyawan("Hendra", "Jakarta", "Jakarta, 5 February 1988", "0812556677", 33334, 5500000);
        Karyawan karyawan3 = new Karyawan("Fitri", "Surabaya", "Surabaya, 22 March 1990", "0812667788", 33335, 6500000);
        Karyawan karyawan4 = new Karyawan("Dina", "Bandung", "Bandung, 30 April 1987", "0812778899", 33336, 6200000);
        Karyawan karyawan5 = new Karyawan("Rian", "Semarang", "Semarang, 18 May 1986", "0812889900", 33337, 5800000);

        //Status 0= Hadir, 1 = Alpa
        PresensiStaff presensiStaff1 = new PresensiStaff("1 Oktober", Status.Hadir, 9);  
        PresensiStaff presensiStaff2 = new PresensiStaff("2 Oktober", Status.Alpha, 10); 
        PresensiStaff presensiStaff3 = new PresensiStaff("3 Oktober", Status.Hadir, 8);  
        PresensiStaff presensiStaff4 = new PresensiStaff("4 Oktober", Status.Alpha, 7);  
        PresensiStaff presensiStaff5 = new PresensiStaff("5 Oktober", Status.Hadir, 9);  

        karyawan1.getPresensiStaff().add(presensiStaff1);
        karyawan2.getPresensiStaff().add(presensiStaff2);
        karyawan3.getPresensiStaff().add(presensiStaff3);
        karyawan4.getPresensiStaff().add(presensiStaff4);
        karyawan5.getPresensiStaff().add(presensiStaff5);

        System.out.println(karyawan1.toString());
        System.out.println(karyawan2.toString());
        System.out.println(karyawan3.toString());
        System.out.println(karyawan4.toString());
        System.out.println(karyawan5.toString());

        //MatkulAmbil
        MatkulAmbil matkulAmbil1 = new MatkulAmbil(mk1, 80, 85, 90);
        MatkulAmbil matkulAmbil2 = new MatkulAmbil(mk2, 75, 80, 85);
        MatkulAmbil matkulAmbil3 = new MatkulAmbil(mk3, 70, 75, 80);
        MatkulAmbil matkulAmbil4 = new MatkulAmbil(mk4, 85, 90, 95);
        MatkulAmbil matkulAmbil5 = new MatkulAmbil(mk5, 60, 65, 70);

        Presensi presensi1 = new Presensi("1 Oktober", Status.Hadir); 
        Presensi presensi2 = new Presensi("2 Oktober", Status.Alpha); 
        Presensi presensi3 = new Presensi("3 Oktober", Status.Hadir); 
        Presensi presensi4 = new Presensi("4 Oktober", Status.Hadir); 
        Presensi presensi5 = new Presensi("5 Oktober", Status.Alpha);

        matkulAmbil1.getPresensi().add(presensi1);
        matkulAmbil2.getPresensi().add(presensi2);
        matkulAmbil3.getPresensi().add(presensi3);
        matkulAmbil4.getPresensi().add(presensi4);
        matkulAmbil5.getPresensi().add(presensi5);

        System.out.println(matkulAmbil1.toString());
        System.out.println(matkulAmbil2.toString());
        System.out.println(matkulAmbil3.toString());
        System.out.println(matkulAmbil4.toString());
        System.out.println(matkulAmbil5.toString());

        //Matkul Ajar
        MatkulAjar matkulAjar1 = new MatkulAjar(mk1);
        MatkulAjar matkulAjar2 = new MatkulAjar(mk2);
        MatkulAjar matkulAjar3 = new MatkulAjar(mk3);
        MatkulAjar matkulAjar4 = new MatkulAjar(mk4);
        MatkulAjar matkulAjar5 = new MatkulAjar(mk5);

        matkulAjar1.getPresensiStaff().add(presensiStaff1);
        matkulAjar2.getPresensiStaff().add(presensiStaff2);
        matkulAjar3.getPresensiStaff().add(presensiStaff3);
        matkulAjar4.getPresensiStaff().add(presensiStaff4);
        matkulAjar5.getPresensiStaff().add(presensiStaff5);

        System.out.println(matkulAjar1.toString());
        System.out.println(matkulAjar2.toString());
        System.out.println(matkulAjar3.toString());
        System.out.println(matkulAjar4.toString());
        System.out.println(matkulAjar5.toString());

        //Dosen Tetap
        DosenTetap dosenTetap1 = new DosenTetap("Dr. Fahmi", "Yogyakarta", "Yogyakarta, 15 March 1980", "0812556677", 11111, "Informatika", 15000000);
        DosenTetap dosenTetap2 = new DosenTetap("Dr. Susi", "Bandung", "Bandung, 22 April 1982", "0812667788", 11112, "Sistem Informasi", 12000000);
        DosenTetap dosenTetap3 = new DosenTetap("Dr. Rudi", "Malang", "Malang, 10 July 1979", "0812778899", 11113, "Teknik Elektro", 13500000);
        DosenTetap dosenTetap4 = new DosenTetap("Dr. Dina", "Jakarta", "Jakarta, 5 October 1981", "0812889900", 11114, "Teknik Mesin", 16000000);
        DosenTetap dosenTetap5 = new DosenTetap("Dr. Agus", "Solo", "Solo, 18 December 1978", "0812990011", 11115, "Informatika", 14500000);

        List<PresensiStaff> presensiStaffList = new ArrayList<>();
        dosenTetap1.getMatkulAjar().add(new MatkulAjar(mk1, presensiStaffList));
        dosenTetap1.getMatkulAjar().add(new MatkulAjar(mk2, presensiStaffList));
        dosenTetap1.getMatkulAjar().add(new MatkulAjar(mk3, presensiStaffList));
        dosenTetap1.getMatkulAjar().add(new MatkulAjar(mk4, presensiStaffList));
        dosenTetap1.getMatkulAjar().add(new MatkulAjar(mk5, presensiStaffList));

        System.out.println(dosenTetap1.toString());
        System.out.println(dosenTetap2.toString());
        System.out.println(dosenTetap3.toString());
        System.out.println(dosenTetap4.toString());
        System.out.println(dosenTetap5.toString());

        //Dosen Honorer
        DosenHonorer dosenHonorer1 = new DosenHonorer("Ir. Sari", "Malang", "Malang, 15 March 1980", "0812445566", 22222, "Sistem Informasi", 500000);
        DosenHonorer dosenHonorer2 = new DosenHonorer("Ir. Budi", "Semarang", "Semarang, 20 April 1978", "0812556677", 22223, "Informatika", 600000);
        DosenHonorer dosenHonorer3 = new DosenHonorer("Ir. Fahri", "Jakarta", "Jakarta, 10 May 1985", "0812667788", 22224, "Teknik Elektro", 550000);
        DosenHonorer dosenHonorer4 = new DosenHonorer("Ir. Wina", "Bandung", "Bandung, 18 June 1982", "0812778899", 22225, "Sistem Informasi", 650000);
        DosenHonorer dosenHonorer5 = new DosenHonorer("Ir. Dika", "Solo", "Solo, 5 July 1981", "0812889900", 22226, "Teknik Mesin", 700000);


        dosenHonorer1.getMatkulAjar().add(new MatkulAjar(mk1, presensiStaffList));
        dosenHonorer2.getMatkulAjar().add(new MatkulAjar(mk2, presensiStaffList));
        dosenHonorer3.getMatkulAjar().add(new MatkulAjar(mk3, presensiStaffList));
        dosenHonorer4.getMatkulAjar().add(new MatkulAjar(mk4, presensiStaffList));
        dosenHonorer5.getMatkulAjar().add(new MatkulAjar(mk5, presensiStaffList));

        System.out.println(dosenHonorer1.toString());
        System.out.println(dosenHonorer2.toString());
        System.out.println(dosenHonorer3.toString());
        System.out.println(dosenHonorer4.toString());
        System.out.println(dosenHonorer5.toString());


    }
}
