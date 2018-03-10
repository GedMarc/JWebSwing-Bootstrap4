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
package za.co.mmagon.jwebswing.plugins.bootstrap4.containers;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.base.html.attributes.NoAttributes;
import za.co.mmagon.jwebswing.base.html.interfaces.GlobalChildren;
import za.co.mmagon.jwebswing.base.html.interfaces.GlobalFeatures;
import za.co.mmagon.jwebswing.base.html.interfaces.events.GlobalEvents;
import za.co.mmagon.jwebswing.plugins.bootstrap4.forms.BSFormChildren;
import za.co.mmagon.jwebswing.plugins.bootstrap4.forms.groups.BSFormGroupChildren;
import za.co.mmagon.jwebswing.plugins.bootstrap4.navbar.interfaces.BSNavBarChildren;
import za.co.mmagon.jwebswing.plugins.bootstrap4.options.BSContainerOptions;

import static za.co.mmagon.jwebswing.plugins.bootstrap4.options.BSContainerOptions.Container_Fluid;

/**
 * Containers
 * <p>
 * Containers are the most basic layout element in Bootstrap and are required when using our grid system. Choose from a responsive,
 * fixed-width container (meaning its max-width changes at each
 * breakpoint) or fluid-width (meaning it’s 100% wide all the time).
 * <p>
 * While containers can be nested, most layouts do not require a nested container.
 *
 * @param <J>
 *
 * @author GedMarc
 * @version 1.0
 * @since Oct 11, 2016
 */
public class BSContainer<J extends BSContainer<J>>
		extends Div<GlobalChildren, NoAttributes, GlobalFeatures, GlobalEvents, J>
		implements BSNavBarChildren, BSFormChildren, BSFormGroupChildren
{

	private static final long serialVersionUID = 1L;

	/**
	 * Constructs as a container-fluid full page
	 */
	public BSContainer()
	{
		this(Container_Fluid);
	}

	/**
	 * Constructs a new container
	 *
	 * @param type
	 */
	public BSContainer(BSContainerOptions type)
	{
		addClass(type.toString());
	}

	/**
	 * Returns a new instance
	 *
	 * @param type
	 * 		The type of container.
	 *
	 * @return
	 */
	public static BSContainer newInstance(BSContainerOptions type)
	{
		return new BSContainer(type);
	}

	/**
	 * Sets the container type on this container
	 *
	 * @param type
	 */
	public void setContainerType(BSContainerOptions type)
	{
		for (BSContainerOptions value : BSContainerOptions.values())
		{
			removeClass(value.toString());
		}
		addClass(type.toString());
	}
}
