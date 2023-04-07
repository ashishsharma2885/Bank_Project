package Bank;

public class BankDetailsUse {
    public static void main(String args[]) {
    	BankDetails p1=new BankDetails("Ashish","Sbi0020");
    	System.out.println(p1.totalBalance());
    	p1.addMoney(10000);
    	System.out.println(p1.totalBalance());
    	p1.addMoney(20000);
    	System.out.println(p1.totalBalance());
    	p1.withDrawMoney(5000);
    	System.out.println(p1.totalBalance());
    	BankDetails p2=new BankDetails("Prashant","Sbi0020");
    	System.out.println(BankDetails.BANK_NAME);
    	System.out.println(BankDetails.numofAccounts);
    	System.out.println(p1.getAccountNumber());
}
}