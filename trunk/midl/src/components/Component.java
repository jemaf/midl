package components;
import java.util.ArrayList;

import types.DIMENSION_TYPE;
import types.COMPONENT_TYPE;
import types.GRAVITY_TYPE;


public abstract class Component {

	//atributos basicos do componente (id e subcomponentes)
	protected String id;
	protected ArrayList<Component> subComponents;
	
	//atributos de layout e dimensao
	protected COMPONENT_TYPE componentType;
	protected DIMENSION_TYPE layoutWidth;
	protected DIMENSION_TYPE layoutHeight;
	protected GRAVITY_TYPE layoutGravity;
	protected String layoutWeight;
	
	//atributos de margem para outros componentes
	protected String marginRight;
	protected String marginLeft;
	protected String marginTop;
	protected String marginBottom;
	
	
	public Component() {
		
		this.componentType = COMPONENT_TYPE.UNKNOWN;
		this.subComponents = new ArrayList<Component>();
		this.id = null;
	}
	
	public abstract void setSubComponent(Component c);
	public abstract Component getSubComponent(int pos);

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the subComponents
	 */
	public ArrayList<Component> getSubComponents() {
		return subComponents;
	}

	/**
	 * @param subComponents the subComponents to set
	 */
	public void setSubComponents(ArrayList<Component> subComponents) {
		this.subComponents = subComponents;
	}

	/**
	 * @return the componentType
	 */
	public COMPONENT_TYPE getComponentType() {
		return componentType;
	}

	/**
	 * @param componentType the componentType to set
	 */
	public void setComponentType(COMPONENT_TYPE componentType) {
		this.componentType = componentType;
	}

	/**
	 * @return the layoutWidth
	 */
	public DIMENSION_TYPE getLayoutWidth() {
		return layoutWidth;
	}

	/**
	 * @param layoutWidth the layoutWidth to set
	 */
	public void setLayoutWidth(DIMENSION_TYPE layoutWidth) {
		this.layoutWidth = layoutWidth;
	}

	/**
	 * @return the layoutHeight
	 */
	public DIMENSION_TYPE getLayoutHeight() {
		return layoutHeight;
	}

	/**
	 * @param layoutHeight the layoutHeight to set
	 */
	public void setLayoutHeight(DIMENSION_TYPE layoutHeight) {
		this.layoutHeight = layoutHeight;
	}

	/**
	 * @return the layoutGravity
	 */
	public GRAVITY_TYPE getLayoutGravity() {
		return layoutGravity;
	}

	/**
	 * @param layoutGravity the layoutGravity to set
	 */
	public void setLayoutGravity(GRAVITY_TYPE layoutGravity) {
		this.layoutGravity = layoutGravity;
	}

	/**
	 * @return the layoutWeight
	 */
	public String getLayoutWeight() {
		return layoutWeight;
	}

	/**
	 * @param layoutWeight the layoutWeight to set
	 */
	public void setLayoutWeight(String layoutWeight) {
		this.layoutWeight = layoutWeight;
	}

	/**
	 * @return the marginRight
	 */
	public String getMarginRight() {
		return marginRight;
	}

	/**
	 * @param marginRight the marginRight to set
	 */
	public void setMarginRight(String marginRight) {
		this.marginRight = marginRight;
	}

	/**
	 * @return the marginLeft
	 */
	public String getMarginLeft() {
		return marginLeft;
	}

	/**
	 * @param marginLeft the marginLeft to set
	 */
	public void setMarginLeft(String marginLeft) {
		this.marginLeft = marginLeft;
	}

	/**
	 * @return the marginTop
	 */
	public String getMarginTop() {
		return marginTop;
	}

	/**
	 * @param marginTop the marginTop to set
	 */
	public void setMarginTop(String marginTop) {
		this.marginTop = marginTop;
	}

	/**
	 * @return the marginBottom
	 */
	public String getMarginBottom() {
		return marginBottom;
	}

	/**
	 * @param marginBottom the marginBottom to set
	 */
	public void setMarginBottom(String marginBottom) {
		this.marginBottom = marginBottom;
	}

}