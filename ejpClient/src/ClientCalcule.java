

import java.util.Properties;

import javax.naming.InitialContext;

import iadd.Iadd;
import istate.ITab;
import istate.TabBeanIL;
import iadd.AddBean;
public class ClientCalcule {

	public static void main(String[] args) {
		
		try{ 
			 Properties props = new Properties();
			 
			 props.put("java.naming.factory.url.pkgs","org.jboss.ejb.client.naming");
			 props.put("jboss.naming.client.ejb.context",true);
			 InitialContext context = new InitialContext(props);

			 Iadd x = (Iadd)context.lookup("ejb:/ejbproject/AddBean!iadd.Iadd");
			 int s = x.add(10, 15);
			 System.out.println("s= "+s);
			 
			 ITab y = (ITab)context.lookup("ejb:/ejpstate/TabBeanIL!istate.ITab");
			 y.setV(10); y.setV(20);
			 s = y.somme();
			 System.out.println("somme Tab= "+s);
			 
			
			 context.close();
			 }catch(Exception e){e.printStackTrace();}

	}

}
