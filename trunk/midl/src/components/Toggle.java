package components;

import org.w3c.dom.Element;

import types.COMPONENT_TYPE;

public class Toggle  extends Component{

	public Toggle() {
		this.componentType = COMPONENT_TYPE.TOGGLE;
	}
	
	
	public Toggle(String id) {
		
		this.id = id;
		this.componentType = COMPONENT_TYPE.TOGGLE;
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
