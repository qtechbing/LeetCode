package com.bing.leetcode;

public class Solution1 {

	public static void main(String[] args) {
		int nums[] = {2, 7, 11, 15}, ta = 9;
		int a[] = twoSum(nums, ta);
		for(int i = 0; i<a.length;i++){
			System.out.println(a[i]);
		}
	}
	
	// �򵥵�ͨ������ѭ���жϣ�ʱ�临�Ӷ���O(n*n)
	public static int[] twoSum(int[] nums, int target) {
        int i, j, result[] = new int[2];
        for(i = 0; i < nums.length; i++)
        {
        	for(j = i + 1; j < nums.length; j++ )
        	{
        		if(nums[i] + nums[j] == target)
        		{
        			result[0] = i;
        			result[1] = j;
        		}
        	}
        }
		return result;
    }
}

