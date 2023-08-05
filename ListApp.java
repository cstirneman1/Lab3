package arraylist;

public class ListApp {

	public static void main(String[] args) {
		
		ArrayList <String> stringArray = new ArrayList<String>();
		
		stringArray.addItem("String");
		stringArray.addItem("Example");
		stringArray.addItem("Hello");
		
		System.out.print(stringArray.toString());
		System.out.println();
		
		ArrayList <Square> squareArray = new ArrayList<Square>();
		
		squareArray.addItem(new Square (23.446));
		squareArray.addItem(new Square (12.578));
		squareArray.addItem(new Square (35.789));
		
		System.out.print(squareArray.toString());
		System.out.println();
		
		ArrayList <PointThreeD> pointArray = new ArrayList<PointThreeD>();
		
		pointArray.addItem(new PointThreeD (45.58, 11.44,21.23));
		pointArray.addItem(new PointThreeD (32.46, 10.33,44.12));
		pointArray.addItem(new PointThreeD (8.23, 99.32,87.32));
		
		System.out.print(pointArray.toString());
		System.out.println();
		

	}

}
