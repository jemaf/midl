package components;

import org.w3c.dom.Element;

import types.COMPONENT_TYPE;

public class Toggle  extends Component{

	private String textOn;
	private String textOff;
	private String checked;
	
	public Toggle() {
		this.componentType = COMPONENT_TYPE.TOGGLE;
		this.textOff = "Off";
		this.textOn = "On";
		this.checked = "false";
	}
	
	
	public Toggle(String id) {
		
		this.id = id;
		this.componentType = COMPONENT_TYPE.TOGGLE;
		this.textOff = "Off";
		this.textOn = "On";
		this.checked = "false";
	}
	
	
	@Override
	public void addSubComponent(Component c) {
		
		this.addSubComponent(c);
	}

	@Override
	public Component getSubComponent(String id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Element parse2Android() {
		
		element = super.parse2Android();
		
		element.setAttribute("android:textOn", this.textOn);
		element.setAttribute("android:textOff", this.textOff);
		element.setAttribute("android:checked", this.checked);
				
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
	 * @return the textOn
	 */
	public String getTextOn() {
		return textOn;
	}


	/**
	 * @param textOn the textOn to set
	 */
	public void setTextOn(String textOn) {
		this.textOn = textOn;
	}


	/**
	 * @return the textOff
	 */
	public String getTextOff() {
		return textOff;
	}


	/**
	 * @param textOff the textOff to set
	 */
	public void setTextOff(String textOff) {
		this.textOff = textOff;
	}


	/**
	 * @return the checked
	 */
	public String getChecked() {
		return checked;
	}


	/**
	 * @param checked the checked to set
	 */
	public void setChecked(String checked) {
		this.checked = checked;
	}


	public void setToggleComponent(String prop, String value) {
		
		if(prop.equalsIgnoreCase("textOn")) this.textOn = value;
		else if(prop.equalsIgnoreCase("textOff")) this.textOff = value;
		else if(prop.equalsIgnoreCase("checked")) this.checked = value;
		else super.setComponentAttribute(prop, value);
		
	}

}
