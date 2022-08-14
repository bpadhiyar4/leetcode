class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<numRows;i++) {
            List<Integer> subList = new ArrayList<>();
            for(int j = 0; j<=i; j++) {
                if(j == 0 || j == i) {
                    subList.add(1);
                } else {
                    List<Integer> upList = ans.get(i-1);
                    subList.add(upList.get(j-1) + upList.get(j));
                }
            }
            
            ans.add(subList);
        }
        
        return ans;
    }
}