package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Combination_EleRespect {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(combine(4,2));
	}
	
	public static List<List<Integer>> combine(int n, int k){
		List<List<Integer>> list= new ArrayList<>();
		ElementRespect(1,n,k, new ArrayList<>(), list);
		return list;
	}
	public static void ElementRespect(int start, int n, int k, List<Integer> temp, List<List<Integer>> list) 
	{
		if(k==0) {
			list.add(new ArrayList<>(temp));
			return;
		}
		if(start>n) {
			return;
		}
		
		
			temp.add(start);
			ElementRespect(start+1, n, k-1, temp, list);
			temp.remove(temp.size()-1);
		    
			ElementRespect(start+1, n, k, temp, list);
	}


}
