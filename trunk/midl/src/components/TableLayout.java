package components;

import org.w3c.dom.Element;

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
