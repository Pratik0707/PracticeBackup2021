package StringOperations;

public class ReverseName {

	public static void main(String[] args) {
		String given = "Pratik Toke";
		String[]givenSplit = given.split(" ");
		String partOne = givenSplit[0];
		String partTwo = givenSplit[1];
		StringBuilder One = new StringBuilder(partOne);
		StringBuilder Two = new StringBuilder(partTwo);
		String output1 = One.reverse().toString();
		String output2 = Two.reverse().toString();
		String finalOutput = output1+" "+output2;
		System.out.println("Reversed string : "+finalOutput);		
	}
}
