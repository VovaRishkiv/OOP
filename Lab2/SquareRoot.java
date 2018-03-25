public class SquareRoot {

    public static void main(String[] args) {
        double a = 3;
        double b = 2.5;
        double c = -0.5;

		double D = b*b-4.0*a*c;
		if( a == 0) {
			if(b != 0){
				if(c != 0){
					System.out.println("x1=" + (-c/b));
					System.out.println("x2=" + (-c/b));    
				}
				else {
					System.out.println("x1=" + 0.0);
					System.out.println("x2=" + 0.0);
				}
			}
			else{
				System.out.println("x1=");
				System.out.println("x2="); 
			}
		}	
		else{	
			if(D >= 0){
				double d = Math.sqrt(D);
				System.out.println("x1=" + (-b+d)/2.0/a);
				System.out.println("x2=" + (-b-d)/2.0/a);
			}
			else{
				System.out.println("x1=");
				System.out.println("x2=");
			}	
		}	
    }
}