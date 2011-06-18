package components;

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
	public void setSubComponent(Component c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Component getSubComponent(Component c) {
		// TODO Auto-generated method stub
		return null;
	}
}

