package components;

import types.COMPONENT_TYPE;

public class ProgressBar extends Component {


	public ProgressBar() {
		
		this.componentType = COMPONENT_TYPE.PROGRESSBAR;
	}
	
	public ProgressBar(String id) {
		
		this.id = id;
		this.componentType = COMPONENT_TYPE.PROGRESSBAR;
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
