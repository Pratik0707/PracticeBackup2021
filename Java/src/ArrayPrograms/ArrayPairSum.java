package ArrayPrograms;
//Write a java program to find all pairs of elements in an integer array whose sum is equal to a given number

public class ArrayPairSum {
	public static void main(String[] args) {
		int[]p = {2,1,3,4,5,0,6};
		int val = 5;
		for(int i=0;i<p.length;i++)
		{
			for(int j=i+1;j<p.length;j++)
			{
				if(p[i]+p[j]==val)
				{
					System.out.println("Array Pair whose sum = "+val+" is :"+p[i]+" "+p[j]);
				}
			}
		}
	}
}
