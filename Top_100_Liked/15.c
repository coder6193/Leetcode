class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list= new ArrayList<List<Integer>>();
        
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            else{
                int start=i+1;
                int end=nums.length-1;
                while(start<end){
                    if(start>i+1 && nums[start]==nums[start-1]){
                        start++;
                        continue;
                    }
                    if((nums[start]+nums[end])==-(nums[i])){
                        List<Integer> list1= new ArrayList<Integer>();
                        list1.add(nums[i]);
                        list1.add(nums[start]);
                        list1.add(nums[end]);
                        list.add(list1);
                        start++;
                        end--;
                    }
                    else if(nums[start]+nums[end]>-(nums[i])){
                        end--;
                    }
                    else{
                        start++;
                    }
                }
            }
        }
        
        return list;
    }
}

/*
Questions to ask:
1. 

Mistakes done:
1. Didn't read question correctly. Thought there is some target value.
2. Read your code always twice. This helps to find both naming problems, logic flaws and some operation you forget.
ex: I assumed array as arr instead as nums.
	I forgot writing Arrays.sort at first.
	forgot start++ and end-- when matches.

Other optimal solutions:
All top answers followed the same approach

*/