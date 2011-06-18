package components;

import types.COMPONENT_TYPE;

public class CheckBox extends Component{

	public CheckBox() {
		this.componentType = COMPONENT_TYPE.CHECKBOX;
	}
	
	
	public CheckBox(String id) {
		
		this.id = id;
		this.componentType = COMPONENT_TYPE.CHECKBOX;
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
