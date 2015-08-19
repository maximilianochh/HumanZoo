import java.util.Comparator;
public class sexAppealComparator implements Comparator<Person>{
	@Override
	public int compare(Person o1, Person o2) {
		if (o1.getSexAppeal()>o2.getSexAppeal()) {
			return 1;
		}
		if (o1.getSexAppeal()>o2.getSexAppeal()) {
			return -1;
		}
		return 0;
	}
	
}
