package Kampus;

public class Dosenberaksi {
    
public static void main(String[] args){
            
Dosen datadiri = new Dosen("2110010517", "Muhammad Miftah Hidayat", " PBO");
       
    System.out.println("Nama    : "+datadiri.getNama());
    System.out.println("Nidn     : "+datadiri.getNidn());
    System.out.println("Matakuliah  : "+datadiri.getMatakuliah());
        
    System.out.println(datadiri.setDetail());
}
}
