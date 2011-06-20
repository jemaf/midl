package components;

import types.COMPONENT_TYPE;
import types.INPUT_TYPE;

public class TextBox extends Component {

	
	private String text;
	private INPUT_TYPE inputType;
	
	public TextBox() {
		this.componentType = COMPONENT_TYPE.TEXTBOX;
		this.inputType = INPUT_TYPE.TEXTPERSONNAME;
	}
	
	public TextBox(String id) {
		this.componentType = COMPONENT_TYPE.TEXTBOX;
		this.id = id;
		this.inputType = INPUT_TYPE.TEXTPERSONNAME;
	}

	@Override
	public void setSubComponent(Component c) {
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
