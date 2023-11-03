package istate;

import jakarta.ejb.Stateless;

@Stateless
public class TabBeanIL implements ITab {
	int [] T;
	int indx;
	
	public TabBeanIL() {
		T=new int[3];
		indx=0;
	}
	
	@Override
	public int somme() {
		int s=0;
		for(int i=0;i<indx;i++) s+=T[i];
		return s;
	}
	@Override
	public void setV(int v) {
		T[indx]=v;
		indx++;
		
	}
	
}
