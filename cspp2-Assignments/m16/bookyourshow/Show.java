import java.util.Arrays;
import java.util.Scanner;
class Show {
	String nameOfMovie;
	String date;
	String[] list;
	Patron[] bookedSeats;

	Show (String n, String d, String[] l) {
		nameOfMovie = n;
		date = d;
		list = l;
		bookedSeats = new Patron[l.length];
	}

	public String toString() {
        StringBuilder sb = new StringBuilder();
            sb.append(nameOfMovie + ",");
            sb.append(date + ",");
            sb.append("[");
            for(int i = 0; i<list.length-1; i++) {
            	sb.append(list[i] + ",");
            }
            sb.append(list[list.length-1] + "]");
        return sb.toString();
    }
}