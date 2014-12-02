package lab8;

public class Square {
	private double mLength;
	
	public Square(double length)
	{
		mLength = length;
	}
	
	public double getArea()
	{
		return mLength * mLength;
	}
}
