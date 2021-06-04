import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Write a description of class Main here.
 *
 * @author (Hayatun syauli)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String args[]){
        
        ArrayList<Integer> arri = new ArrayList<Integer>();
        ArrayList<String> arrs = new ArrayList<String>();
        ArrayListCustom<Integer> arrc = new ArrayListCustom<Integer>(false);
        ArrayList<Mahasiswa> arrm = new ArrayList<Mahasiswa>();
        
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
        
        //Menampilkan Hasil Update
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
    }
}