package Assingment6_7;

import java.util.Comparator;

public class NameComparator implements Comparator<Staffs> {

	@Override
	public int compare(Staffs o1, Staffs o2) {
		return o1.getFullName().compareTo(o2.getFullName());
	}
}
