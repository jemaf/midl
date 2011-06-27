package components;

import java.util.ArrayList;

import org.w3c.dom.Element;

import types.COMPONENT_TYPE;

public class DropDownList extends Component {

	private ArrayList<String> items;
	
	
	public DropDownList() {
		this.componentType = COMPONENT_TYPE.DROPDOWNLIST;
		this.items = new ArrayList<String>();
	}
	
	public DropDownList(String id) {
		this.componentType = COMPONENT_TYPE.DROPDOWNLIST;
		this.id = id;
		this.items = new ArrayList<String>();
	}

	@Override
	public void addSubComponent(Component c) {
		
		this.subComponents.add(c);
	}

	@Override
	public Component getSubComponent(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Element parse2Android() {

		element = super.parse2Android();
		
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
	 * @return the items
	 */
	public ArrayList<String> getItems() {
		return items;
	}

	/**
	 * @param items the items to set
	 */
	public void setItems(ArrayList<String> items) {
		this.items = items;
	}

	public void setDropDownListComponent(String prop, String value) {
	
		super.setComponentAttribute(prop, value);
	}
	
}
