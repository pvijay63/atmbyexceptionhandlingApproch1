package atmException;

public class MainClass  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Atm a=new Atm();
	try
	{
		a.deposit();
		a.withDraw();
	}
	catch(DepositException | WithDrawException e)
	{
		System.out.println("Error :"+e);
	}
	}

}
