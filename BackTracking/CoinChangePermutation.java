package BackTracking;

public class CoinChangePermutation {
	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		coinchange(new int[] {2,3,5,6}, 10, "");

	}
	public static void coinchange(int[] denom, int amount, String ans)
	{
		if(amount==0) {
			count++;
			System.out.println(count+". "+ans);
			return;
		}
		
		 for(int i= 0; i< denom.length; i++) {
			 if(amount >= denom[i])
				 coinchange(denom, amount-denom[i], ans+denom[i]);
		 }
	}

}
