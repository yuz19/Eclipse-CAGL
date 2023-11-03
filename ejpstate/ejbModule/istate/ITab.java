package istate;

import jakarta.ejb.Remote;

@Remote
public interface ITab {
 int somme();
 void setV(int v);
}
