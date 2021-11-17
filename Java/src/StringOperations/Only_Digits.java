package StringOperations;
// WAP to check if a string possess only characters.
public class Only_Digits {

	public static void main(String[] args) {

		String str = "10578p3";

		for (int i = 0; i<str.length(); i++) 
		{		 
			// Check if character is digit from 0-9 then return true else false			
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') 
			{
				System.out.println("character "+str.charAt(i)+ " is digit");
			}
			else 
			{
				System.out.println("character "+str.charAt(i)+ " is NOT digit");
			}
		}
	}
}

        // >>>>>>>>> EASY WAY : 

//for (int i = 0; i < str.length(); i++) 
//{
//    if (Character.isDigit(str.charAt(i))) 
//    {
//		System.out.println("character "+str.charAt(i)+ " is digit");
//	}
//	else 
//	{
//		System.out.println("character "+str.charAt(i)+ " is NOT digit");
//	}
//}




