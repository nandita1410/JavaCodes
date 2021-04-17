package BackTracking;

public class QueenComb_BoxRespect {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queencombboxresp(new boolean[4], 0, 0, "",2);
		

	}
	public static void queencombboxresp(boolean[] board, int col, int qpsf, String ans, int tq) {
		//positive base case
		if(qpsf==tq) {
			System.out.println(ans);
			return;
		}
		
		//negative basecase
		if(col==board.length) {
			return;
		}
		//place 
		board[col]=true;
		queencombboxresp(board, col+1, qpsf+1,ans+"b"+col,tq);
		board[col]=false;
		//not place
		queencombboxresp(board,col+1, qpsf, ans,tq);
		
	}

}
