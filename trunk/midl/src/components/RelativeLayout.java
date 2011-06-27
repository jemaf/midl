package components;

import org.w3c.dom.Element;

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
	public void addSubComponent(Component c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Component getSubComponent(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Element parse2Android() {
		
		element = super.parse2Android();
		element.setAttribute(
			    "xmlns:android",
			    "http://schemas.android.com/apk/res/android");
		
		return element;
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

	public void setRelativeLayoutComponent(String prop, String value) {
		
		super.setComponentAttribute(prop, value);
	}
	
	
}
