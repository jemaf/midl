package components;

import org.w3c.dom.Element;

import types.COMPONENT_TYPE;
import types.DIMENSION_TYPE;
import types.GRAVITY_TYPE;
import types.INPUT_TYPE;

public class Label extends Component {

	private String text;
	
	public Label() {
		this.componentType = COMPONENT_TYPE.LABEL;
		this.text = "";
	}
	
	public Label(String id) {
		this.componentType = COMPONENT_TYPE.LABEL;
		this.id = id;
		this.text = "";
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
		element.setAttribute("android:text", this.text);
		
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

