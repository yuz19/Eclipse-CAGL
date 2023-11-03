package iadd;

import jakarta.ejb.Stateless;

@Stateless
public class AddBean implements Iadd{

	@Override
	public int add(int a, int b) {
		return a+b;
	}

}
