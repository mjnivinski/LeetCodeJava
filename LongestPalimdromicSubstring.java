public class LongestPalimdromicSubstring {
    public static void main(String args[]){
        System.out.println(BruteForce("a"));
        System.out.println(BruteForce("aa"));
        System.out.println(BruteForce("aaa"));
        System.out.println(BruteForce("abab"));
        System.out.println(BruteForce("babab"));
        System.out.println(BruteForce("babbab"));

        int i=0; int j=2;
        System.out.println("ya: " + (j - i + 1)/2);
    }

    private static int BruteForce(String s){
        int champ = 0;
        int champLength = 1;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                boolean pal = true;

                for (int k = 0; k < (j - i + 1)/2; k++) {
                    if(s.charAt(i + k) != s.charAt(j - k)) pal = false;
                }

                if(pal && (j - i + 1) > champLength){
                    champ = i;
                    champLength = (j - i + 1);
                }
                
            }
        }

        SubstringPrinter(s, champ, champ + champLength - 1);

        return champLength;
    }

    private static void SubstringPrinter(String s, int start, int end){
        String str = "";

        for (int i = start; i <= end ; i++) {
            str += s.charAt(i);
        }

        System.out.println(str);
    }

    /*
    private static String LongestSubstringPalindrome(String s){
        String champion = "" + s.charAt(0);

        for(int i=1; i<s.length()-1; i++){
            String challenger = "" + s.charAt(i);
            int j=1;
            while(s.charAt(i  - j) == s.charAt(i + j)){
                j++;
            }
            if(challenger.length() > champion.length()) champion = "" + challenger;
        }

        return champion;
    }*/

}
