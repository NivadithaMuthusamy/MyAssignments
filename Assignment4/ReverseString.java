package Assignment4;

public class ReverseString {

	public static void main(String[] args) {
		String text="feeling good";
		int length=text.length();
		System.out.println(length);
		char[]nameArray=text.toCharArray();
		int count=0;
		for(int i=nameArray.length-1;i>=0;i--) {
			count=count+nameArray[i];
			System.out.println(nameArray[i]);
		}

	}

}
