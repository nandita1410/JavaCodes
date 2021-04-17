package BackTracking;

public class CoinChange_CoinRespect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		coinchange(new int[] {2,3,4,5},0,10,"");

	}
	public static void coinchange(int[] deno, int vidx, int amt , String ans) {
		//+ve bc
		if(amt==0) {
			System.out.println(ans);
			return;
		}
		//-ve bc
		if(amt<0 || vidx==deno.length) {
			return;
		}
		
		//yes
		coinchange(deno, vidx, amt-deno[vidx], ans+deno[vidx]);
		
		//no
		coinchange(deno, vidx+1, amt, ans);
	}

}
