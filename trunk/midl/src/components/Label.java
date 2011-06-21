package components;

import org.w3c.dom.Element;

import types.COMPONENT_TYPE;

public class Label extends Component {

	public Label() {
		this.componentType = COMPONENT_TYPE.LABEL;
	}
	
	public Label(String id) {
		this.componentType = COMPONENT_TYPE.LABEL;
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

