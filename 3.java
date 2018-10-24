class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null||s.length()==0){
            return 0;
        }
        int[] arr=new int[256];
        for(int i=0;i<256;i++){
            arr[i]=-1;
        }
        
        int i=0;
        int j=0;
        int result=0;
        while(i<=j&& j<s.length()){
            int t=(int)s.charAt(j);
            i=Math.max(arr[t]+1,i);
            arr[t]=j;
            result=Math.max(result,j-i+1);
            j++;
        }
        return result;
    }
}

/*
Questions to ask:
1. 

Mistakes done:
1.Thought number of characters are only alphabets which throwed an error. so always consider arr[256] when doing problems related to chracaters
2.j variable is not incremented. This is common error in many of my codes.
3. str1.equals(str2) syntax is not written correctly

Other optimal solutions:
Can use a map instead of 256 array.
*/