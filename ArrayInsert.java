
public class ArrayInsert {
		//Inserting the element in the beginning of the array
		void Que1() {
			int[] arr = {1, 2, 3, 4, 5};
	        int element = 0; // Element to be inserted
	        int n = arr.length; // Size of the original array

	        // Step 1: Create a new array
	        int[] newArr = new int[n + 1];

	        // Step 2: Shift elements to the right
	        for (int i = 0; i < n; i++) {
	            newArr[i + 1] = arr[i];
	        }

	        // Step 3: Insert the element at the beginning
	        newArr[0] = element;

	        // Step 4: Print the updated array
	        for (int num : newArr) {
	            System.out.print(num + " ");
	        }

		}
		//Inserting the element at the given index of the array
		void Que2() {
			int[] arr = {1,2,3,4,5};
			int element = 6;
			int n = arr.length;
			int givenInd=n/2;
			
			
			//Step 1: Creating new array
			int[] newArr = new int[n+1];
			
			//Step 2: Shift the elements towards right
			for(int i=0; i<n+1; i++) {
				//newArr[i+1] = arr[i];
				if(i==givenInd) {
					newArr[i]=element; //3
				}
				
				else if(i>=givenInd) {
					newArr[i] = arr[i-1]; //4,5
				}
				
				else
					newArr[i]=arr[i];
			}
			
			//Step 3: Insert the element at the given index
			//newArr[4] = element;
			
			//Step 4: Print the updated array
			for(int num:newArr) {
				System.out.print(num+" ");
			}
		}
		
		void Que3() {
			//Inserting the element after the given index of the array
			int[] arr = {1,2,3,4,5};
			int element =7;
			int n=arr.length;
			int givenInd=n/2;
			
			int[] newArr = new int[n+1];
			
			for(int i=0; i<(newArr.length);i++) {
				if(i==(givenInd+1)) //2+1=3
				{
					newArr[i] = element;
				}
				
				else if(i>=givenInd+1) //4,5
				{
					newArr[i]=arr[i-1];
				}
				
				else {
					newArr[i]=arr[i]; //0,1,2
				}
				
				
			}
			
			for(int num:newArr) {
			System.out.print(num+" ");
			}
		}
		
		void Que4() {
			//Inserting the element before the given index of the array
			int[] arr = {1,2,3,4,5};
			int element =8;
			int n=arr.length;
			int givenInd=n/2;
			
			int[] newArr = new int[n+1];
			
			for(int i=0; i<(newArr.length);i++) {
				if(i==(givenInd-1)) //2+1=3
				{
					newArr[i] = element;
				}
				
				else if(i>=givenInd) //
				{
					newArr[i]=arr[i-1];
				}
				
				else {
					newArr[i]=arr[i];
				}
				
				
			}
			
			for(int num:newArr) {
			System.out.print(num+" ");
			}
		}

		public static void main(String[] args) {
			ArrayInsert obj = new ArrayInsert();
			//obj.Que1();
			//obj.Que2();
			//obj.Que3();
			obj.Que4();
		}

	


}
