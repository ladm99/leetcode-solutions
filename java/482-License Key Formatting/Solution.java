class Solution {
    public String licenseKeyFormatting(String s, int k) {
        String l = s.replace("-","");
        l = l.toUpperCase();
        int mod = l.length() % k;
        StringBuilder out = new StringBuilder();
        int length = 0;
        for(int i = 0; i < l.length(); i++){
            if(mod != 0 && out.length() == mod){
                out.append("-");
                length = 0;
            } if(length == k){
                out.append("-");
                length = 0;
            } if(length < k){
                out.append(l.charAt(i));
                length++;
            }
            
            //System.out.println(out.toString() + "," + length);
        }
        
        return out.toString();
    }
}