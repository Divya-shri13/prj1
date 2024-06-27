package encapsulation;

public class Settersandgettersmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Settersandgetters strgtr = new Settersandgetters();
		strgtr.setAcc_no(12345);
		strgtr.setName("divs");
		strgtr.setAmount(10.3);
		
		  strgtr.getAcc_no();
		//  String str = strgtr.getAcc_no();
		System.out.println( strgtr.getAcc_no());
		System.out.println(strgtr.getAmount());
		System.out.println(strgtr.getName());
	}

}
