import java.util.ArrayList;
import java.util.HashSet;

/**
 * class ArrayListCustom 
 *
 * @author   M. RISKI AZIS
 * @version  1
 */
public class ArrayListCustom<E> extends ArrayList<E>
{
    public boolean allowDuplicates;
    
    public ArrayListCustom(boolean allowDuplicates)
    {
        this.allowDuplicates = allowDuplicates;
    }
    
    HashSet <Object> mySet = new HashSet<Object>();
    public boolean add(E e){
        if(this.allowDuplicates == false && mySet.add(e) == false)
{
      
        }else if(this.allowDuplicates == true && mySet.add(e) == false)
        {
            super.add(e);
        }
        return allowDuplicates;
    }
    
}