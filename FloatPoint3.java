
public class FloatPoint3 extends FloatPoint2 {
	Double z;
	
	public FloatPoint3() {
		//remember to look into using superclass constructor
		super(10, 11);
		z = 0.0;
	}
	
	@Override
	//modify our FloatPoint2 toString
	public String toString() {
		String str = super.toString();
		return str + z.toString();
	}
}
