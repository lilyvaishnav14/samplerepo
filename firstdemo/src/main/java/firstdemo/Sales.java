package firstdemo;

public class Sales {
	public void display() {
		int[] arr = {23,45,62,65};
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Size of array: "+ arr.length);
	}
	public void print() {
		System.out.println("Print all array numbers");
		display();
	}
	

}
