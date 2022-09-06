import java.util.Comparator;

public class CustomComparator implements Comparator<Dot> {

    public int compare(Dot o1, Dot o2) {
        if(o1.getY() == o2.getY()) {
            return 0;
        }
        else if(o1.getY() > o2.getY()) {
            return 1;
        }
        else {
            return -1;
        }
    }
}
