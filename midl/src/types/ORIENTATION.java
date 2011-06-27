package types;

public enum ORIENTATION {

	VERTICAL,
	HORIZONTAL;

	public static String getAndroidCorrespondence(ORIENTATION orientation) {
		
		switch(orientation) {
		case VERTICAL:
			return "vertical";
		case HORIZONTAL:
			return "horizontal";
			default:
				return null;
		}
		
	}

	public static ORIENTATION getEnumCorrespondence(String value) {
	
		value = value.trim();
		
		if(value.equalsIgnoreCase("vertical")) return VERTICAL;
		else if(value.equalsIgnoreCase("horizontal")) return HORIZONTAL;
		else return null;
		
	}
	
}
