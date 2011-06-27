package components;

import java.util.ArrayList;

import org.w3c.dom.Element;

import types.COMPONENT_TYPE;
import types.ORIENTATION;

public class RadioButtonList extends Component {

	private ORIENTATION orientation;

	public RadioButtonList() {
		this.componentType = COMPONENT_TYPE.RADIOBUTTONLIST;
		this.subComponents = new ArrayList<Component>();
		this.orientation = ORIENTATION.VERTICAL;
	}

	public RadioButtonList(String id) {
		this.componentType = COMPONENT_TYPE.RADIOBUTTONLIST;
		this.orientation = ORIENTATION.VERTICAL;
		this.subComponents = new ArrayList<Component>();
		this.id = id;
	}

	@Override
	public void addSubComponent(Component c) {

		this.subComponents.add(c);
	}

	@Override
	public Component getSubComponent(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Element parse2Android() {

		element = super.parse2Android();

		element.setAttribute("android:orientation",
				ORIENTATION.getAndroidCorrespondence(this.orientation));

		return element;
	}

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

	/**
	 * @return the orientation
	 */
	public ORIENTATION getOrientation() {
		return orientation;
	}

	/**
	 * @param orientation
	 *            the orientation to set
	 */
	public void setOrientation(ORIENTATION orientation) {
		this.orientation = orientation;
	}

	public void setRadioButtonListComponent(String prop, String value) {

		if (prop.equalsIgnoreCase("orientation"))
			this.orientation = ORIENTATION.getEnumCorrespondence(value);
		else super.setComponentAttribute(prop, value);

	}

}
