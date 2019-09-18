import java.util.Date;

public class FloatPoint2 {
	private Double x;
	private Double y;
	private Date now;
	
	public FloatPoint2(double x, double y) {
		this.x = x;
		this.y = y;
		now = new Date();
	}
	
	public FloatPoint2() {
		this(0.0, 0.0);
	}
	
	@Override
	public String toString() {
		return "FloatPoint [x=" + x + ", y=" + y + "]" + " date: " + now;
	}

	public Double getX() {
		return x;
	}

	public Double getY() {
		return y;
	}
	
	public Date getDate() {
		return (Date) now.clone();
	}
}
