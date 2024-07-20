import java.util.HashSet;
import java.util.LinkedList;

public class RemoveDuplicatesFromLinkedList {

    public static void removeDuplicates(LinkedList<Integer> list) {
        HashSet<Integer> set = new HashSet<>();
        LinkedList<Integer> newList = new LinkedList<>();

        for (Integer num : list) {
            if (!set.contains(num)) {
                set.add(num);
                newList.add(num);
            }
        }

        // Clear the original list and add elements from the new list
        list.clear();
        list.addAll(newList);
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(3);
        linkedList.add(5);
        linkedList.add(3);
        linkedList.add(7);
        linkedList.add(8);
        linkedList.add(5);
        linkedList.add(10);

        System.out.println("Original Linked List: " + linkedList);

        removeDuplicates(linkedList);

        System.out.println("Linked List after removing duplicates: " + linkedList);
    }
}
