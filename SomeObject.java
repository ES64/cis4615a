
public class SomeObject {
  private static final Object lock = new Object();
 
  public static void changeValue() {
    synchronized (lock) { // Locks on the private Object
      // ...
    }
  }
}