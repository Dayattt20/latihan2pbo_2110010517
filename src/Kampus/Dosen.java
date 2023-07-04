package Kampus;

public class Dosen {
  
     private String nama;
     private String nidn;
     private String matakuliah;

    public Dosen(String nidn, String nama, String matakuliah)
        this.nama = nama;
        this.nidn = nidn;
        this.matakuliah = matakuliah;
    }
  
    public String setDetail(){
        return nidn + nama + matakuliah;
    }

    public String getMatakuliah() {
        return matakuliah;
    }

    public void setMatakuliah(String matakuliah) {
        this.matakuliah = matakuliah;
    }