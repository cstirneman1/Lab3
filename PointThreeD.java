package arraylist;

public class PointThreeD {

	private double xPoint, yPoint,zPoint;
	
	public PointThreeD() {
		
	}
	
	public PointThreeD(double x, double y, double z) {
		this.xPoint = x;
		this.yPoint = y;
		this.zPoint = z;
	}

	@Override
	public String toString() {
		return "PointThreeD [xPoint=" + xPoint + ", yPoint=" + yPoint + ", zPoint=" + zPoint + "]";
	}
	
	
}
