package CollectonsExample;

public class Listexp {
	public static void main(String[] args) {
		
	

	        int[] arr = {5, 10, 15, 20, 25};
	        int search = 15;

	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == search) {
	                System.out.println("Element found");
	            	break;
	            }else {
	            	System.out.println("Element  not found");
	            
	            }
	        }
	 }

}
