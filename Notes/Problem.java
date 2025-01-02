import java.util.Random;

public class Problem {
	
		public static void main(String[] args) {
			int[] numbers = new int[5];
			
			loadRandomArray(numbers,1,5,true);
			showArray(numbers);
			//showString(str);

		}
		
		public static int searchArray(int[] theArray, int value) {
			int index;
		
			for(index=0;index<theArray.length;index++) {
				if(theArray[index]==value) {
					return index;
				}
			}
			return -1;
		}
		
		public static int loadRandomArray(int[] theArray, int start, int end, boolean unique) {
			int retval=0;
			int index;
			int randNo;
			
			for(index = 0; index < theArray.length; index++) {
				theArray[index] = start -1;
			}
			if(start<end) {
				Random rand = new Random();
				for(index=0;index<theArray.length;index++) {
					if(unique) {
						randNo = rand.nextInt(end-start+1) + start;
						
						while((searchArray(theArray,randNo))>=0) {
							//System.out.printf("%d ",randNo);
							//showArray(theArray);
							//System.out.println();
							randNo = rand.nextInt(end-start+1) + start;
							
						}
						theArray[index]=randNo;
					}else {
						theArray[index] = rand.nextInt(end-start+1) + start;
					}
				}
			}else {
				retval= 1;
			}
			
			return retval;
		}
		
		public static void showArray(int[] array) {
			int index;
			
			System.out.printf("[");
			for(index=0;index<array.length;index++) {
				if(index!=0) {
					System.out.printf(",");
				}
				System.out.printf("%d", array[index]);
			}
			System.out.printf("]\n");
		}
		
		public static void showString(String str) {
		int index;
		char ch;
			
			System.out.printf("[");
			for(index=0;index<str.length();index++) {
				ch = str.charAt(index);
				if(index!=0) {
					System.out.printf(",");
				}
				System.out.printf("%c", ch);
			}
			System.out.printf("]\n");	
		}

}

