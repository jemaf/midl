package components;

import types.COMPONENT_TYPE;

public class TableLayout extends Component {

	public TableLayout() {
		this.componentType = COMPONENT_TYPE.TABLELAYOUT;
	}
	
	public TableLayout(String id) {
		this.componentType = COMPONENT_TYPE.TABLELAYOUT;
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
