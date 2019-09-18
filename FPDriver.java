import java.util.Date;
public class FPDriver {

	public static void main(String[] args) {
		FloatPoint2 fp = new FloatPoint2(3.2, 2.3);
		System.out.println(fp);
		
		Object o = fp;
		System.out.println(o);
		
		o = new FloatPoint3();
		System.out.println(o);
		
		//FloatPoint3 y = (FloatPoint3)(new Object());
		//System.out.println(y);
		
		Double what = fp.getX();
		System.out.println(what);
		what *= 20;
		
		Date aha = fp.getDate();
		aha.setHours(10);
		aha.setMonth(11);
		
		System.out.println(fp);
	}

}
