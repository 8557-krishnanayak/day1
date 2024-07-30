public class Main {

	public static void main(String[] args) {

		Rectangle rect = new Rectangle(12d,15d);

		double area = rect.getArea();
		double parameter = rect.getParameter();


		System.out.println("AREA "+ area); 
		System.out.println("PARAMETER "+ parameter);
	}
	
}




class Rectangle {

	private double length;
	private double breath;

	Rectangle(double length, double breath){
		this.length = length;
		this.breath = breath;
	}

	public double getLength(){
		return this.length;
	}


	public double getArea(){
		return length * breath;
	}


	public double getParameter(){
		return 2 * (length + breath);
	}

}
