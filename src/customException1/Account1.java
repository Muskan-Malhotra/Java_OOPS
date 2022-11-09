package customException1;

public class Account1 {
	
	private String AccHN;
	private int AccNo;
	private double AccBalance;
	
	
	
	
	public Account1(String accHN, int accNo, double accBalance) {
		super();
		AccHN = accHN;
		AccNo = accNo;
		AccBalance = accBalance;
	}
	
	public String getAccHN() {
		return AccHN;
	}
	public void setAccHN(String accHN) {
		AccHN = accHN;
	}
	public int getAccNo() {
		return AccNo;
	}
	public double getAccBalance() {
		return AccBalance;
	}
	
	public void setBalance(double balance) {
        this.AccBalance = balance;
    }
	
	
	public double amount(double amt) throws ZeroBalanceException,NegativeBalanceException{
		if(amt<=this.AccBalance) {
			this.AccBalance = this.AccBalance - amt;
		}
		if(this.AccBalance == 0 ){
			//System.out.println("Current Balance is"+ this.AccBalance+" after withdrawing amt:"+amt);
			throw new ZeroBalanceException(this.AccBalance,amt,this.AccNo);
		}
		if(amt > this.AccBalance ){
			//System.out.println("Current Balance is"+ this.AccBalance+" after withdrawing amt:"+amt);
			throw new NegativeBalanceException(this.AccBalance,amt,this.AccNo);
		}
		System.out.println("Current Balance is: "+this.AccBalance+" after withdrawing amt: "+amt);
		
		
		return amt;
	}
	

	@Override
	public String toString() {
		return "Account1 [AccHN=" + AccHN + ", AccNo=" + AccNo + ", AccBalance=" + AccBalance + "]";
	}
	
	

}
