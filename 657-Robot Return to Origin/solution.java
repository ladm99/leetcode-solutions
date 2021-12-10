class Solution {
    public boolean judgeCircle(String moves) {
        int v = 0;
        int h = 0;
        
        for(int i = 0; i < moves.length(); i++){
            String cur = moves.substring(i, i+1);
            if(cur.equals("U"))
                v++;
            else if(cur.equals("D"))
                v--;
            else if(cur.equals("L"))
                h--;
            else if(cur.equals("R"))
                h++;
        }
        
        return (v == 0 && h == 0);
    }
}