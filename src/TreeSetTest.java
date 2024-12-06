import java.util.*;

public class TreeSetTest {


    static final class Igor {
        private final Integer weight;
        private final Integer height;

        Igor(Integer weight, Integer height) {
            this.weight = weight;
            this.height = height;
        }

        public Integer weight() {
            return weight;
        }

        public Integer height() {
            return height;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this) return true;
            if (obj == null || obj.getClass() != this.getClass()) return false;
            var that = (Igor) obj;
            return Objects.equals(this.weight, that.weight) &&
                   Objects.equals(this.height, that.height);
        }

        @Override
        public int hashCode() {
            return Objects.hash(weight, height);
        }

        @Override
        public String toString() {
            return "Igor[" +
                   "weight=" + weight + ", " +
                   "height=" + height + ']';
        }


        }

    public static void main(String[] args) {
        List<Igor> items = List.of(new Igor(1, 1),
                new Igor(1, 2),
                new Igor(2, 1),
                new Igor(2, 2)
        );
        Set<Igor> hashSet = new HashSet<>();
        Set<Igor> notAllowed = new TreeSet<>();
        Set<Igor> treeSet1 = new TreeSet<>(Comparator.comparing(Igor::height));
        Set<Igor> treeSet2 = new TreeSet<>(Comparator.comparing(Igor::height).thenComparing(Igor::weight));

        for (Igor item : items) {
            hashSet.add(item);
            treeSet1.add(item);
            treeSet2.add(item);
            notAllowed.add(item);
        }
        System.out.println(hashSet.size());
        System.out.println(treeSet1.size());
        System.out.println(treeSet2.size());
    }


}




