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
package com.jwebmp.plugins.bootstrap4.options;

import com.jwebmp.core.utilities.StaticStrings;

import static com.jwebmp.core.utilities.StaticStrings.*;

/**
 * Width and height
 * <p>
 * Easily make an element as wide or as tall as its parent using the .w-100 and .h-100 utility classes.
 *
 * @author GedMarc
 * @version 1.0
 * @since 31 Dec 2016
 */
public enum BSContainerOptions
		implements IBSComponentOptions
{
	/**
	 * A default container
	 */
	Container,
	/**
	 * Container with the width at 100%
	 */
	Container_Fluid,
	/**
	 * A bs row
	 */
	Row,
	/**
	 * Removes all gutters from a component
	 */
	No_Gutters;

	@Override
	public String toString()
	{
		return name().toLowerCase()
		             .replace(StaticStrings.CHAR_UNDERSCORE, CHAR_DASH);
	}
}
