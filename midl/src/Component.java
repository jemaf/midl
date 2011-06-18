import java.util.ArrayList;


public class Component {

	protected ArrayList<Component> subComponents;
	protected COMPONENT_TYPE type;
	
	public Component() {
		
		this.type = COMPONENT_TYPE.UNKNOWN;
		this.subComponents = new ArrayList<Component>();
	}
}
