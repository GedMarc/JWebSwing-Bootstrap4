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
package com.jwebmp.plugins.bootstrap4.carousel.features;

import com.jwebmp.core.Feature;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.plugins.bootstrap4.carousel.BSCarousel;
import com.jwebmp.plugins.bootstrap4.carousel.BSCarouselFeatures;
import com.jwebmp.plugins.bootstrap4.carousel.options.BSCarouselOptions;

/**
 * Cycles to the previous item.
 *
 * @author MMagon
 * @version 1.0
 * @since 2013/01/16
 */
public class BSCarouselPreviousFeature<J extends BSCarouselPreviousFeature<J>>
		extends Feature<BSCarouselOptions, J>
		implements BSCarouselFeatures, GlobalFeatures
{

	private static final long serialVersionUID = 1L;
	/**
	 * The method name to call
	 */
	private static final String methodName = "prev";

	/**
	 * Cycles to the previous item.
	 * <p>
	 *
	 * @param forComponent
	 */
	public BSCarouselPreviousFeature(BSCarousel forComponent)
	{
		super("BSCarouselPreviousFeature");
		setComponent(forComponent);
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

	@Override
	public void assignFunctionsToComponent()
	{
		String requiredString = getComponent().getJQueryID() + "carousel('";
		requiredString += methodName;
		requiredString += "');" + getNewLine();
		addQuery(requiredString);
	}
}