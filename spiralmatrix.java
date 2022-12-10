class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> nums = new LinkedList<>();
        int top = 0, down = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;
        while(true)
        {
            for(int i = left; i <= right; i++)
            {
                nums.add(matrix[top][i]);
            }
            top++;
            if(left > right || top > down) break;
            for(int i = top; i <= down; i++)
            {
                nums.add(matrix[i][right]);
            }
            right--;
            if(left > right || top > down) break;
            for(int i = right; i >= left; i--)
            {
                nums.add(matrix[down][i]);
            }
            down--;
            if(left > right || top > down) break;
            for(int i = down; i >= top; i--)
            {
                nums.add(matrix[i][left]);
            }
            left++;
            if(left > right || top > down) break;
        }
        return nums;
    }
}