package week1.day2;

public class MyMobile {
	
	public void makeCalls() {
		
		System.out.println("I make calls ");		
		
	}
	
	public void sendMsg() {
		
		System.out.println("I sent a message");
		
	}
	private void payBills() {
		System.out.println("I paid my bill");
	}
	
	public static void main(String[] args) {
		MyMobile mobObj=new MyMobile();
		mobObj.makeCalls();
		mobObj.sendMsg();
		mobObj.payBills();
		
	}

}
