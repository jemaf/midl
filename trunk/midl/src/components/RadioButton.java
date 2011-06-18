package components;

import types.COMPONENT_TYPE;

public class RadioButton extends Component {

	public RadioButton() {
		this.componentType = COMPONENT_TYPE.RADIOBUTTON;
	}

	public RadioButton(String id) {
		this.componentType = COMPONENT_TYPE.RADIOBUTTON;
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
