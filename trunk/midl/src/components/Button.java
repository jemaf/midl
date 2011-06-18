package components;

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
	public void setSubComponent(Component c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Component getSubComponent(int pos) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
