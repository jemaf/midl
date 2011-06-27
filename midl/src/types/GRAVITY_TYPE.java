package types;

public enum GRAVITY_TYPE {
	
	BOTTOM,
	CENTER,
	CENTER_HORIZONTAL,
	CENTER_VERTICAL,
	FILL,
	FILL_HORIZONTAL,
	FILL_VERTICAL,
	LEFT,
	RIGHT,
	TOP;
	
	
	public static String getAndroidCorrespondence(GRAVITY_TYPE type) {
		
		switch (type) {
		
		case BOTTOM:
			return "bottom";
		case CENTER:
			return "center";
		case CENTER_HORIZONTAL:
			return "center_horizontal";
		case CENTER_VERTICAL:
			return "center_vertical";
		case FILL:
			return "fill";
		case FILL_HORIZONTAL:
			return "fill_horizontal";
		case FILL_VERTICAL:
			return "fill_vertical";
		case LEFT:
			return "left";
		case RIGHT:
			return "right";
		case TOP:
			return "top";
			default:
				return null;
		}
		
	}

	public static GRAVITY_TYPE getEnumCorrespondence(String value) {
		
		if(value.equalsIgnoreCase("bottom")) return BOTTOM;
		else if (value.equalsIgnoreCase("center")) return CENTER;
		else if (value.equalsIgnoreCase("centerHorizontal")) return CENTER_HORIZONTAL;
		else if (value.equalsIgnoreCase("centerVertical")) return CENTER_VERTICAL;
		else if (value.equalsIgnoreCase("fill")) return FILL;
		else if (value.equalsIgnoreCase("fillHorizontal")) return FILL_HORIZONTAL;
		else if (value.equalsIgnoreCase("fillVertical")) return FILL_VERTICAL;
		else if (value.equalsIgnoreCase("left")) return LEFT;
		else if (value.equalsIgnoreCase("right")) return RIGHT;
		else if (value.equalsIgnoreCase("top")) return TOP;
		else return null;
	}

	
	
	
}
