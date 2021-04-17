package BackTracking;

public class QueenCombination_queenrespect {
	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueenComb(new boolean[4], 0, 2, "",-1);
		

	}

	public static void QueenComb(boolean[] box, int qpsf, int tq, String ans, int lastUsedBox) {
		if(qpsf==tq) {
			count++;
			System.out.println(count+". "+ans);
		}
		for(int i=lastUsedBox+1;i<box.length;i++) {
			box[i]=true;
			QueenComb(box, qpsf+1, tq, ans +"q"+ qpsf+"b"+i+" ",i);
			box[i]=false; //undo
		}
		
	}
}
