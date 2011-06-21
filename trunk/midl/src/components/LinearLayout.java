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
	
		element = document.createElement(
				COMPONENT_TYPE.getAndroidCorrespondence(this.componentType));
	
		element.setAttribute(
			    "xmlns:android",
			    "http://schemas.android.com/apk/res/android");
		
		element.setAttribute("android:layout_width", 
				DIMENSION_TYPE.getAndroidCorrespondence(layoutWidth));
		element.setAttribute("android:layout_height", 
				DIMENSION_TYPE.getAndroidCorrespondence(layoutHeight));
		element.setAttribute("android:layout_gravity", 
				GRAVITY_TYPE.getAndroidCorrespondence(layoutGravity));
		element.setAttribute("android:orientation", 
				ORIENTATION.getAndroidCorrespondence(this.orientation));
		
		element.setAttribute("android:layout_marginTop", this.marginTop);
		element.setAttribute("android:layout_marginLeft", this.marginLeft);
		element.setAttribute("android:layout_marginRight", this.marginRight);
		element.setAttribute("android:layout_marginBottom", this.marginBottom);
		
		for (Component component : this.subComponents) {
			element.appendChild(component.parse2Android());
		}
		
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
