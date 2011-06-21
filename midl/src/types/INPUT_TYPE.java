package types;

public enum INPUT_TYPE {

	TEXTPERSONNAME,
	TEXTPASSWORD,
	NUMBERPASSWORD,
	TEXTEMAILADDRESS,
	PHONE,
	POSTALADDRESS;
	
	public static String getAndroidCorrespondence(INPUT_TYPE type) {
		
		switch(type) {
		
		case TEXTPERSONNAME:
			return "textPersonName";
		case TEXTPASSWORD:
			return "textPassword";
		case NUMBERPASSWORD:
			return "numberPassword";
		case TEXTEMAILADDRESS:
			return "textEmailAddres";
		case PHONE:
			return "phone";
		case POSTALADDRESS:
			return "postalAddres";
			default:
				return null;
		
		}
	}
}
