public class LongestCommonPrefix {
    public static void main(String args[]){
        System.out.println("Hellow World!");
        String[] words = new String[]{"floor", "flouse", "flood","b"};

        System.out.println(method(words));

        String str = "hello";
        //System.out.println(str.substring(0,str.length()-1));
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.substring(0, i));
        }
        //String str2 = "helk";
        //System.out.println(str.indexOf(str2));
    }

    private static String method(String[] words){
        if(words.length == 0) return "";
        String prefix = words[0];

        for(int i=1; i<words.length; i++){
            while(words[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0,prefix.length() - 1);
                if(prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}
