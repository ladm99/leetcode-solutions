class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        String out = "";
        for(int i = 0; i < words.length; i++){
            out += reverse(words[i]) + " ";
        }
        return out.trim();
    }
    
    public static String reverse(String s){
        return new StringBuilder(s).reverse().toString();
    }
}