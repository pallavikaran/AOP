package aop;
// Business Implementation :target
public class OnlineBankImpl implements Bank{

	//[before] Security Check
	
	//[throws] log
	public void transfer(int acc1, int acc2, double amt)
		throws BankException{
		if(acc1<0) {
			throw new BankException(
					"Invalid Account "+acc1);
		}
		System.out.println("Getting Account "+acc1);
		System.out.println("Create Transaction "+acc1);
		System.out.println("Getting Account "+acc2);
		System.out.println("Create Transaction "+acc2);
	}
	//[after] log
	
	public double getBalance(int acc1) {
		System.out.println("Getting Balance for "+acc1);
		return acc1;
	}
}
