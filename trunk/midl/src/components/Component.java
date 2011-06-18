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
	protected float layoutWeight;
	
	//atributos de margem para outros componentes
	protected float marginRight;
	protected float marginLeft;
	protected float marginTop;
	protected float marginBottom;
	
	
	public Component() {
		
		this.componentType = COMPONENT_TYPE.UNKNOWN;
		this.subComponents = new ArrayList<Component>();
		this.id = null;
	}
	
	public abstract void setSubComponent(Component c);
	public abstract Component getSubComponent(Component c);

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
	 * @return the marginRight
	 */
	public float getMarginRight() {
		return marginRight;
	}

	/**
	 * @param marginRight the marginRight to set
	 */
	public void setMarginRight(int marginRight) {
		this.marginRight = marginRight;
	}

	/**
	 * @return the marginLeft
	 */
	public float getMarginLeft() {
		return marginLeft;
	}

	/**
	 * @param marginLeft the marginLeft to set
	 */
	public void setMarginLeft(int marginLeft) {
		this.marginLeft = marginLeft;
	}

	/**
	 * @return the marginTop
	 */
	public float getMarginTop() {
		return marginTop;
	}

	/**
	 * @param marginTop the marginTop to set
	 */
	public void setMarginTop(int marginTop) {
		this.marginTop = marginTop;
	}

	/**
	 * @return the marginBottom
	 */
	public float getMarginBottom() {
		return marginBottom;
	}

	/**
	 * @param marginBottom the marginBottom to set
	 */
	public void setMarginBottom(int marginBottom) {
		this.marginBottom = marginBottom;
	}

	/**
	 * @return the layoutWeight
	 */
	public float getLayoutWeight() {
		return layoutWeight;
	}

	/**
	 * @param layoutWeight the layoutWeight to set
	 */
	public void setLayoutWeight(float layoutWeight) {
		this.layoutWeight = layoutWeight;
	}

	/**
	 * @param marginRight the marginRight to set
	 */
	public void setMarginRight(float marginRight) {
		this.marginRight = marginRight;
	}

	/**
	 * @param marginLeft the marginLeft to set
	 */
	public void setMarginLeft(float marginLeft) {
		this.marginLeft = marginLeft;
	}

	/**
	 * @param marginTop the marginTop to set
	 */
	public void setMarginTop(float marginTop) {
		this.marginTop = marginTop;
	}

	/**
	 * @param marginBottom the marginBottom to set
	 */
	public void setMarginBottom(float marginBottom) {
		this.marginBottom = marginBottom;
	}
	
	
	
}
