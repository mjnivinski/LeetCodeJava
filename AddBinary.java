public class AddBinary {
    public static void main(String args[]){
        System.out.println(method("1010","1011"));
    }

    private static String method(String a, String b){
        while(a.length() < b.length()) a = "0" + a;
        while(a.length() > b.length()) b = "0" + b;
        int i=0;
        int carry = 0;
        int bit;
        String s = "";
        int al = a.length();
        int bl = b.length();
        while(i < al || i < bl){
            bit = a.charAt(al-1-i) + b.charAt(bl-1-i) + carry - '0' - '0';
            s = (bit%2) + s;
            if(bit > 1) carry = 1;
            else carry = 0;
            i++;
        }
        if(carry == 1) s = '1' + s;
        return s;
    }
}
