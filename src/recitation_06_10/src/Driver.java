import java.util.Random;
import java.util.random.RandomGeneratorFactory;
import net.datastructures.LinkedStack;

public class Driver {
  public static void main(String[] args) {
    LinkedStack<Integer> r = new LinkedStack<>();
    LinkedStack<Integer> s = new LinkedStack<>();
    LinkedStack<Integer> t = new LinkedStack<>();

    r.push(1);
    r.push(2);
    r.push(3);
    r.push(4);
    r.push(5);
    r.push(6);
    r.push(7);
    r.push(8);
    r.push(9);
    r.push(10);
    s.push(11);
    s.push(12);
    s.push(13);
    s.push(14);
    s.push(15);
    s.push(16);
    s.push(17);
    s.push(18);
    s.push(19);
    s.push(20);
    t.push(21);
    t.push(22);
    t.push(23);
    t.push(24);
    t.push(25);
    t.push(26);
    t.push(27);
    t.push(28);
    t.push(29);
    t.push(30);

    System.out.println("Before:");
    System.out.println("r: " + r.toString());
    System.out.println("s: " + s.toString());
    System.out.println("t: " + t.toString());
    System.out.println();

    for (int i = 0; i < 10; i++) {
      r.push(t.pop());
    }
    for (int i = 0; i < 10; i++) {
      t.push(s.pop());
    }
    for (int i = 0; i < 10; i++) {
      s.push(r.pop());
    }
    for (int i = 0; i < 10; i++) {
      s.push(t.pop());
    }

    System.out.println("After moving stuff around (TOP IS ON THE LEFT)");
    System.out.println("r: " + r.toString());
    System.out.println("s: " + s.toString());
    System.out.println("t: " + t.toString());

  }
}
