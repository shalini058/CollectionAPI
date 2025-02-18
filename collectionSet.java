//Basically Set is the collection that contains no duplicated and it does not even have an index is not mentioned anywhere.
import java.util.Collection;
import java.util.*;
public class collectionSet
{
	public static void main(String[] args) 
	{
	    //create a HashSet
	    HashSet <Integer> al=new HashSet<>();
	    //Collection<Integer> al=new TreeSet<>();
	    
	    al.add(6);//adding some values
	    al.add(7);
	    al.add(2);
	    al.add(6);// Trying to add 6 again (this will be ignored because HashSet does not allow duplicates)
	    al.add(3);
	    
	    
	    //Before Collection there is an interface which is Iterator
	    //Create an Iterator
	    Iterator<Integer> values=al.iterator();
	    
	    while(values.hasNext())//it is used to check if there are more elements in a collection 
	    {
	        System.out.println(values.next());//using values.next() we will get only one element so before that we will use hasNext()
	    }
	    
	    //Removes duplicates from the array and print without duplicates
	    System.out.println(al);//print output [2,3,6,7]
	    
	    //It's not giving a sorted order.
	    //If we want the elements to be sorted, we can use TreeSet, which will sort them automatically.
	}
}
