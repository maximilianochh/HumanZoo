import java.util.Comparator;
public class aptitudCamparator implements Comparator<Person> {
	@Override
	public int compare(Person arg0, Person arg1) {
		if (arg0.getAptitud()>arg1.getAptitud()) {
			return 1;
		}
		if (arg0.getAptitud()<arg1.getAptitud()) {
			return -1;
		}
		return 0;
	}
	
}
