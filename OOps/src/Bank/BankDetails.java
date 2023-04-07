package Bank;

public class BankDetails {
   String name;
   String nickname;
   static int numofAccounts;
   private int accountNumber;
   String ifsc;
   final static String BANK_NAME="SBI";
   private Double balance;
   Double submitAmount;
  
   public BankDetails(String name, String ifsc) {
	   this.balance=0.0;
	   this.ifsc=ifsc;
	   numofAccounts++;
	   accountNumber=numofAccounts;
   }
 
   public BankDetails(String name, String ifsc, String nickname) {
	   this.name=name;
	   this.ifsc=ifsc;
	   this.nickname=nickname;
	   accountNumber=numofAccounts;
   }
   public int getAccountNumber() {
	   return this.accountNumber;
   }
   public double totalBalance() {
	   return this.balance;
   }
   public void addMoney(int submitAmount) {
	   this.balance=this.balance+submitAmount;
   }
   public void withDrawMoney(int withDrawAmount) {
	   this.balance=this.balance-withDrawAmount;
}
}
