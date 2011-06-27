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
			return "textEmailAddress";
		case PHONE:
			return "phone";
		case POSTALADDRESS:
			return "textPostalAddress";
			default:
				return null;
		
		}
	}

	public static INPUT_TYPE getEnumCorrespondence(String value) {
	
		if(value.toLowerCase().equalsIgnoreCase("textpersonname")) return TEXTPERSONNAME;
		else if(value.toLowerCase().equalsIgnoreCase("textpassword")) return TEXTPASSWORD;
		else if(value.toLowerCase().equalsIgnoreCase("numberpassword")) return NUMBERPASSWORD;
		else if(value.toLowerCase().equalsIgnoreCase("textemailaddres")) return TEXTEMAILADDRESS;
		else if(value.toLowerCase().equalsIgnoreCase("phone")) return PHONE;
		else if(value.toLowerCase().equalsIgnoreCase("postaladdress")) return POSTALADDRESS;
		else return null;
		
	}
}
