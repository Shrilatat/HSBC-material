
public class Sum {
	private int[] arr1= {1,2,3,4,5};
	private int[] arr2= new int[5];
	public void method()
	{
		int sum=0;
		for(int i: arr1) {
			sum=sum+i;
		}
		int avg=sum/arr1.length;
	}
	public void Square() {
		int x=0;
		for(int i: arr1){
			arr2[x]=i*i;
			x++;
		}
	}
	public int[] subArr(int start, int end) {
		int[] sub=new int[end-start];
		int i=0;
		while(start<end) {
			sub[i]=arr2[start];
			start++;
			i++;
		}
		return sub;	
	}
}
