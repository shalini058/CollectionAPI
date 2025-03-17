import java.util.*;
class  beginnerLeverQuestionsOfArrayList{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        ArrayList<Integer> l=new ArrayList<>();
        l=printArrayList(arr);
        System.out.println("Adding all elements of array in arrayList "+ l);
        l.remove(l.size()-1);// 
        System.out.println("Remove last element from the list "+ l);
        int sum=sumOfArrayList(l);
        System.out.println("sum of arrayList "+sum);
    }

   // Method to convert an integer array to an ArrayList of integers
    public static ArrayList<Integer> printArrayList(int arr[]){
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            al.add(arr[i]);//adding array elements in arrayList.
        }
        return al;
    }
    public static int sumOfArrayList(ArrayList<Integer> al){
        int sum=0;
        for(int i=0;i<al.size();i++){
            sum+=al.get(i);
        }
        return sum;
    }
}
