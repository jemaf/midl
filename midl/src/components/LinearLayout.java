package components;

import org.w3c.dom.Element;

import types.COMPONENT_TYPE;
import types.DIMENSION_TYPE;
import types.GRAVITY_TYPE;
import types.ORIENTATION;

public class LinearLayout extends Component {

	private ORIENTATION orientation;
	
	public LinearLayout() {
		this.componentType = COMPONENT_TYPE.LINEARLAYOUT;
		this.orientation = ORIENTATION.VERTICAL;
		this.layoutWidth = DIMENSION_TYPE.FILL_PARENT;
		this.layoutHeight = DIMENSION_TYPE.FILL_PARENT;
		this.layoutGravity = GRAVITY_TYPE.FILL;
		this.layoutWeight = "1";
	}
	
	public LinearLayout(String id) {
		this.componentType = COMPONENT_TYPE.LINEARLAYOUT;
		this.id = id;
	}

	@Override
	public void addSubComponent(Component c) {
		
		this.subComponents.add(c);	
	}

	@Override
	public Component getSubComponent(int pos) {
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
	
	
}
