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
	
}
