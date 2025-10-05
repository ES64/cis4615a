// THI00-J. Do not invoke Thread.run()

public final class R10_THI00_J10 implements Runnable {
  @Override public void run() {
    // ...
  }
 
  public static void main(String[] args) {
    Foo foo = new Foo();
    new Thread(foo).start();
  }
}