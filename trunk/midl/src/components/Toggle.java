package components;

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
	public void setSubComponent(Component c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Component getSubComponent(Component c) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}
