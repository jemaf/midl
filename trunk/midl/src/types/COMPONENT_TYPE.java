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
		
		//components
		case TEXTBOX:
			return "EditText";
		case BUTTON:
			return "Button";
		case LABEL:
			return "TextView";
		case DROPDOWNLIST:
			return "Spinner";
		case RADIOBUTTON:
			return "RadioButton";
		case RADIOBUTTONLIST:
			return "RadioGroup";
		case SLIDER:
			return "SeekBar";
		case PROGRESSBAR:
			return "ProgressBar";
		case CHECKBOX:
			return "CheckBox";
		case TOGGLE:
			return "ToggleButton";
		
		//layouts
		case LINEARLAYOUT:
			return "LinearLayout";
		case ABSOLUTLAYOUT:
			return "AbsolutLayout";
		case TABLELAYOUT:
			return "TableLayout";
		case RELATIVELAYOUT:
			return "RelativeLayout";
	
		case UNKNOWN:
		default:
			return null;
		}
	}
}
