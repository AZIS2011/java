import java.util.Comparator;

/**
 * MahasiswaComparatorString 
 *
 * @author   M. RISKI AZIS
 * @version  1
 */
public class MahasiswaComparatorString implements Comparator<Mahasiswa>
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class MahasiswaComparatorString
     */
    public MahasiswaComparatorString()
    {
        // initialise instance variables
       
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    @Override
    public int compare(Mahasiswa mhs1, Mahasiswa mhs2)
    {
        // put your code here
        //return mhs1.getnamaMhs().compareTo(mhs2.getnamaMhs());
        //return mhs1.getalamatMhs().compareTo(mhs2.getalamatMhs());
        return mhs1.getkelasMhs().compareTo(mhs2.getkelasMhs());
    }
   
}