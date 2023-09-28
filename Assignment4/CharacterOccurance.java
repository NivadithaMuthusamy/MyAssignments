package Assignment4;

public class CharacterOccurance {

	public static void main(String[] args) {
		String str="welcome to chennai";
		char[]nameArray=str.toCharArray();
		int count=0;
		for(int i=0;i<nameArray.length;i++) {
			//System.out.println(nameArray[i]);
			if(nameArray[i]=='e') {
				count=count+1;
			}
		}
		System.out.println(count);
	}

}
