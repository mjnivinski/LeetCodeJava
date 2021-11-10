import java.util.*;

public class PascalsTriangle {
    public static void main(String args[]){
        //int[] nums = new int[]{1,2,3,4,5};
        print("Hellow World");
        generate(1);

        List<Integer> listy = new ArrayList<Integer>();
        listy.add(1);
        listy.add(5);
        System.out.println(listy.get(1));

        List<List<Integer>> theList = generate(5);

        for (List<Integer> list : theList) {
            for (Integer i  : list) {
                System.out.print(i + ",");
            }
            System.out.println();
        }
    }

    private static List<List<Integer>> generate(int numRows){

        List<List<Integer>> theList = new ArrayList<List<Integer>>();
        theList.add(new ArrayList<Integer>(Arrays.asList(1)));
        if(numRows == 1) return theList;
        theList.add(new ArrayList<Integer>(Arrays.asList(1,1)));
        if(numRows == 2) return theList;

        int row = 3;
        List<Integer> currentList = new ArrayList<Integer>();
        while(row <= numRows){
            currentList = new ArrayList<Integer>();
            currentList.add(1);
            for(int i=0; i<row-2; i++){
                //print("here: " + i);
                //print("1: " + theList.get(row-2).get(i+1));
                currentList.add(theList.get(row-2).get(i) + theList.get(row-2).get(i+1));
            }

            currentList.add(1);

            theList.add(currentList);
            row++;
        }
        
        return theList;
    }

    private static void print(String s){
        System.out.println(s);
    }
}
