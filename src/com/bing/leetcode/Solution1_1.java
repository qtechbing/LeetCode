package com.bing.leetcode;

import java.util.Arrays;

public class Solution1_1 {

	public static void main(String[] args){
		
		int [] array={0, 4 , 3, 0};
		int target = 0;
		int abc[] = twoSum(array, target);
		System.out.println("ha"); // �����ڴ˴����öϵ���ԣ��Ϳ��Կ���ִ��֮��Ľ����
	}
	
	 public static int[] twoSum(int[] nums, int target) { 
		 // ��һ��ķ��������ֶ�������п�������Ȼ��������ָ��ָ������֮������飬�ֱ�����ָ����ָ���ݽ�����ӣ�
		 // �ٺ�target��ȣ����С��target��i++������target��j--���������
			
	        int i, j, result[] = new int[2];
	        int tmp[] = new int[nums.length];
	        for(i = 0; i < nums.length; i++)
	        {
	        	tmp[i] = nums[i];
	        }
	        
	        Arrays.sort(nums); // ��������п���
	        
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
