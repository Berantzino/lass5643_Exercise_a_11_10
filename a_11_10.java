import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class a_11_10 {

    /*
    10. Write a method removeOddLength that accepts a set of strings as a parameter and that removes all of the
    strings of odd length from the set.
     */

    public static void main(String[] args) {

        Set<String> testSet = new HashSet<>();

        testSet.add("Hej");
        testSet.add("jeg");
        testSet.add("hedder");
        testSet.add("Lasse");
        testSet.add("Ken");
        testSet.add("Berantzino");

        System.out.println(testSet);
        System.out.println(removeOddLength(testSet));

    }

    public static Set<String> removeOddLength(Set<String> set) {

        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()) {

            String string = iterator.next();

            if (string.length() % 2 != 0) {

                iterator.remove();
            }
        }

        return set;

    }
}
