package hydraulic;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

/**
 * Main class that act as a container of the elements for the simulation of an
 * hydraulics system
 * 
 */
public class HSystem {
	// ARRAY VERSION
	// private Element[] elements = new Element[100];
	// private int nextElement = 0;

	// LIST VERSION
	private List<Element> elements = new ArrayList<>();

	/**
	 * Adds a new element to the system
	 * 
	 * @param elem
	 */
	public void addElement(Element elem) {
		// elements[nextElement]=elem;
		elements.add(elem);

	}

	/**
	 * returns the element added so far to the system. If no element is present in
	 * the system an empty array (length==0) is returned.
	 * 
	 * @return an array of the elements added to the hydraulic system
	 */
	public Element[] getElements() {
		// return elements;
		// Element[] result = new Element[nextElement];
		// for (int i = 0; i < nextElement; i++) {
		// result[i] = elements[i];
		// }
		// return Arrays.copyOf(elements, nextElement);
		// Element[] result = new Element[elements.size()];

		// USING THE ARRAYS PACKAGE
		// return elements.toArray();

		// LIST
		return elements.toArray(new Element[elements.size()]);

	}

	/**
	 * Prints the layout of the system starting at each Source
	 */
	public String layout() {
		// TODO: to be implemented
		return null;
	}

	/**
	 * starts the simulation of the system
	 */
	public void simulate(SimulationObserver observer) {
		for(Element e: elements) {
			if(e instanceof Source) {
				e.simulate(-1, observer);
			}
		}
	}

}
