package components;

import org.w3c.dom.Element;

import types.COMPONENT_TYPE;
import types.DIMENSION_TYPE;
import types.GRAVITY_TYPE;
import types.INPUT_TYPE;

public class TextBox extends Component {

	
	private String text;
	private INPUT_TYPE inputType;
	
	public TextBox() {
		this.componentType = COMPONENT_TYPE.TEXTBOX;
		this.inputType = INPUT_TYPE.TEXTPERSONNAME;
		
	}
	
	public TextBox(String id) {
		this.id = id;
		this.componentType = COMPONENT_TYPE.TEXTBOX;
		this.inputType = INPUT_TYPE.TEXTPERSONNAME;
		this.layoutGravity = GRAVITY_TYPE.LEFT;
		this.layoutHeight = DIMENSION_TYPE.WRAP_CONTENT;
		this.layoutWidth = DIMENSION_TYPE.WRAP_CONTENT;
		this.layoutWeight = "0";
	}

	@Override
	public void addSubComponent(Component c) {
		this.subComponents.add(c);
		
	}

	@Override
	public Component getSubComponent(int pos) {
		return this.subComponents.get(pos);
	}

	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * @return the inputType
	 */
	public INPUT_TYPE getInputType() {
		return inputType;
	}

	/**
	 * @param inputType the inputType to set
	 */
	public void setInputType(INPUT_TYPE inputType) {
		this.inputType = inputType;
	}

	@Override
	public Element parse2Android() {
		
		element = document.createElement(
				COMPONENT_TYPE.getAndroidCorrespondence(this.componentType));
		
		element.setAttribute("android:id", "@+id/" + this.id);
		element.setAttribute("android:text", this.text);
		element.setAttribute("android:inputType", 
				INPUT_TYPE.getAndroidCorrespondence(this.inputType));
		
		element.setAttribute("android:layout_width", 
				DIMENSION_TYPE.getAndroidCorrespondence(layoutWidth));
		element.setAttribute("android:layout_height", 
				DIMENSION_TYPE.getAndroidCorrespondence(layoutHeight));
		element.setAttribute("android:layout_gravity", 
				GRAVITY_TYPE.getAndroidCorrespondence(layoutGravity));
		
		element.setAttribute("android:layout_marginTop", this.marginTop);
		element.setAttribute("android:layout_marginLeft", this.marginLeft);
		element.setAttribute("android:layout_marginRight", this.marginRight);
		element.setAttribute("android:layout_marginBottom", this.marginBottom);
		
		
		for (Component component : this.subComponents)
			element.appendChild(component.parse2Android());
		
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
