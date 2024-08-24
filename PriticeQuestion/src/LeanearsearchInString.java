
public class LeanearsearchInString {

	public static void main(String[] args) {
		String a[]={"deepak","Sandeep","Ealk","Rohan"};
		 String search="deepak";
		  int temp=0;
		for(int i=0;i<=a.length-1;i++) {
			if(a[i].equals(search)) {
				System.out.println("string is found at index" +" "+i);
				temp=temp+1;
				
			}
			
			
			
		}
		if(temp==0) {
			System.out.println("element is not found");
		}

	}

}
