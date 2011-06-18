package components;

import types.COMPONENT_TYPE;

public class DropDownList extends Component {

	public DropDownList() {
		this.componentType = COMPONENT_TYPE.DROPDOWNLIST;
	}
	
	public DropDownList(String id) {
		this.componentType = COMPONENT_TYPE.DROPDOWNLIST;
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
