// OBJ05-J. Do not return references to private mutable class members
// Noncompliant Code Example
// Compliant Solution (clone())

class MutableClass {
  private Date d;
 
  public MutableClass() {
    d = new Date();
  }
 
    public Date getDate() {
        return (Date)d.clone();
    }
}