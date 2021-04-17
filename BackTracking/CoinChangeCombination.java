package BackTracking;

public class CoinChangeCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		coinchange(new int[] {2,3,5,6}, 10, "",0);

	}
	public static void coinchange(int[] denom, int amount, String ans, int lastDenoIndex)
	{
		if(amount==0) {
			System.out.println(ans);
			return;
		}
		 for(int i= lastDenoIndex; i< denom.length; i++) {
			 if(amount >= denom[i])
				 coinchange(denom, amount-denom[i], ans+denom[i], i);
		 }
	}
}
