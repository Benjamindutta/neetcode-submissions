class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();

        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        int max_len=0;
        for(Integer i: hs){
            if(!hs.contains(i-1)){
                int len=1;
                while(hs.contains(i+len)){
                    len++;
                }
                max_len=Math.max(len,max_len);
            }
        }

        return max_len;

        
    }
}
