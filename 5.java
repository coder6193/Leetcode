class Solution {
    int maxLength=0;
    int start=-1;
    public String longestPalindrome(String s) {
        if(s==null||s.length()==0){
            return "";
        }
        for(int i=0;i<s.length();i++){
            checkpalindrome(s,i,i);
            checkpalindrome(s,i,i+1);
        }
        return s.substring(start,start+maxLength);
    }
    
    public void checkpalindrome(String s, int i,int j){
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            if(j-i+1>maxLength){
                maxLength=j-i+1;
                start=i;
            }
            i--;
            j++;
        }
    }
}

/*
Questions to ask:
1. 

Mistakes done:
1.s.substring --> substring is a single name so both s's should be small.
2. Also the start should be updated only when max is updated which i did wrong in first attempt.
3.many syntax mistakes which can be solved by looking code twice 


*/