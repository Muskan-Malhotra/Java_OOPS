package customException;

public class Account {
	
	private String accountHN;
	private int accNo;
	private double balance;
	


	public Account(String accountHN, int accNo, double balance) {
		super();
		this.accountHN = accountHN;
		this.accNo = accNo;
		this.balance = balance;
	}


	public String getAccountHN() {
		return accountHN;
	}


	public void setAccountHN(String accountHN) {
		this.accountHN = accountHN;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public int getAccNo() {
		return accNo;
	}

	
	public void deposite(double amt) {
		this.balance = this.balance+amt;
	}
	
	public double withdraw(double amt) throws InsufficientBalanceException
	{
		if(amt<=this.balance) {
			this.balance = this.balance - amt;
		}
		else {
			//throw a custom exception  IssufficientBalanceException
			//System.out.println("Insufficient Balance: amt: "+amt+" should be greater than your balance "+ this.balance);
			
			throw new InsufficientBalanceException(this.balance,amt,this.accNo);
			
		}
		System.out.println("Current Balance is: "+this.balance+" after withdrawing amt: "+amt);
		return amt;
	}
	@Override
	public String toString() {
		return "Account [accountHN=" + accountHN + ", accNo=" + accNo + ", balance=" + balance + "]";
	}
	
	

}


/**
 * package customeexception;
 
public class Account {
 
    private String accountHolderName;
    private int acctNo;
    private double balance;


    public Account(String accountHolderName, int acctNo, double balance) {
        super();
        this.accountHolderName = accountHolderName;
        this.acctNo = acctNo;
        this.balance = balance;
    }
 

    public String getAccountHolderName() {
        return accountHolderName;
    }
 

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
 

    public double getBalance() {
        return balance;
    }
 

    public void setBalance(double balance) {
        this.balance = balance;
    }
 

    public int getAcctNo() {
        return acctNo;
    }
 
    
    public void deposit(double amt)
    {
        this.balance = this.balance + amt;
    }

    public double withdraw(double amt) throws InsufficientBalanceException
    {
        if(amt <= this.balance )
        {
            this.balance = this.balance - amt;
            System.out.println("Current Balance is"+ this.balance+" after withdrawing amt:"+amt);
        }
        else
        {
            //System.out.println("Insufficient Balance: amt:"+amt+" is greater than your balance:"+this.balance);

            throw new InsufficientBalanceException(this.balance,amt,this.acctNo);
        }


        return amt;
    }
 
    @Override
    public String toString() {
        return "Account [accountHolderName=" + accountHolderName + ", acctNo=" + acctNo + ", balance=" + balance + "]";
    }





}
*/
