package components;

import org.w3c.dom.Element;

import types.COMPONENT_TYPE;

public class CheckBox extends Component{

	private String text;
	private String checked;
	
	public CheckBox() {
		this.componentType = COMPONENT_TYPE.CHECKBOX;
		this.text = "CheckBox";
		this.checked = "false";
	}
	
	
	public CheckBox(String id) {
		
		this.id = id;
		this.componentType = COMPONENT_TYPE.CHECKBOX;
		this.text = "CheckBox";
		this.checked = "false";
	}
	
	
	@Override
	public void addSubComponent(Component c) {
		// TODO Auto-generated method stub
		
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
		element.setAttribute("android:checked", this.checked);
		
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
	 * @return the checked
	 */
	public String getChecked() {
		return checked;
	}


	/**
	 * @param checked the checked to set
	 */
	public void setChecked(String checked) {
		this.checked = checked;
	}

	
	
	
}
