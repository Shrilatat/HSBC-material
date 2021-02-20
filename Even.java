
public class Even {
	public int[] ar= {2,3,9,6,7,4,6,8,1};
	public void EvenElements(int[] arr) {
		for(int i: arr)
			if(i%2==0)
				System.out.println(i);
	}
	public static void main(String[] args) {
		Even E=new Even();
		E.EvenElements(E.ar);
	}
}
