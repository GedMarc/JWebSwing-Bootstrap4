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
package com.jwebmp.plugins.bootstrap4.alerts;

import com.jwebmp.core.base.html.attributes.ButtonAttributes;
import com.jwebmp.plugins.bootstrap4.close.BSCloseIcon;
import com.jwebmp.plugins.bootstrap4.options.BSDefaultOptions;

/**
 * Dismissing
 * <p>
 * Using the alert JavaScript plugin, it’s possible to dismiss any alert inline. Here’s how:
 * <p>
 * Be sure you’ve loaded the alert plugin, or the compiled Bootstrap JavaScript.
 * <p>
 * Add a dismiss button and the .alert-dismissible class, which adds extra padding to the right of the alert and positions the .close
 * button.
 * <p>
 * On the dismiss button, add the data-dismiss="alert" attribute, which triggers the JavaScript functionality.
 * <p>
 * Be sure to use the button element with it for proper behavior across all devices.
 * <p>
 * To animate alerts when dismissing them, be sure to add the .fade and .in classes.
 *
 * @author GedMarc
 * @version 1.0
 * @since 31 Dec 2016
 */
public class BSAlertDismissButton<J extends BSAlertDismissButton<J>>
		extends BSCloseIcon<J>
{

	private static final long serialVersionUID = 1L;

	/**
	 * Constructs and adds a dismiss button to the alert
	 *
	 * @param alert
	 * @param fade
	 */
	@SuppressWarnings("unchecked")
	public BSAlertDismissButton(BSAlert alert, boolean fade)
	{
		addAttribute(ButtonAttributes.Data_Dismiss, BSAlertOptions.Alert);
		alert.addClass(BSAlertOptions.Alert_Dismissible);
		if (fade)
		{
			alert.addClass(BSDefaultOptions.Fade);
			alert.addClass(BSDefaultOptions.Show);
		}
		alert.add(this);
	}
}
