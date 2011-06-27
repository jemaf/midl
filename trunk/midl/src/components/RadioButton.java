package components;

import org.w3c.dom.Element;

import types.COMPONENT_TYPE;

public class RadioButton extends Component {

	private String isChecked;
	private String text;
	
	public RadioButton() {
		this.componentType = COMPONENT_TYPE.RADIOBUTTON;
		this.text = "";
		this.isChecked = "false";
	}

	public RadioButton(String id) {
		this.componentType = COMPONENT_TYPE.RADIOBUTTON;
		this.text = "";
		this.id = id;
		this.isChecked = "false";
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
		element.setAttribute("android:checked", this.isChecked);
		element.setAttribute("android:text", this.text);
		
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

	public void setRadioButtonComponent(String prop, String value) {
		
		if(prop.equalsIgnoreCase("checked")) this.isChecked = value;
		else if(prop.equalsIgnoreCase("text")) this.text = value; 
		else super.setComponentAttribute(prop, value);
		
	}
	
}
