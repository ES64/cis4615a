// LCK00-J. Use private final lock objects to synchronize classes that may interact with untrusted code
// Noncompliant Code Example (Static)

public class R09_LCK00_J {
  private static final Object lock = new Object();
 
  public static void changeValue() {
    synchronized (lock) { // Locks on the private Object
      // ...
    }
  }
}