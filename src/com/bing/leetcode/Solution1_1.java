package com.bing.leetcode;

import java.util.Arrays;

public class Solution1_1 {

	public static void main(String[] args){
		
		int [] array={0, 4 , 3, 0};
		int target = 0;
		int abc[] = twoSum(array, target);
		System.out.println("ha"); // 可以在此处设置断点调试，就可以看到执行之后的结果了
	}
	
	 public static int[] twoSum(int[] nums, int target) { 
		 // 第一题的方法二，现对数组进行快速排序，然后用两个指针指向排序之后的数组，分别将两个指针所指内容进行相加，
		 // 再和target相比，如果小于target则i++，大于target则j--，否则即相等
			
	        int i, j, result[] = new int[2];
	        int tmp[] = new int[nums.length];
	        for(i = 0; i < nums.length; i++)
	        {
	        	tmp[i] = nums[i];
	        }
	        
	        Arrays.sort(nums); // 对数组进行快排
	        
	        for(i = 0, j = nums.length - 1; i < j;)
	        {
	        	if(nums[i] + nums[j] < target)
	        	{
	        		i++;
	        	}
	        	else if(nums[i] + nums[j] > target)
	        	{
	        		j--;
	        	}
	        	else
	        	{
	        		result[0] = i;
	        		result[1] = j;
	        		break;
	        	}
	        }
	        
	        for(i = 0; i < tmp.length; i++)
	        {
	        	if(tmp[i] == nums[result[0]])
	        	{
	        		result[0] = i;
	        		break;
	        	}
	        }
	        for(i = tmp.length - 1; i >= 0; i--)
	        {
	        	if(tmp[i] == nums[result[1]])
	        	{
	        		result[1] = i;
	        		break;
	        	}
	        }
			return result;
	    }
}
