package AlifahNurhanaHawangtika;

import java.util.Scanner;
import B4.DataMahasiswa;
import TI13020190385.InputData;
import TI13020190385.ProsesNilai;

public class Utama implements ProsesNilai {
    int tugas1,tugas2,tugas3,tugas4, mid, uas;
    Scanner sc = new Scanner(System.in);

    public void inputNilaiTugas() {
        System.out.println("Nilai Tugas 1 :");
        tugas1=sc.nextInt();
        System.out.println("Nilai Tugas 2 :");
        tugas2=sc.nextInt();
        System.out.println("Nilai Tugas 3 :");
        tugas3=sc.nextInt();
        System.out.println("Nilai Tugas 4 :");
        tugas4=sc.nextInt();
    }

    public void inputNilaiUjian() {
        System.out.println("Nilai MID :");
        mid=sc.nextInt();
        System.out.println("Nilai UAS :");
        uas=sc.nextInt();
    }

    public void InputNamaStb() {
        System.out.print("Nama    : ");
        String nama = sc.nextLine();
        System.out.print("Kelas    : ");
        String kelas = sc.nextLine();
        System.out.print("Stambuk : ");
        String stambuk = sc.nextLine();
    }

    public void InputPraktikum() {
        System.out.println("Nilai Praktikum 1 :");
        int praktikum1 = sc.nextInt();
        System.out.println("Nilai Praktikum 2 :");
        int praktikum2 = sc.nextInt();
        System.out.println("Nilai Praktikum 3 :");
        int praktikum3 = sc.nextInt();
        System.out.println("Nilai Praktikum 4 :");
        int praktikum4 = sc.nextInt();

    }

    public float nilaiTugas() {
        return ((tugas1+tugas2+tugas3+tugas4)/4);

    }

    @Override
    public float nilaiPratikum() {
        return 0;
    }

    public float nilaiPraktikum() {
        int praktikum1 = 0;
        int praktikum2 = 0;
        int praktikum3 = 0;
        int praktikum4 = 0;
        return ((praktikum1+praktikum2+praktikum3+praktikum4)/4);
    }

    public float nilaiAkhir(float tugas, float praktikum, float mid, float uas) {
        return (float) (((nilaiTugas()*0.2))+((nilaiPraktikum())*0.2)+(mid*0.3)+(uas*0.3));
    }
    public static void main(String[] args) {
        Utama ut = new Utama();
        ut.InputNamaStb();
        ut.InputPraktikum();
        ut.inputNilaiTugas();
        ut.inputNilaiUjian();
        double tugas = ut.nilaiTugas();
        double praktikum = ut.nilaiPraktikum();
        System.out.println("========================");

    }}
