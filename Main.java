import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
/**
 * class Main 
 *
 * @author   abjal riski
 * @version  0.02
 */
public class Main
{
    public static void main(String args[]){
        
        //ArrayList<Integer> arri = new ArrayList<Integer>();
        //ArrayList<String> arrs = new ArrayList<String>();
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
            System.out.print("Alamat "+(i+1)+": ");
            alamat = input.next();
            System.out.print("Kelas "+(i+1)+": ");
            kelas = input.next();
            System.out.print("Umur "+(i+1)+": ");
            umur = input.nextInt();
            arrm.add(new Mahasiswa(nim,umur,nama,alamat,kelas));
            System.out.println("\n");
            
        }
        
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
        
       
    }
    
}