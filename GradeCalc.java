import java.util.Scanner;

public class GradeCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double ClassOne, ClassTwo, totalGradePoints;
		double GradeOne, GradeTwo, totalCredits;
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Enter the credits for the first business class:");
		ClassOne = myObj.nextDouble();
		
		System.out.println("\nEnter the value (4.0, 3.0, etc.) of grade for the first business class: ");
		GradeOne = myObj.nextDouble();
		
		System.out.println("\nEnter the credits for the second business class:");
		ClassTwo = myObj.nextDouble();
		
		System.out.println("\nEnter the value (4.0, 3.0, etc.) of grade for the second business class:");
		GradeTwo = myObj.nextDouble();
		
		totalCredits = ClassOne + ClassTwo;
		totalGradePoints = (ClassOne * GradeOne) + (ClassTwo * GradeTwo);
		
		System.out.println("\nYour GPA for the 2 business classes is " + (totalGradePoints / totalCredits));

	}

}
