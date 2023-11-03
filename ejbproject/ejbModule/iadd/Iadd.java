package iadd;

import jakarta.ejb.Remote;

@Remote
public interface Iadd {
 public int add(int a,int b);
}
