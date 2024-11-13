package helloworld;

public class HelloWorld {

	public static void main(String[] args) {
		// Exercice 1
		int numberHigherThanFivecounter = 0;
		int repeatCounter = 0;
		int[] intArray = new int[6];
		
		for(int i = 0; i < intArray.length; i++) {
			intArray[i] = (int)(Math.random() * 11 );
			if (intArray[i] > 5 ) {
				numberHigherThanFivecounter++;
			}
		}
		
		System.out.print("The values in the array are : ");
		for(int value : intArray) {
			System.out.print(value + " ");
		}
		
		System.out.println();
		System.out.println("The counting of values greater than 5 is : " + numberHigherThanFivecounter);
		
		// Exercice 2
		int intFiveHolder;
		do {
			intFiveHolder = (int)(Math.random() * 11);
			repeatCounter++;
		}
		while ( intFiveHolder != 5);
		
		System.out.println("The value of the variable that must hold five is : " + intFiveHolder);
		System.out.println("The loop has been repeated " + repeatCounter + " times");
	}

}
