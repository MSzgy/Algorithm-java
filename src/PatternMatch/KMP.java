package PatternMatch;

/**
 * ClassName KMP
 * Description TODO
 * Author zgy
 * Date 2020/3/29 16:28
 * Version 1.8
 **/

public class KMP {
    public int[] get_next(String pattern){
        int len = pattern.length();
        int i = -1; int j = 0;
        int[] next = new int[pattern.length()];
        next[0] = -1;
        while(j < len - 1){
            while(i >= 0 && pattern.charAt(i) != pattern.charAt(j)){
                i = next[i];
            }
            next[++j] = ++i;
        }
        for(int k = 0; k < pattern.length(); k++){
            System.out.print(next[k] + " ");
        }
        return next;
    }

    public int ismatched(String str, String pat){
        int[] next = get_next(pat);
        int i = 0; int j = 0;
        for(i = 0; i < str.length(); i++){
            while(j > 0 && str.charAt(i) != pat.charAt(j)){
                j = next[j];
            }

            if(str.charAt(i) == pat.charAt(j)){
                j++;
            }
            if(j == pat.length()){
                return i - j + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String pat = "abaabca";
        String str = "acdadsaabaabca";
        KMP kmp = new KMP();
        System.out.println(kmp.ismatched(str, pat));
    }
}
