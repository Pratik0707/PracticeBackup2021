package ArrayPrograms;
import java.util.Arrays;
////WAP to find common elements in 3 arrays
public class ArrayCommonInThree {

	public static void main(String[] args) {
		int[]a = {10,5,8,3,14};
		int[]b = {88,63,14,8,3};
		int[]c = {10,5,8,3,14};

		Arrays.sort(a); Arrays.sort(b); Arrays.sort(c);
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				for(int k=0;k<c.length;k++)
				{
					if(a[i]==b[j] && b[j]==c[k])
					{
						System.out.println("Common element is : "+a[i]);
					}
				}
			}
		}
	}
}
