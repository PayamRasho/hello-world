public class arrayToFindBiggestNumber {
		public static void main (String []aaa) {
			int [] myArray = {3,5,8,10,4,9};
			int max = myArray[0];
				for(int a = 0; a<myArray.length; a++){
					if(myArray[a]>max) {
						max = myArray[a];
					}
				}
				System.out.println("The biggest number is = "+max);
		}
}//done