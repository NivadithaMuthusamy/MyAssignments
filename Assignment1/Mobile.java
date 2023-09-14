package Assignment1;

public class Mobile {
      public void sendMessage() {
    	  System.out.println("sendMessage");
      }
      public void shareDocument() {
    	  System.out.println("shareDocument");
      }
      public void makeCall() {
    	  System.out.println("makeCall");
      }
      public static void main(String[] args) {
		Mobile samsung= new Mobile();
		samsung.sendMessage();
		samsung.shareDocument();
		samsung.makeCall();
	}
}
