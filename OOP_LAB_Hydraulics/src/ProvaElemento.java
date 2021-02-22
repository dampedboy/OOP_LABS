import hydraulic.*;

public class ProvaElemento {

	public static void main(String[] args) {
		
		HSystem hs= new HSystem();
		Element e1 = new Source("E1");
		Element e2 = new Source("E2");
		
		hs.addElement(e1);
		hs.addElement(e2);
		
		Element[] elements = hs.getElements();
		
		System.out.println(elements[0].getName());
		
		for (int i = 0; i < elements.length; i++) {
			elements[i] = null;
		}
		System.out.println(hs.getElements()[0].getName());

	}

}
