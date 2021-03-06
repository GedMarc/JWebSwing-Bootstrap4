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
package com.jwebmp.plugins.bootstrap4.options;

import com.jwebmp.core.base.interfaces.ICssClassName;

/**
 * Defines any class that is registered as a bootstrap associated class
 *
 * @author GedMarc
 * @since 2016/10/10
 */
@FunctionalInterface
public interface IBSComponentOptions
		extends ICssClassName
{

	/**
	 * Replaces the text with its HTML class equivalent
	 *
	 * @return
	 */
	@Override
	String toString();

	/**
	 * Default name method for enumerations
	 *
	 * @return
	 */
	String name();
}
