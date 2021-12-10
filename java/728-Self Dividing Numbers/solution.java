class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> out = new ArrayList<>();
        for(int i = left; i <= right; i++){
            String s = i + "";
            int num = i;
            boolean good = true;
            for(int x = 0; x < s.length(); x++){
                if(num % Integer.parseInt(s.substring(x,x+1)) != 0 || s.contains("0")){
                    good = false;
                    break;
                }
            }
            
            if(good == true){
                out.add(num);
            } else{
                good = true;
            }
        }
        
        return out;
    }
}