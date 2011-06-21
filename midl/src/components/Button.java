package components;

import org.w3c.dom.Element;

import types.COMPONENT_TYPE;

public class Button extends Component {

	public Button() {
		this.componentType = COMPONENT_TYPE.BUTTON;
	}
	
	public Button(String id) {
		this.componentType = COMPONENT_TYPE.BUTTON;
		this.id = id;
	}

	@Override
	public void addSubComponent(Component c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Component getSubComponent(int pos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Element parse2Android() {
		// TODO Auto-generated method stub
		return null;
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
