//import java.util.*;

public class ExcelSheetColumn {
    public static void main(String args[]){
        //int[] nums = new int[]{1,2,3,4,5};
        //System.out.println(convertToTitle(28));
        for (int i = 50; i < 55; i++) {
            System.out.println(convertToTitle(i) + " " + i);
        }
    }

    private static String convertToTitle(int columnNumber){
        String str = "";
        while(columnNumber > 0){
            columnNumber--;
            str = (char)((int)'A' + (columnNumber % 26)) + str;
            columnNumber /= 26;
        }
        return str;
    }
}
