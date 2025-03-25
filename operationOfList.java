import java.util.*;
class operationOfList {
    public static void main(String[] args) {
        //String arr[]={"Shyam","Ram","Aam","Akash","shiv"};
        int arr[]={1,2,2,3,4,3,5};
        ArrayList<Integer> res=removeFun(arr);
        System.out.println(res);
    }
  //public static ArrayList<String> removeString(String [] arr){
// Here I created a method that takes an integer array as input 
// and returns an ArrayList<Integer> after processing.
    public static ArrayList<Integer> removeFun(int arr[]){
        ArrayList<Integer> al=new ArrayList<>();
        ArrayList<Integer> num=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            al.add(arr[i]);
           
            }
            for(int i=0;i<al.size();i++){
//if list containing same number or duplicates then it will removed and print it without duplicates
                 if(!num.contains(al.get(i))){
                    num.add(al.get(i));
                
            }
//This operation use for if condition satisfy like here the condition is remove the string which are started from "A";
           // al.removeIf(s -> s.startsWith("A"));
        }
        
        return num;
    }
}
