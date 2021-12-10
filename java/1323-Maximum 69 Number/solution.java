class Solution {
    public int maximum69Number (int num) {
        
        String x = num + "";
        if(!x.contains("6"))
            return num;
        
        int index = x.indexOf("6");
        x = x.substring(0, index) + "9" + x.substring(index + 1);
        return Integer.parseInt(x);
    }
}