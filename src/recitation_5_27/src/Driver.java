
public class Driver {
  public static void main(String[] args) {
    System.out.println("hello, world!");
    SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
    sll.addFirst(1);
    System.out.println(sll.toString());
    sll.addFirst(2);
    System.out.println(sll.toString());
    sll.addFirst(3);
    System.out.println(sll.toString());
    sll.addFirst(4);
    System.out.println(sll.toString());
    sll.addFirst(5);
    System.out.println(sll.toString());
    try {
      sll.swapNonAdjacentNodes(2, 4);
    } catch (Exception e) {
      System.err.println(e);
    }
    System.out.println(sll.toString());
    sll.removeAtEnd(2);
    System.out.println(sll.toString());
  }
}
