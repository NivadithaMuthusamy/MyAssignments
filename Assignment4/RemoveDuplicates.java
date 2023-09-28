package Assignment4;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text="we learn java basics as a part of java sessions in java week1";
        int count=0;
        String[] split=text.split(" ");
        for(int i=0;i<split.length;i++) {
        	if(split[i].equals("java")) {
        		count++;
        	}
        }
        System.out.println(count);
        	if(count>1) {
        		System.out.println(text.replaceAll("java", ""));
        	}
        	else {
        		System.out.println(text);
        	}
        }
}


