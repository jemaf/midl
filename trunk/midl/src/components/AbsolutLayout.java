package components;

import org.w3c.dom.Element;

import types.COMPONENT_TYPE;

public class AbsolutLayout extends Component {

	public AbsolutLayout() {
		this.componentType = COMPONENT_TYPE.ABSOLUTLAYOUT;
	}
	
	public AbsolutLayout(String id) {
		this.componentType = COMPONENT_TYPE.ABSOLUTLAYOUT;
		this.id = id;
	}

	@Override
	public void addSubComponent(Component c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Component getSubComponent(String id) {
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
