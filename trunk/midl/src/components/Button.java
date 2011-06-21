package components;

import org.w3c.dom.Element;

import types.COMPONENT_TYPE;

public class Button extends Component {

	private String text;
	
	public Button() {
		this.componentType = COMPONENT_TYPE.BUTTON;
		this.text = "";
	}
	
	public Button(String id) {
		this.componentType = COMPONENT_TYPE.BUTTON;
		this.id = id;
		this.text = "";
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
	
}
