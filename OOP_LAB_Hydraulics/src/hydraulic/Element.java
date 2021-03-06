package hydraulic;

/**
 * Represents the generic abstract element of an hydraulics system. It is the
 * base class for all elements.
 *
 * Any element can be connect to a downstream element using the method
 * {@link #connect(Element) connect()}.
 */
public abstract class Element {

	private String name;
	private Element[] outputs;

	/**
	 * Constructor
	 * 
	 * @param name
	 *            the name of the element
	 */
	public Element(String name) {
		this(name, 1);

	}

	public Element(String name, int output) {
		this.name = name;
		outputs = new Element[output];
	}

	/**
	 * getter method
	 * 
	 * @return the name of the element
	 */
	public String getName() {
		return name;
	}

	/**
	 * Connects this element to a given element. The given element will be connected
	 * downstream of this element
	 * 
	 * @param elem
	 *            the element that will be placed downstream
	 */
	public void connect(Element elem) {
		connect(elem, 0);
	}

	/**
	 * Retrieves the element connected downstream of this
	 * 
	 * @return downstream element
	 */
	public Element getOutput() {
		return outputs[0];
	}

	public Element[] getOutputs() {
		return outputs;
	}

	/**
	 * connect one of the outputs of this split to a downstream component.
	 * 
	 * @param elem
	 *            the element to be connected downstream
	 * @param noutput
	 *            the output number to be used to connect the element
	 */
	public void connect(Element elem, int noutput) {
		outputs[noutput] = elem;
	}
	
	abstract void simulate(double inFlow, SimulationObserver observer);

}
