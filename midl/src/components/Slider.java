package components;

import types.COMPONENT_TYPE;

public class Slider  extends Component{

	public Slider() {
		this.componentType = COMPONENT_TYPE.SLIDER;
	}
	
	
	public Slider(String id) {
		
		this.id = id;
		this.componentType = COMPONENT_TYPE.SLIDER;
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


	@Override
	public String parse2Android() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String parse2iOS() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String parse2WindowsPhone() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String parse2BlackBerry() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}
