/*Given two integers n and k, return all possible combinations of k numbers out of the range [1, n].

You may return the answer in any order.
*/
 

package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Combination_LC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(combine(4,2));
	}
	
	public static List<List<Integer>> combine(int n, int k){
		List<List<Integer>> list= new ArrayList<>();
		userRespect(1,n,k, new ArrayList<>(), list);
		return list;
	}
	public static void userRespect(int start, int n, int k, List<Integer> temp, List<List<Integer>> list) 
	{
		if(k==0) {
			list.add(new ArrayList<>(temp));
			return;
		}
		if(start>n) {
			return;
		}
		for(int i= start; i<=n;i++) {
			temp.add(i);
			userRespect(i+1, n, k-1, temp, list);
			temp.remove(temp.size()-1);
		}
	}

}
