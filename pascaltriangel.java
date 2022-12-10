class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new LinkedList<>();
        if(numRows < 1) return ans;
        List<Integer> pre = new ArrayList<>();
        pre.add(1);
        ans.add(pre);
        for(int i = 1; i < numRows; i++)
        {
            List<Integer> sub = new LinkedList<>();
            sub.add(1);
            for(int j = 1; j < i; j++)
            {
                int val = pre.get(j) + pre.get(j - 1);
                sub.add(val);
            }
            sub.add(1);
            ans.add(sub);
            pre = sub;
        }
        return ans;
    }
}