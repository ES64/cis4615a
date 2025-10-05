// LCK00-J. Use private final lock objects to synchronize classes that may interact with untrusted code
// Noncompliant Code Example (Static)

public class R09_LCK00_J {
  //changeValue locks on the class object's monitor
  public static synchronized void changeValue() {
    // ...
  }
}
 
// Untrusted code
synchronized (R09_LCK00_J.class) {
  while (true) {
    Thread.sleep(Integer.MAX_VALUE); // Indefinitely delay someObject
  }
}