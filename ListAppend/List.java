public class List {
    private List next;
    private Object o;
    // Variation: IntLias with "private int i;"

    // Variation: add split-operation:
    // public static List split(List list1, List list2)
    // which removes the prefix list1 from list2 (or vice versa)

    public static List split(List list1, List list2) {
        List last = list2;
        while (last.next != list1) {
            last = last.next;
        }
        last.next = null;
        return list2;
    }

    public static List append(List list1, List list2) {
        // As a case to avoid the exceotion (ret =?= list2)
        // if (list1 == null) return list2;
        List last = list1;
        while (last.next != null) {
            last = last.next;
        }
        last.next = list2;
        return list1;
    }

    public List(List next, Object o) {
        this.next = next;
        this.o = o;
    }

    public static List create(int len) {
        List res = new List(null, new Object());
        for (int i = 0; i < len; i++) {
            res = new List(res, new Object());
        }
        return res;
    }

    public static void main(String [] args) {
        List l1 = create(args[0].length());
        List l2 = create(args[1].length());
        List l3 = append(l1, l2);
    }
}
