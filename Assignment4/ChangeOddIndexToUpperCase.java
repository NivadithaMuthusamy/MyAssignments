package Assignment4;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String text1="changeme";
		String text2="";
		int count=0;
		char[]name=text1.toCharArray();
		
		for(int i=0;i<name.length;i++) {
			if(i%2!=0) {
				count++;
				text2=text2+name[i];
				
			}
			
			System.out.println(text2.toUpperCase());
		}

	}

}
