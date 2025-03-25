import java.util.*;
class sortByLength {
    public static void main(String[] args) {
        String arr[]={"Shyam", "Ram", "Ruhi", "Sonali"};
        ArrayList<String>result=sum(arr);
        System.out.println(result);
    }
    public static ArrayList<String> sum(String arr[]){
        ArrayList<String> st=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            st.add(arr[i]);// add array in list
        }
        for(int i=0;i<st.size()-1;i++){
            for(int j=i+1;j<st.size();j++){
//here we check the condition that compare lengths of strings at index i and j
              if(st.get(i).length()>(st.get(j).length())){
                String temp=st.get(i);
                st.set(i, st.get(j));//Swap if the string at i is longer than the one at j
                st.set(j, temp);
                }
            }
        }
        return st;
    }
}
