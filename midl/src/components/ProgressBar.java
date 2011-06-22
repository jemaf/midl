package components;

import org.w3c.dom.Element;

import types.COMPONENT_TYPE;

public class ProgressBar extends Component {

	private int max;
	private int progress;

	public ProgressBar() {
		
		this.componentType = COMPONENT_TYPE.PROGRESSBAR;
		this.max = 100;
		this.progress = 50;
	}
	
	public ProgressBar(String id) {
		
		this.id = id;
		this.componentType = COMPONENT_TYPE.PROGRESSBAR;
		this.max = 100;
		this.progress = 50;
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
		
		element.setAttribute("android:max", this.max + "");
		element.setAttribute("android:progress", this.progress + "");
		
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
	 * @return the max
	 */
	public int getMax() {
		return max;
	}

	/**
	 * @param max the max to set
	 */
	public void setMax(int max) {
		this.max = max;
	}
	

}
