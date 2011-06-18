package components;

import types.COMPONENT_TYPE;

public class RelativeLayout extends Component {

	public RelativeLayout() {
		this.componentType = COMPONENT_TYPE.RELATIVELAYOUT;
	}

	public RelativeLayout(String id) {
		this.componentType = COMPONENT_TYPE.RELATIVELAYOUT;
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
