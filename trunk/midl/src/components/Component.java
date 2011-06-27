package components;

import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import types.COMPONENT_TYPE;
import types.DIMENSION_TYPE;
import types.GRAVITY_TYPE;

public abstract class Component {

	// atributos basicos do componente (id e subcomponentes)
	protected String id;
	protected ArrayList<Component> subComponents;

	// atributos de layout e dimensao
	protected COMPONENT_TYPE componentType;
	protected DIMENSION_TYPE layoutWidth;
	protected DIMENSION_TYPE layoutHeight;
	protected GRAVITY_TYPE layoutGravity;
	protected String layoutWeight;

	// atributos de margem para outros componentes
	protected String marginRight;
	protected String marginLeft;
	protected String marginTop;
	protected String marginBottom;

	public static Document document = null;
	protected Element element;

	public Component() {

		this.componentType = COMPONENT_TYPE.UNKNOWN;
		this.layoutWidth = DIMENSION_TYPE.FILL_PARENT;
		this.layoutHeight = DIMENSION_TYPE.WRAP_CONTENT;
		this.layoutGravity = GRAVITY_TYPE.LEFT;
		this.layoutWeight = "1";
		
		this.subComponents = new ArrayList<Component>();
		this.id = null;

		this.marginBottom = "0dip";
		this.marginRight = "0dip";
		this.marginLeft = "0dip";
		this.marginTop = "0dip";

		try {
			if (document == null) {
				document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
			}
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public Component(String id2) {
		this.id = id2;
	}

	public void setComponentAttribute(String prop, String value) {

		if (prop.equalsIgnoreCase("marginRight"))
			this.marginRight = value;
		else if (prop.equalsIgnoreCase("marginBottom"))
			this.marginBottom = value;
		else if (prop.equalsIgnoreCase("marginLeft"))
			this.marginLeft = value;
		else if (prop.equalsIgnoreCase("marginTop"))
			this.marginTop = value;
		else if (prop.equalsIgnoreCase("Weight"))
			this.layoutWeight = value;
		else if (prop.equalsIgnoreCase("Width"))
			this.layoutWidth = DIMENSION_TYPE.getEnumCorrespondence(value);
		else if (prop.equalsIgnoreCase("Height"))
			this.layoutHeight = DIMENSION_TYPE.getEnumCorrespondence(value);
		else if (prop.equalsIgnoreCase("Gravity"))
			this.layoutGravity = GRAVITY_TYPE.getEnumCorrespondence(value);

	}

	public Element parse2Android() {

		element = document.createElement(COMPONENT_TYPE
				.getAndroidCorrespondence(this.componentType));
		element.setAttribute("android:id", "@+id/" + this.id);

		element.setAttribute("android:layout_width",
				DIMENSION_TYPE.getAndroidCorrespondence(layoutWidth));
		element.setAttribute("android:layout_height",
				DIMENSION_TYPE.getAndroidCorrespondence(layoutHeight));
		element.setAttribute("android:layout_gravity",
				GRAVITY_TYPE.getAndroidCorrespondence(layoutGravity));

		element.setAttribute("android:layout_marginTop", this.marginTop);
		element.setAttribute("android:layout_marginLeft", this.marginLeft);
		element.setAttribute("android:layout_marginRight", this.marginRight);
		element.setAttribute("android:layout_marginBottom", this.marginBottom);

		for (Component component : this.subComponents)
			element.appendChild(component.parse2Android());

		return element;
	}

	public abstract String parse2iOS();

	public abstract String parse2WindowsPhone();

	public abstract String parse2BlackBerry();

	public abstract void addSubComponent(Component c);

	public Component getSubComponent(String id) {
		
		Component temp = new Component(id) {
			
			@Override
			public String parse2iOS() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String parse2WindowsPhone() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String parse2BlackBerry() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void addSubComponent(Component c) {
				// TODO Auto-generated method stub
				
			}
		};
		int index =  this.subComponents.indexOf(temp);
		
		return this.subComponents.get(index);
	}
	
	public void printComponent() throws Exception {
		Element e = this.parse2Android();
		Component.document.appendChild(e);

		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(Component.document);
		StreamResult result = new StreamResult(System.out);
		transformer.transform(source, result);
	}

	public Object clone() {
		return this;
	}

	@Override
	public int hashCode() {
		return 1;
	}

	@Override
	public String toString() {
		return this.id + " " + COMPONENT_TYPE.getAndroidCorrespondence(componentType);
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Component) {

			Component temp = (Component) obj;
			if (this.id.equals(temp.id))
				return true;
		}

		return false;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the subComponents
	 */
	public ArrayList<Component> getSubComponents() {
		return subComponents;
	}

	/**
	 * @param subComponents
	 *            the subComponents to set
	 */
	public void setSubComponents(ArrayList<Component> subComponents) {
		this.subComponents = subComponents;
	}

	/**
	 * @return the componentType
	 */
	public COMPONENT_TYPE getComponentType() {
		return componentType;
	}

	/**
	 * @param componentType
	 *            the componentType to set
	 */
	public void setComponentType(COMPONENT_TYPE componentType) {
		this.componentType = componentType;
	}

	/**
	 * @return the layoutWidth
	 */
	public DIMENSION_TYPE getLayoutWidth() {
		return layoutWidth;
	}

	/**
	 * @param layoutWidth
	 *            the layoutWidth to set
	 */
	public void setLayoutWidth(DIMENSION_TYPE layoutWidth) {
		this.layoutWidth = layoutWidth;
	}

	/**
	 * @return the layoutHeight
	 */
	public DIMENSION_TYPE getLayoutHeight() {
		return layoutHeight;
	}

	/**
	 * @param layoutHeight
	 *            the layoutHeight to set
	 */
	public void setLayoutHeight(DIMENSION_TYPE layoutHeight) {
		this.layoutHeight = layoutHeight;
	}

	/**
	 * @return the layoutGravity
	 */
	public GRAVITY_TYPE getLayoutGravity() {
		return layoutGravity;
	}

	/**
	 * @param layoutGravity
	 *            the layoutGravity to set
	 */
	public void setLayoutGravity(GRAVITY_TYPE layoutGravity) {
		this.layoutGravity = layoutGravity;
	}

	/**
	 * @return the layoutWeight
	 */
	public String getLayoutWeight() {
		return layoutWeight;
	}

	/**
	 * @param layoutWeight
	 *            the layoutWeight to set
	 */
	public void setLayoutWeight(String layoutWeight) {
		this.layoutWeight = layoutWeight;
	}

	/**
	 * @return the marginRight
	 */
	public String getMarginRight() {
		return marginRight;
	}

	/**
	 * @param marginRight
	 *            the marginRight to set
	 */
	public void setMarginRight(String marginRight) {
		this.marginRight = marginRight;
	}

	/**
	 * @return the marginLeft
	 */
	public String getMarginLeft() {
		return marginLeft;
	}

	/**
	 * @param marginLeft
	 *            the marginLeft to set
	 */
	public void setMarginLeft(String marginLeft) {
		this.marginLeft = marginLeft;
	}

	/**
	 * @return the marginTop
	 */
	public String getMarginTop() {
		return marginTop;
	}

	/**
	 * @param marginTop
	 *            the marginTop to set
	 */
	public void setMarginTop(String marginTop) {
		this.marginTop = marginTop;
	}

	/**
	 * @return the marginBottom
	 */
	public String getMarginBottom() {
		return marginBottom;
	}

	/**
	 * @param marginBottom
	 *            the marginBottom to set
	 */
	public void setMarginBottom(String marginBottom) {
		this.marginBottom = marginBottom;
	}

}