package Lab1;

public class methodsPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		distance(5,5,50,50);

	}
	
	public static void distance (double x1, double y1, double x2, double y2){
		double d;
		d = Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2-y1,2));
		
		 System.out.print(d);
	}

}
