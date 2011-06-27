package parser;

import java.util.ArrayList;
import java.util.Stack;

import components.Button;
import components.CheckBox;
import components.Component;
import components.DropDownList;
import components.Label;
import components.LinearLayout;
import components.ProgressBar;
import components.RadioButton;
import components.RadioButtonList;
import components.RelativeLayout;
import components.Slider;
import components.TableLayout;
import components.TextBox;
import components.Toggle;

public class Parser {

	private ArrayList<Component> components;
	private int step; // numero que varia de 1 a 3, onde
						// 1 = DECLARE
						// 2 = DEFINE
						// 3 = DISPOSE
						// 0 = indefinido
	private int lastTab;

	private ArrayList<String> fathers;

	public Component fatherComponent;

	public Parser() {
		components = new ArrayList<Component>();
		fathers = new ArrayList<String>();
		step = 0;
		lastTab = 0;
	}

	public void parseLine(String line) {

		if (line.contains("DECLARE:"))
			step = 1;
		else if (line.contains("DEFINE:"))
			step = 2;
		else if (line.contains("DISPOSE:"))
			step = 3;
		else {
			switch (step) {

			case 1:
				line = line.trim();
				addComponent(line);
				break;

			case 2:
				line = line.trim();
				defineProperty(line);
				break;

			case 3:
				alignComponent(line);
				break;

			case 0:
				break;

			default:
				break;

			}
		}
	}

	private void alignComponent(String line) {

		String tokens[] = line.split("\t");
		int thisTab = tokens.length - 1;

		int index = this.components.indexOf(new Component(tokens[thisTab]) {

			@Override
			public String parse2iOS() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public String parse2WindowsPhone() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public String parse2BlackBerry() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void addSubComponent(Component c) {
				// TODO Auto-generated method stub

			}
		});
		Component atual = this.components.get(index);

		String compId = tokens[thisTab];
		fathers.add(thisTab, compId);

		if (thisTab == 0)
			this.fatherComponent = atual;
		else {

			int indexFather = this.components.indexOf(new Component(fathers.get(thisTab-1)) {
				
				@Override
				public String parse2iOS() {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public String parse2WindowsPhone() {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public String parse2BlackBerry() {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public void addSubComponent(Component c) {
					// TODO Auto-generated method stub
					
				}
			});
			Component temp = this.components.get(indexFather);

			temp.addSubComponent(atual);
		}
	}

	private void defineProperty(String line) {
		String tokens[] = line.split("=");
		String value = tokens[1].trim();

		String temp[] = tokens[0].trim().split("\\.");
		String id = temp[0].trim();
		String prop = temp[1].trim();

		int index = this.components.indexOf(new Component(id) {

			@Override
			public String parse2iOS() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public String parse2WindowsPhone() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public String parse2BlackBerry() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Component getSubComponent(String id) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void addSubComponent(Component c) {
				// TODO Auto-generated method stub

			}
		});

		Component component = this.components.get(index);

		if (component instanceof TextBox)
			((TextBox) component).setTextBoxComponent(prop, value);
		else if (component instanceof Button)
			((Button) component).setButtonComponent(prop, value);
		else if (component instanceof CheckBox)
			((CheckBox) component).setCheckBoxComponent(prop, value);
		else if (component instanceof DropDownList)
			((DropDownList) component).setDropDownListComponent(prop, value);
		else if (component instanceof Label)
			((Label) component).setLabelComponent(prop, value);
		else if (component instanceof LinearLayout)
			((LinearLayout) component).setLinearLayoutComponent(prop, value);
		else if (component instanceof ProgressBar)
			((ProgressBar) component).setProgressBarComponent(prop, value);
		else if (component instanceof RadioButton)
			((RadioButton) component).setRadioButtonComponent(prop, value);
		else if (component instanceof RadioButtonList)
			((RadioButtonList) component).setRadioButtonListComponent(prop, value);
		else if (component instanceof RelativeLayout)
			((RelativeLayout) component).setRelativeLayoutComponent(prop, value);
		else if (component instanceof Slider)
			((Slider) component).setSliderComponent(prop, value);
		else if (component instanceof TableLayout)
			((TableLayout) component).setTableLayoutComponent(prop, value);
		else if (component instanceof Toggle)
			((Toggle) component).setToggleComponent(prop, value);

	}

	private void addComponent(String line) {

		String tokens[] = line.split(" ");

		if (tokens[0].equals(Button.class.getSimpleName()))
			this.components.add(new Button(tokens[1]));
		else if (tokens[0].equals(CheckBox.class.getSimpleName()))
			this.components.add(new CheckBox(tokens[1]));
		else if (tokens[0].equals(DropDownList.class.getSimpleName()))
			this.components.add(new DropDownList(tokens[1]));
		else if (tokens[0].equals(Label.class.getSimpleName()))
			this.components.add(new Label(tokens[1]));
		else if (tokens[0].equals(LinearLayout.class.getSimpleName()))
			this.components.add(new LinearLayout(tokens[1]));
		else if (tokens[0].equals(ProgressBar.class.getSimpleName()))
			this.components.add(new ProgressBar(tokens[1]));
		else if (tokens[0].equals(RadioButton.class.getSimpleName()))
			this.components.add(new RadioButton(tokens[1]));
		else if (tokens[0].equals(RadioButtonList.class.getSimpleName()))
			this.components.add(new RadioButtonList(tokens[1]));
		else if (tokens[0].equals(Slider.class.getSimpleName()))
			this.components.add(new Slider(tokens[1]));
		else if (tokens[0].equals(TableLayout.class.getSimpleName()))
			this.components.add(new TableLayout(tokens[1]));
		else if (tokens[0].equals(TextBox.class.getSimpleName()))
			this.components.add(new TextBox(tokens[1]));
		else if (tokens[0].equals(Toggle.class.getSimpleName()))
			this.components.add(new Toggle(tokens[1]));
	}

	public void printFatherComponent() throws Exception {
		this.fatherComponent.printComponent();
	}

}
