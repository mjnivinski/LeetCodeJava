import java.util.*;

public class PascalsTriangleIndex {
    public static void main(String args[]){
        //int[] nums = new int[]{1,2,3,4,5};

        int number = 155117250;
        System.out.println(number);
        List<Integer> listy = new ArrayList<Integer>();
        listy.add(1);
        listy.add(5);
        System.out.println(listy.get(1));

        List<Integer> theList = generate(30);

        for (Integer i  : theList) {
            System.out.print(i + ",");
        }
        System.out.println();
        print("1,30,435,4060,27405,142506,593775,2035800,5852925,14307150,30045015,54627300,86493225,119759850,145422675,155117520,145422675,119759850,86493225,54627300,30045015,14307150,5852925,2035800,593775,142506,27405,4060,435,30,1");
    }

    private static List<Integer> generate(int rowIndex){

        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1));

        for (int k = 0; k < rowIndex; k++) {
            long d = (list.get(k) * (rowIndex - k) / (k+1));
            list.add((int)d);
        }

        return list;
        /*
        List<List<Integer>> theList = new ArrayList<List<Integer>>();
        theList.add(new ArrayList<Integer>(Arrays.asList(1)));
        theList.add(new ArrayList<Integer>(Arrays.asList(1,1)));
        if(rowIndex < 2) return theList.get(rowIndex);

        int row = 2;
        List<Integer> currentList = new ArrayList<Integer>();
        while(row <= rowIndex){
            currentList = new ArrayList<Integer>();
            currentList.add(1);
            for(int i=0; i<row-1; i++){
                //print("here: " + i);
                //print("1: " + theList.get(row-2).get(i+1));
                currentList.add(theList.get(row-1).get(i) + theList.get(row-1).get(i+1));
            }

            currentList.add(1);

            theList.add(currentList);
            row++;
        }
        
        return theList.get(rowIndex);*/
    }

    private static void print(String s){
        System.out.println(s);
    }
}
