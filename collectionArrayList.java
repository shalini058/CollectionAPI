/*

Collection: A group of objects (like List, Set, Queue) in Java, used to store and manage data.
API: A set of predefined methods and classes that allow you to interact with software or services without needing to 
know the details of their implementation.

                         List Like:- ArrayList, LinkedList
                         Queue :- Dequeue
                         Set: HashSet, LinkedHashSet
*/

//It is an example of collection ArrayList 
import java.util.Collection; //import Collection
import java.util.ArrayList; //import ArrayList
public class collectionArrayList
{
	public static void main(String[] args) 
	{
	    // Create a Collection reference and initialize it as an ArrayList
		Collection nums= new ArrayList();// row type Collection
		//Collection <Integer> nums=new ArrayList<Integer>();//declared Collection
		
		//Add elements to the collection
		nums.add(1);
		nums.add(2);
		
		
		System.out.println(nums);//print collection 
		
		
		// Convert the Collection to an ArrayList of integers
		ArrayList <Integer> al=new ArrayList<>(nums);
		
		// Iterate through the ArrayList and print each element one by one
		for(int i=0;i<al.size();i++)
		{
		System.out.println(al.get(i));//output
		}
	}
}
