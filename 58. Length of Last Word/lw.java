class Solution {
    public int lengthOfLastWord(String s) {
        
        int j=0;
        int c=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' ' && c==1){
                return j;
            }
            if(Character.isLetter(s.charAt(i))){
                j++;
                c=1;
            }
            
        }
        return j;
    }
}
