package components;

import types.COMPONENT_TYPE;

public class TextBox extends Component {

	public TextBox() {
		this.componentType = COMPONENT_TYPE.TEXTBOX;
	}

	public TextBox(String id) {
		this.componentType = COMPONENT_TYPE.TEXTBOX;
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
