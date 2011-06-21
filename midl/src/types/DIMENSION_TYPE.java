package types;

public enum DIMENSION_TYPE {

	WRAP_CONTENT, FILL_PARENT;

	public static String getAndroidCorrespondence(DIMENSION_TYPE type) {

		switch (type) {

		case WRAP_CONTENT:
			return "wrap_content";
		case FILL_PARENT:
			return "fill_parent";
		default:
			return null;

		}

	}
}
