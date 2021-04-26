package flyweightAndClone;

public interface Employee extends Cloneable {
   public void report();  //作报告
   public Employee clone() throws CloneNotSupportedException;
}
