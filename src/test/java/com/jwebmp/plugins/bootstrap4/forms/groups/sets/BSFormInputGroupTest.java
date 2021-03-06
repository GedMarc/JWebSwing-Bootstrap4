package com.jwebmp.plugins.bootstrap4.forms.groups.sets;

import com.jwebmp.core.base.html.inputs.InputCheckBoxType;
import com.jwebmp.plugins.bootstrap4.buttons.checkbox.BSCheckBox;
import com.jwebmp.plugins.bootstrap4.dropdown.BSDropDown;
import com.jwebmp.plugins.bootstrap4.forms.BSForm;
import org.junit.jupiter.api.Test;

class BSFormInputGroupTest

{

	@Test
	void getInputGroupAddons()
	{
		BSForm<?> form = new BSForm<>();
		form.createTextInput("Binding", "Label", true)
		    .append("Appending")
		    .prepend("Prepending");

		System.out.println(form.toString(0));

		form.createTextInput("checkbox", "label", true)
		    .append(new BSCheckBox<>().setInput(new InputCheckBoxType<>()));

		form.createTextInput("dropdowns?", "dropdowns", true)
		    .prepend(new BSDropDown<>().addDropDownButton());

		System.out.println(form.toString(0));

	}
}
