class Solution {
    public boolean isAnagram(String s, String t) {
        boolean ans = false;
        char temp1[] = s.toCharArray();
        char temp2[] = t.toCharArray();
        Arrays.sort(temp1);
         Arrays.sort(temp2);

        if(Arrays.equals(temp2,temp1)== true){
            ans = true;
        }
    return ans;
    }
}
