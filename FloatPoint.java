
public class FloatPoint {
	
	class TimingOfThings {
		
		private static final int LOOPS = 5_000;

		public void getTiming() {
			
			long startTime = System.currentTimeMillis();
			for (int index = 0; index < LOOPS; ++index) {
				FloatPoint fp = new FloatPoint();
				System.out.println(fp);
			}
			String one = "one";
			String two = one;
			String three = new String("one");
			String four = "one";
			
			long endTime = System.currentTimeMillis();
			System.out.println("It took " + (endTime - startTime));
			
			//get the timing of String
			startTime = System.currentTimeMillis();
			String test = "test";
			for (int index = 0; index < LOOPS; ++index) {
				test += "test";
			}
			endTime = System.currentTimeMillis();
			System.out.println("It took " + (endTime - startTime) + " wtih String.");
			
			//get the timing of StringBuffer
			startTime = System.currentTimeMillis();
			StringBuffer testBuffer = new StringBuffer("test");
			for (int index = 0; index < LOOPS; ++index) {
				testBuffer.append("test");
			}
			endTime = System.currentTimeMillis();
			System.out.println("It took " + (endTime - startTime) + " with StringBuffer.");
			
			//get the timing of StringBuilder
			startTime = System.currentTimeMillis();
			StringBuilder testBuilder = new StringBuilder("test");
			for (int index = 0; index < LOOPS; ++index) {
				testBuilder.append("test");
			}
			endTime = System.currentTimeMillis();
			System.out.println("It took " + (endTime - startTime) + " with StringBuilder.");
		}
	}

	private double x;
	private double y;
	private static int counter = 0;
	
	public static void main(String[] args) {
		FloatPoint fp = new FloatPoint();
		TimingOfThings tot = fp.new TimingOfThings();
		tot.getTiming();
	}
	
	public FloatPoint() {
		++counter;
	}
	
	@Override
	public String toString() {
		return "FloatPoint [x=" + x + ", y=" + y + "] serial number:" + counter;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
}
