package B4;
public abstract class DataMahasiswa {
    int tugas1,tugas2,tugas3,tugas4,mid,uas;
    public int praktikum1,praktikum2,praktikum3,praktikum4;
    public String nama,kelas,stambuk;

    public abstract void inputNilaiTugas();
    public abstract void inputNilaiUjian();

    public void tampilNilai(){
        System.out.println("==========================");
        System.out.println("Nama:"+ nama);
        System.out.println("Stambuk :"+ stambuk);
        System.out.println("Kelas :"+ kelas);
        System.out.println("Nilai Praktikum 1:"+ praktikum1);
        System.out.println("Nilai Praktikum 2:"+ praktikum2);
        System.out.println("Nilai Praktikum 3:"+ praktikum3);
        System.out.println("Nilai Praktikum 4:"+ praktikum4);
        System.out.println("Nilai Tugas1:"+ tugas1);
        System.out.println("Nilai Tugas2:"+ tugas2);
        System.out.println("Nilai Tugas3:"+ tugas3);
        System.out.println("Nilai Tugas4:"+ tugas3);
        System.out.println("Nilai MID :"+ mid);
        System.out.println("Nilai Final :"+ uas);
    }


}