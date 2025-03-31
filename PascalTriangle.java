// Time Complexity : O(numRows^2) 
// Space Complexity : O(numRows^2) 
// Did this code successfully run on Leetcode : Yes

// Approach:
// 1. Start with the first row as `[1]` and iteratively build each subsequent row using the previous row.
// 2. Each row starts and ends with `1`, while the middle elements are the sum of two adjacent elements from the previous row.
// 3. Store each generated row in a list and return the complete Pascal’s Triangle.


import java.util.*;

public class PascalTriangle  
{
    public List<List<Integer>> generate(int numRows) {
        List<Integer> arr = new ArrayList<>();
        List<List<Integer>> op  = new ArrayList<List<Integer>>();
        arr.add(1);
        op.add(new ArrayList<>(arr));
        if(numRows==1)
        {
            return op;
        }
        arr.add(1);
        op.add(new ArrayList<>(arr));
        int j= 0;
        if(numRows==1)
        {
            return op;
        }
        else
        {
            while(j!=numRows-2)
            {
                List<Integer> dummy = new ArrayList<>();
                for(int i=0;i<arr.size()-1;i++)
                {
                    dummy.add(arr.get(i) + arr.get(i + 1));
                }
                while(arr.size()!=1)
                {
                    arr.remove(1);
                }
                for(int i=0;i<dummy.size();i++)
                {
                    arr.add(dummy.get(i));
                }
                arr.add(1);
                op.add(new ArrayList<>(arr));
                j++;
            }
        }
        return op;
    }
}