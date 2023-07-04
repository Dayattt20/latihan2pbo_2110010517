package Kampus;

public class Dosen {
  
     private String nama;
     private String nidn;
     private String matakuliah;

    public Dosen(String nidn, String nama, String matakuliah) {
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
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNidn() {
        return nidn;
    }
    
    public void setNidn(String nidn) {
        this.nidn = nidn;
    }
}
