package DivideConquer;

public class Merge2Arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] one= {10,30,50,80,90,100};
		int[] two= {15,20,25,60,70};
		
		int[] res=merge2sortedArr(one, two);
		for(int val:res)
			System.out.print(val+",");
	}
	public static int[] merge2sortedArr(int[] one, int[] two)
	{
		int[] merged= new int[one.length+ two.length];
		int i=0;//one
		int j=0;//two
		int k=0;//merged
		
		
		while(i<one.length && j< two.length) {
			if(one[i]<two[j]) {
				merged[k]=one[i];
				i++;
				k++;
			}
			else {
				merged[k]=two[j];
				j++;
				k++;
			}
		}
		//two array finish, one arr elem consume
		if(j==two.length) {
			while(i<one.length) {
				merged[k]=one[i];
				i++;
				k++;
			}
		}
		//one arr finish, two arr elem consume
		if(i==one.length) {
			while(j<two.length) {
				merged[k]=two[j];
				j++;
				k++;

			}
		}
		return merged;
	}
}
