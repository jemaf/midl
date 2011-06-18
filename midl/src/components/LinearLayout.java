package components;

import types.COMPONENT_TYPE;

public class LinearLayout extends Component {

	public LinearLayout() {
		this.componentType = COMPONENT_TYPE.LINEARLAYOUT;
	}
	
	public LinearLayout(String id) {
		this.componentType = COMPONENT_TYPE.LINEARLAYOUT;
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
