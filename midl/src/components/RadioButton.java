package components;

import org.w3c.dom.Element;

import types.COMPONENT_TYPE;

public class RadioButton extends Component {

	private String isChecked;
	
	public RadioButton() {
		this.componentType = COMPONENT_TYPE.RADIOBUTTON;
		this.isChecked = "false";
	}

	public RadioButton(String id) {
		this.componentType = COMPONENT_TYPE.RADIOBUTTON;
		this.id = id;
		this.isChecked = "false";
	}

	@Override
	public void addSubComponent(Component c) {
		
		this.subComponents.add(c);
	}

	@Override
	public Component getSubComponent(int pos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Element parse2Android() {
	
		element = super.parse2Android();
		element.setAttribute("android:ischecked", this.isChecked);
		
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
	
}
