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
package com.jwebmp.plugins.bootstrap4.buttons.groups.options;

import com.jwebmp.core.utilities.StaticStrings;
import com.jwebmp.plugins.bootstrap4.options.IBSComponentOptions;

import static com.jwebmp.core.utilities.StaticStrings.*;

/**
 * Button group
 * <p>
 * Group a series of buttons together on a single line with the button group. Add on optional JavaScript radio and checkbox style behavior
 * with our buttons plugin.
 *
 * @author GedMarc
 * @version 1.0
 * @since 01 Jan 2017
 */
public enum BSButtonGroupSizeOptions
		implements IBSComponentOptions
{
	/**
	 * Make all buttons below large
	 */
	Btn_Group_Lg,
	/**
	 * Make all buttons below small
	 */
	Btn_Group_Sm,
	;

	@Override
	public String toString()
	{
		return name().toLowerCase()
		             .replace(StaticStrings.CHAR_UNDERSCORE, CHAR_DASH);
	}
}