package atmException;

public class WithDrawException extends RuntimeException
{

	@Override
	public String toString()
	{
		return getClass()+": you have insufficent balance to withdraw";
	}
}
