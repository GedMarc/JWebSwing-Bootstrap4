/*
 * Copyright (C) 2017 GedMarc
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
package com.jwebmp.plugins.bootstrap4.dropdown;

import com.jwebmp.core.base.ComponentHierarchyBase;
import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.Link;
import com.jwebmp.core.base.html.attributes.GlobalAttributes;
import com.jwebmp.core.base.html.attributes.LinkAttributes;
import com.jwebmp.core.base.html.interfaces.GlobalChildren;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.bootstrap4.buttons.BSButtonAttributes;
import com.jwebmp.plugins.bootstrap4.buttons.BSButtonOptions;
import com.jwebmp.plugins.bootstrap4.buttons.BSButtonSizeOptions;
import com.jwebmp.plugins.bootstrap4.dropdown.interfaces.BSDropDownChildren;
import com.jwebmp.plugins.bootstrap4.dropdown.interfaces.BSDropDownEvents;
import com.jwebmp.plugins.bootstrap4.dropdown.interfaces.IBSDropDown;
import com.jwebmp.plugins.bootstrap4.dropdown.options.BSDropDownOptions;
import com.jwebmp.plugins.bootstrap4.dropdown.parts.BSDropDownButton;
import com.jwebmp.plugins.bootstrap4.dropdown.parts.BSDropDownLink;
import com.jwebmp.plugins.bootstrap4.dropdown.parts.BSDropDownMenu;
import com.jwebmp.plugins.bootstrap4.navs.interfaces.BSNavsChildren;

import static com.jwebmp.core.base.html.attributes.LinkAttributes.Data_Toggle;
import static com.jwebmp.plugins.bootstrap4.dropdown.options.BSDropDownOptions.Dropdown_Toggle;

/**
 * Dropdowns
 * <p>
 * Dropdowns are toggleable, contextual overlays for displaying lists of links and more. They’re made interactive with the included
 * Bootstrap dropdown JavaScript plugin. They’re toggled by clicking,
 * not by hovering; this is an intentional design decision.
 * <p>
 *
 * @param <J>
 *
 * @author GedMarc
 * @version 1.0
 * @since 13 Jan 2017
 */
@ComponentInformation(name = "Bootstrap Dropdown",
		description = "Dropdowns are toggleable, contextual overlays for displaying lists of links and more. They’re made interactive " +
		              "with" +
		              " the included Bootstrap dropdown JavaScript plugin. They’re toggled by clicking, not by hovering;" +
		              "  this  is an intentional design  decision.",
		url = "https://v4-alpha.getbootstrap.com/components/dropdowns/",
		wikiUrl = "https://github.com/GedMarc/JWebMP-BootstrapPlugin/wiki")
public class BSDropDown<J extends BSDropDown<J>>
		extends Div<BSDropDownChildren, BSDropDownAttributes, GlobalFeatures, BSDropDownEvents, J>
		implements IBSDropDown<J>, BSNavsChildren
{
	/**
	 * Construct a new bootstrap drop down
	 */
	public BSDropDown()
	{
		addClass(BSDropDownOptions.Dropdown);
	}

	/**
	 * A slimmer view of this class
	 *
	 * @return
	 */
	public IBSDropDown<J> asMe()
	{
		return this;
	}

	/**
	 * adds a default drop down button
	 *
	 * @return
	 */
	@Override
	public BSDropDownButton<?> addDropDownButton()
	{
		BSDropDownButton<?> button = new BSDropDownButton<>();
		add(button);
		return button;
	}

	@Override
	public BSDropDownButton<?> addDropDownButton(BSButtonOptions buttonOptions)
	{
		return addDropDownButton(buttonOptions, null);
	}

	/**
	 * Adds the drop down button to the drop down (add before menu)
	 *
	 * @param buttonOptions
	 *
	 * @return
	 */
	@Override
	public BSDropDownButton<?> addDropDownButton(BSButtonOptions buttonOptions, BSButtonSizeOptions sizeOptions)
	{
		BSDropDownButton<?> button = new BSDropDownButton<>();
		button.addClass(buttonOptions);
		if (sizeOptions != null)
		{
			button.addClass(sizeOptions);
			removeClass(BSDropDownOptions.Dropdown);
			addClass(BSButtonOptions.Btn_Group);
		}
		add(button);
		return button;
	}

	/**
	 * Adds the drop down button to the drop down (add before menu)
	 *
	 *
	 * @return
	 */
	@Override
	public Link<?> addDropDownLink()
	{
		BSDropDownLink<?> button = new BSDropDownLink<>("javascript: void(0);");
		button.addClass("dropdown");
		button.addAttribute(Data_Toggle, "dropdown");
		button.addAttribute(GlobalAttributes.Aria_HasPopup, "false");
		button.addAttribute(GlobalAttributes.Aria_Expanded, "false");
		button.addClass(Dropdown_Toggle);
		button.addAttribute(BSButtonAttributes.Role.toString(), "button");
		add(button);
		return button;
	}

	/**
	 * Adds the menu to the drop down (call after button)
	 *
	 * @return
	 */
	@Override
	public BSDropDownMenu<?> addDropDownMenu()
	{
		BSDropDownMenu<?> menu = new BSDropDownMenu<>();
		add(menu);
		return menu;
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}
}
