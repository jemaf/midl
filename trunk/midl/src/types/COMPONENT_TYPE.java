package types;

public enum COMPONENT_TYPE {
	
	UNKNOWN,
	
	//componentes normais
	TEXTBOX,
	BUTTON,
	LABEL,
	DROPDOWNLIST,
	RADIOBUTTON,
	RADIOBUTTONLIST,
	SLIDER,
	PROGRESSBAR,
	CHECKBOX,
	TOGGLE,
	
	//layouts
	LINEARLAYOUT,
	ABSOLUTLAYOUT,
	TABLELAYOUT,
	RELATIVELAYOUT;
	
	public static String getAndroidCorrespondence(COMPONENT_TYPE type) {
		
		switch(type) {
		
		case TEXTBOX:
			return "EditText";
		case BUTTON:
		case LABEL:
		case DROPDOWNLIST:
		case RADIOBUTTON:
		case RADIOBUTTONLIST:
		case SLIDER:
		case PROGRESSBAR:
		case CHECKBOX:
		case TOGGLE:
		
		//layouts
		case LINEARLAYOUT:
			return "LinearLayout";
		case ABSOLUTLAYOUT:
		case TABLELAYOUT:
		case RELATIVELAYOUT:
		
		
		
		case UNKNOWN:
		default:
			return null;
		}
		
	}
	
}
