package lab8;

public class Circle {
	
	static final double PI = 3.141592653589793;
	
	private double mRadius;
	
	public Circle(double radius)
	{
		mRadius = radius;
	}
	
	public double getArea()
	{
		return mRadius * mRadius * PI;
	}
}
