package components;

import types.COMPONENT_TYPE;

public class RadioButtonList extends Component {

	public RadioButtonList() {
		this.componentType = COMPONENT_TYPE.RADIOBUTTONLIST;
	}

	public RadioButtonList(String id) {
		this.componentType = COMPONENT_TYPE.RADIOBUTTONLIST;
		this.id = id;
	}

	@Override
	public void setSubComponent(Component c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Component getSubComponent(int pos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String parse2Android() {
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
