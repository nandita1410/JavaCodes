package BackTracking;

public class QueenPermutation {
	static int count=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueenPer(new boolean[4], 0, 2, "");
		

	}
	public static void QueenPer(boolean[] box, int qpsf, int tq, String ans) {
		if(qpsf== tq) {
			count++;
			System.out.println(count+".  "+ans);
			return;
		}
		for(int i=0;i<box.length;i++) {
			if(box[i]==false) {
				box[i]=true;
				QueenPer(box, qpsf+1, tq, ans+"q"+qpsf+"b"+i+" ");
				box[i]=false; //undo-backtracking
			}
		}
	}

}
