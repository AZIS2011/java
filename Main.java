import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * class Main
 *
 * @author   M. RISKI AZIS
 * @version  1
 */
public class Main
{
    public static void main(String args[]){
        
        ArrayList<Integer> arri = new ArrayList<Integer>();
        ArrayList<String> arrs = new ArrayList<String>();
        ArrayListCustom<Integer> arrc = new ArrayListCustom<Integer>(false);
        ArrayList<Mahasiswa> arrm = new ArrayList<Mahasiswa>();
    
        
        /*
        //ArrayListCostum 
        arrc.add(2);
        arrc.add(1);
        arrc.add(5);
        arrc.add(4);
        
        
    
        arri.add(4);
        arri.add(5);
        arri.add(2);
        arri.add(1);
   
        
        arrs.add("Desi");
        arrs.add("Angel");
        arrs.add("Budi");
        arrs.add("Franco");
        
        */
        
      
        
        System.out.println("Data Mahasiswa");
        System.out.print("Jumlah Mahasiswa: ");
        Scanner input = new Scanner(System.in);
        int jumlah=0, nim=0,umur=0;
        String nama=null,alamat=null,kelas=null;
        jumlah = input.nextInt();
    
        //Menginput Data Mahasiswa
        for(int i=0; i < jumlah; i++){
            
            System.out.print("Nim ke-"+(i+1)+": ");
            nim = input.nextInt();
            System.out.print("Nama ke-"+(i+1)+": ");
            nama = input.next();
            System.out.print("Alamat-"+(i+1)+": ");
            alamat = input.next();
            System.out.print("Kelas-"+(i+1)+": ");
            kelas = input.next();
            System.out.print("Umur-"+(i+1)+": ");
            umur = input.nextInt();
            arrm.add(new Mahasiswa(nim,umur,nama,alamat,kelas));
            System.out.println("\n");
            
        }
        
        //Menampilkan Hasil Input
        System.out.println("\n");
        System.out.println("Menampilkan Data Mahasiswa");
        for (Mahasiswa mhs : arrm)
        {
            System.out.println("Nim : "+mhs.getnimMhs());
            System.out.println("Nama : "+mhs.getnamaMhs());
            System.out.println("Alamat : "+mhs.getalamatMhs());
            System.out.println("Kelas : "+mhs.getkelasMhs());
            System.out.println("Umur : "+mhs.getumurMhs());
            System.out.println("---------------------");
        }
        
        //Menampilkan Hasil Input Dengan di Sorting
        Collections.sort(arrm,new MahasiswaComparatorString());
        System.out.println("Menampilkan Data Mahasiswa Sesuai urutan String(Kelas)");
        for (Mahasiswa mhs: arrm)
        {
            System.out.println("Nim : "+mhs.getnimMhs());
            System.out.println("Nama : "+mhs.getnamaMhs());
            System.out.println("Alamat : "+mhs.getalamatMhs());
            System.out.println("Kelas : "+mhs.getkelasMhs());
            System.out.println("Umur : "+mhs.getumurMhs());
            System.out.println("---------------------");
        }
        
        
        //Menampilkan Hasil Input Dengan di Sorting
        Collections.sort(arrm,new MahasiswaComparator());
        System.out.println("Menampilkan Data Mahasiswa Sesuai urutan Integer(Umur)");
        for (Mahasiswa mhs: arrm)
        {
            System.out.println("Nim : "+mhs.getnimMhs());
            System.out.println("Nama : "+mhs.getnamaMhs());
            System.out.println("Alamat : "+mhs.getalamatMhs());
            System.out.println("Kelas : "+mhs.getkelasMhs());
            System.out.println("Umur : "+mhs.getumurMhs());
            System.out.println("---------------------");
        }
        
         
        //Menampilkan Hasil Input Dengan di Sorting
        Collections.sort(arrm,new MahasiswaComparatorString());
        System.out.println("Menampilkan Data Mahasiswa Sesuai urutan String(Nama)");
        for (Mahasiswa mhs: arrm)
        {
            System.out.println("Nim : "+mhs.getnimMhs());
            System.out.println("Nama : "+mhs.getnamaMhs());
            System.out.println("Alamat : "+mhs.getalamatMhs());
            System.out.println("Kelas : "+mhs.getkelasMhs());
            System.out.println("Umur : "+mhs.getumurMhs());
            System.out.println("---------------------");
        }
        
         
        //Menampilkan Hasil Input Dengan di Sorting
        Collections.sort(arrm,new MahasiswaComparatorString());
        System.out.println("Menampilkan Data Mahasiswa Sesuai urutan String(Alamat)");
        for (Mahasiswa mhs: arrm)
        {
            System.out.println("Nim : "+mhs.getnimMhs());
            System.out.println("Nama : "+mhs.getnamaMhs());
            System.out.println("Alamat : "+mhs.getalamatMhs());
            System.out.println("Kelas : "+mhs.getkelasMhs());
            System.out.println("Umur : "+mhs.getumurMhs());
            System.out.println("---------------------");
        }
        
     
        //Menampilkan Hasil Input Dengan di Sorting
        Collections.sort(arrm,new MahasiswaComparatorString());
        System.out.println("Menampilkan Data Mahasiswa Sesuai urutan Integer(Nim)");
        for (Mahasiswa mhs: arrm)
        {
            System.out.println("Nim : "+mhs.getnimMhs());
            System.out.println("Nama : "+mhs.getnamaMhs());
            System.out.println("Alamat : "+mhs.getalamatMhs());
            System.out.println("Kelas : "+mhs.getkelasMhs());
            System.out.println("Umur : "+mhs.getumurMhs());
            System.out.println("---------------------");
        }
        
        
        //Mencari data Mahasiswa
        System.out.println("\nSearch Data Mahasiswa");
        int cariNim;
        System.out.print("Cari NIM: ");
        cariNim = input.nextInt();
        System.out.println("Hasil yang dicari:");
        for (Mahasiswa mhs : arrm)
        {
            if(mhs.getnimMhs() == cariNim){
                System.out.println("Nim : "+mhs.getnimMhs());
                System.out.println("Nama : "+mhs.getnamaMhs());
                System.out.println("Alamat : "+mhs.getalamatMhs());
                System.out.println("Kelas : "+mhs.getkelasMhs());
                System.out.println("Umur : "+mhs.getumurMhs());
            }
        }
        
        
        
        //Mengupdate data Mahasiswa
        System.out.println("\nUpdate Data Mahasiswa");
        System.out.print("Nim Yang Di Update: ");
        cariNim = input.nextInt();
        for (Mahasiswa mhs : arrm)
        {
            if(mhs.getnimMhs() == cariNim)
            {
                System.out.print("Nama : ");
                nama = input.next();
                mhs.setnamaMhs(nama);
                
                
                System.out.print("Alamat : ");
                alamat = input.next();
                mhs.setalamatMhs(alamat);
                
                System.out.print("Kelas : ");
                kelas = input.next();
                mhs.setkelasMhs(kelas);
                
                System.out.print("Umur : ");
                umur = input.nextInt();
                mhs.setumurMhs(umur);
            }
            
        }
        
        //Menampilkan Hasil Update
        System.out.println("\n");
        System.out.println("Data Setelah di Update");
        for (Mahasiswa mhs : arrm)
        {
            System.out.println("Nim : " +mhs.getnimMhs());
            System.out.println("Nama : " +mhs.getnamaMhs());
            System.out.println("Alamat : "+mhs.getalamatMhs());
            System.out.println("Kelas : "+mhs.getkelasMhs());
            System.out.println("Umur : "+mhs.getumurMhs());
            System.out.println("-----------------------------");
        }
        
        /*
        //Menghapus data Mahasiswa
        System.out.println("\nMenghapus Data Mahasiswa");
        System.out.print("Masukkan NIM yang ingin Dihapus: ");
        cariNim = input.nextInt();
        for (Mahasiswa mhs : arrm)
        {
            if(mhs.getnimMhs() == cariNim){
                arrm.indexOf(mhs);
                arrm.remove(arrm.indexOf(mhs));
            }
        }
        
        //Menampilkan Hasil Setelah Dihapus
        System.out.println("\n");
        System.out.println("Data Setelah di Dihapus");
        for (Mahasiswa mhs : arrm)
        {
            System.out.println("Nim : " +mhs.getnimMhs());
            System.out.println("Nama : " +mhs.getnamaMhs());
            System.out.println("Alamat : "+mhs.getalamatMhs());
            System.out.println("Kelas : "+mhs.getkelasMhs());
            System.out.println("Umur : "+mhs.getumurMhs());
            System.out.println("-----------------------------");
        }
        */
         
       
        System.out.println("Menampilkan Data Mahasiswa");
        for (Mahasiswa mhs: arrm)
        {
            if(mhs.getnimMhs() == 1001)
            {
                arrm.indexOf(mhs);
                arrm.remove(arrm.indexOf(mhs));
                break;
            }
            System.out.println(mhs.getnimMhs()+" - "+ mhs.getnamaMhs());
        }    
        
          
       
        
       
      
        
        /*
        System.out.println("");
        Collections.sort(arrc);
        System.out.println("Menampilkan Nilai Array List Custom");
        for (int i=0; i < arrc.size(); i++){
            System.out.println(arrc.get(i));
        }
        
        
        System.out.println("----------------------------------------------------");
        System.out.println("----------------------------------------------------");
        System.out.println("Menampilkan Nilai Array List dengan for biasa");
        for(int i=0; i < arri.size(); i++){
            System.out.println(arri.get(i));
            //System.out.println(arrs.get(i));
        }
        
        System.out.println("");
        Collections.sort(arri);
        System.out.println("Menampilkan Nilai Array List iterator");
        for (Integer valx: arri){
            System.out.println(valx);
        }
        
        System.out.println("");
        System.out.println("Menampilkan Nilai Array sebelum sort");
        for (String valx: arrs){
            System.out.println(valx);
        }
        
        System.out.println("");
        Collections.sort(arrs);
        System.out.println("Menampilkan Nilai Array setelah sort");
        for (String valx: arrs){
            System.out.println(valx);
        }
            
        */
   
    }
    
}