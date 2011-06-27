package components;

import org.w3c.dom.Element;

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
	public void addSubComponent(Component c) {
		
		this.addSubComponent(c);
	}

	@Override
	public Component getSubComponent(String id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Element parse2Android() {
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


	public void setSliderComponent(String prop, String value) {
		
		super.setComponentAttribute(prop, value);
		
	}

	
	
	
}
