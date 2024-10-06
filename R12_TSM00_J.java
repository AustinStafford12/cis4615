// Rule 12. Thread-Safety Miscellaneous (TSM)
// non-compliant code:
class Base {
  public synchronized void doSomething() {
    // ...
  }
}
 
class Derived extends Base {
  @Override public void doSomething() {
    // ...
  }
}
