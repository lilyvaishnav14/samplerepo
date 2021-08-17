package firstdemo;

public class Sales {
	public void display() {
		int[] arr = {23,45,62,65};
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		int sum=0;
		for(int num:arr) {
			sum = sum+num;
			System.out.println(num);
		}
		System.out.println("Size of array: "+ arr.length);

		System.out.println("Sum is: "+sum);
		}
	}
	public void print() {
		System.out.println("Print all array numbers");
		display();
	}
	

}
