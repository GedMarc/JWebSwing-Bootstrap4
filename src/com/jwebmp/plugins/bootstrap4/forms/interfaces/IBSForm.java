/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.jwebmp.plugins.bootstrap4.forms.interfaces;

import com.jwebmp.base.html.inputs.*;
import com.jwebmp.base.interfaces.ICssStructure;
import com.jwebmp.plugins.bootstrap4.buttons.BSButton;
import com.jwebmp.plugins.bootstrap4.buttons.BSButtonOptions;
import com.jwebmp.plugins.bootstrap4.buttons.BSButtonSizeOptions;
import com.jwebmp.plugins.bootstrap4.forms.BSForm;
import com.jwebmp.plugins.bootstrap4.forms.groups.BSFormGroup;
import com.jwebmp.plugins.bootstrap4.forms.groups.sets.BSFormCheckGroup;
import com.jwebmp.plugins.bootstrap4.forms.groups.sets.BSFormInputGroup;
import com.jwebmp.plugins.bootstrap4.forms.groups.sets.BSFormRadioGroup;
import com.jwebmp.plugins.bootstrap4.options.BSAlignmentVerticalOptions;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

public interface IBSForm<J extends BSForm<J>>
		extends ICssStructure<J>
{
	BSFormGroup<?, InputTextType<?>> addTextInput(String binding, String label);

	BSFormInputGroup<?, InputTextType<?>> addTextInput(String binding, String label, boolean inputGroup);

	BSFormInputGroup<?, InputPasswordType<?>> addPasswordInput(String binding, String label, boolean inputGroup);

	BSFormGroup<?, InputTextAreaType<?>> addTextArea(String binding, String label);

	BSFormInputGroup<?, InputTextAreaType<?>> addTextArea(String binding, String label, boolean inputGroup);

	BSFormGroup<?, InputEmailType<?>> addEmailInput(String binding, String label);

	BSFormInputGroup<?, InputEmailType<?>> addEmailInput(String binding, String label, boolean inputGroup);

	BSFormGroup<?, InputSelectType<?>> addSelectDropdown(String binding, String label, boolean multiple, boolean styled, @Nullable Boolean largeOrSmall);

	BSFormGroup<?, InputSelectType<?>> addSelectDropdown(String binding, String label);

	BSFormInputGroup<?, InputSelectType<?>> addSelectDropdown(String binding, String label, boolean inputGroup);

	BSFormCheckGroup<?> addCheckboxInput(String binding, String label);

	BSFormRadioGroup<?> addRadioInput(String binding, String label, String groupName);

	@SuppressWarnings("")
	BSFormInputGroup<?, InputFileType<?>> addFileInput(String binding, String label, boolean styled, boolean inputGroup);

	BSFormGroup<?, InputFileType<?>> addFileInput(String binding, String label, boolean styled);

	@SuppressWarnings("unchecked")
	@NotNull
	J setInline(boolean inline);

	/**
	 * Returns a new form row inside of this form
	 *
	 * @return
	 */
	BSForm<?> addFormRow();

	/**
	 * Returns a new form row inside of this form
	 * and adds an attribute setting disabled if true
	 *
	 * @return
	 */
	BSForm<?> addFieldSet(boolean disabled);

	/**
	 * Auto-sizing
	 * The example below uses a flexbox utility to vertically center the contents and changes .col to .col-auto so that your columns only
	 * take up as much space as needed. Put another way, the column sizes itself based on the contents.
	 *
	 * @param horizontalLayout
	 * 		The horinzal layout although its the vertical collection
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setAlignment(BSAlignmentVerticalOptions horizontalLayout);

	/**
	 * Configures a component as the submit button for this component
	 *
	 * @return
	 */
	@NotNull
	BSButton<?> addSubmitButton();

	/**
	 * Configures a component as the submit button for this component
	 *
	 * @return
	 */
	@NotNull
	BSButton<?> addSubmitButton(BSButtonOptions options, BSButtonSizeOptions sizes);

	/**
	 * Instructs to add the styling options to input fields
	 *
	 * @param styleInput
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setStyleInput(boolean styleInput);
}