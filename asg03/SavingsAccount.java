public class SavingsAccount	{
	private static float annualInterestRate;
	private float savingsBalance;
	
	public static void modifyInterestRate(float rate){
		annualInterestRate = rate;
	}
	
	public float calculateMonthlyInterest(){
		float interest = (savingsBalance * annualInterestRate / 12);
		savingsBalance += interest;
		return interest; 
	}
	
	public float getSavingsBalance(){
		return savingsBalance;
	}
}
