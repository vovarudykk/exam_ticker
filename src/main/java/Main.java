import exam_ticket_2.CustomException;
import exam_ticket_2.Person;

import java.util.*;

public class Main {
    public static void main(String[] args) throws OutOfRangeValueException, CustomException {
/*        Dot dot = new Dot();
        dot.setX(1.4);
        dot.setY(4.3);
        dot.print();

        ColorDot color_dot1 = new ColorDot();
        color_dot1.setX(11);
        color_dot1.setY(31.2);
        color_dot1.setRGB(50, 100, 200);

        color_dot1.print();

        ColorDot color_dot2 = new ColorDot();
        color_dot2.setX(799);
        color_dot2.setY(2.2);
        color_dot2.setRGB(100, 150, 250);

        color_dot2.print();


        ColorDot color_sum_dot = ColorDot.concat(color_dot1, color_dot2);
        color_sum_dot.print();*/

//        ArrayList<String> list = new ArrayList<>();
//        list.add("4");
//        list.add("15");
//        list.add(1, "8");
//        list.add("42");
//
//        ArrayList<String> test_list = new ArrayList<>();
//        test_list.add("16");
//        test_list.add("23");
//        list.addAll(3, test_list);
//
//        list.add("434234");
//        list.remove(list.size()-1);
//        System.out.println(list);
//
//
//        LinkedList<String> linked_list = new LinkedList<String>();
//        linked_list.add("15");
//        linked_list.addLast("16");
//        linked_list.addFirst("4");
//        linked_list.add(1, "8");
//        linked_list.add("128");
//        linked_list.add("128");
//        linked_list.remove("128");
//        linked_list.addFirst("334");
//        linked_list.removeFirst();
//        linked_list.removeLast();
//        System.out.println(linked_list);
//
//        ListIterator<String> itr = linked_list.listIterator();
//
//        int ind = 0;
//        while(itr.hasNext()){
//            System.out.println("Element[" + ind  + "] = " + itr.next() + ";");
//            ind++;
//        }

/*        ArrayList<Dot> list = new ArrayList<>();
        list.add(color_dot2);
        list.add(color_dot1);
        list.add(dot);
        list.add(color_sum_dot);
        System.out.println(list);

        TreeSet<Dot> sorted_set = new TreeSet<Dot>();

        sorted_set.addAll(list);
        System.out.println(sorted_set);

        CustomComparator comparator = new CustomComparator();
        list.sort(comparator);
        System.out.println(list);*/

        Person john = new Person("John", "Snow", 3000, 12, 28);
        Person katie = new Person("Katie", "Berry", 1998, 1, 25);
        Person alex = new Person("Alex", "Lion", 1980, 12, 12);

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(john);
        persons.add(katie);
        persons.add(alex);

        john.print();
        alex.print();
        katie.print();

        double average = persons.stream().mapToInt(Person::getYear).map((year) -> 2022 - year).average().getAsDouble();
        System.out.println(average);
    }
}
