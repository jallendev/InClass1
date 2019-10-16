import java.util.Comparator;

public class CompareLastFirstName implements Comparator<Student>{	
	@Override
	public int compare(Student first, Student last) {
		String firstName = first.getFirstName();
		String lastName = last.getLastName();
		String firstNameLast = last.getFirstName();
		String lastNameLast = last.getLastName();
		
		int lastNameResult = compareLastNames(lastName, lastNameLast);
		
		if (firstName.compareTo(firstNameLast) < 0) {
			return -1;
		}
		else if (firstName.compareTo(firstNameLast) > 0) {
			return 1;
		}
		else {
			return lastNameResult;
		}
	}
	
	public int compareLastNames(String lastName, String lastNameLast) {
		if (lastName.compareTo(lastNameLast) < 0) {
			return -1;
		}
		else if (lastName.compareTo(lastNameLast) > 0) {
			return 1;
		}
		else {
			return 0;
		}
	}
}
