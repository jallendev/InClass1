import java.util.*;

public class Driver {

	public static void main(String[] args) {
		Object[] ar = new Object[10];
		
		try {
			Student s1 = new Student("Alex", "", 3);
			Student s2 = new Student("We", "Wa", 4);
			Student s3 = new Student("X", "Y", 5);
			
			ar[0] = 2;
			ar[1] = s1;
			ar[2] = "Aha";
			ar[3] = s2;
			ar[4] = s3;
			
			NameHolder bo = new Student("O", "p", 1);
			((Student) bo).getRating();
			
			for (Object o: ar) {
				System.out.println(o);
			}
			
			ArrayList<Student> students = new ArrayList<>();
			students.add(s1);
			students.add(s2);
			students.add(s3);
			students.add((Student) bo);
			
			Map<String, Student> m = new TreeMap<String, Student>();
			Integer index = 0;
			
			for (Student s: students) {
				m.put("s1" + index++, s);
				System.out.println(s);
			}
			
			List<Student> sx = new ArrayList<>();
		}
		catch (NameException e) {
			e.printStackTrace();
		}
	}
}
