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
package com.jwebmp.plugins.bootstrap4.breadcrumbs;

import com.jwebmp.core.base.html.List;

import java.util.ArrayList;

/**
 * Breadcrumb
 * <p>
 * Indicate the current page’s location within a navigational hierarchy. Separators are automatically added in CSS through ::before and
 * content.
 * <p>
 *
 * @author Marc Magon
 * @version 1.0
 * @since 29 Aug 2015
 */

class BSBreadcrumbContainer<J extends BSBreadcrumbContainer<J>>
		extends List<BSBreadcrumbsChildren, BSBreadcrumbsAttributes, BSBreadcrumbsEvents, J>
{

	private static final long serialVersionUID = 1L;

	/**
	 * Breadcrumbs
	 * <p>
	 * Indicate the current page’s location within a navigational hierarchy. Separators are automatically added in CSS through ::before and
	 * content.
	 */
	@SuppressWarnings("")
	public BSBreadcrumbContainer()
	{
		super(true);
		addClass(BSComponentBreadcrumbOptions.Breadcrumb);
	}

	@Override
	public void preConfigure()
	{
		if (!isConfigured())
		{
			getChildren().forEach(next -> next.removeClass(BSComponentBreadcrumbOptions.Active));
			new ArrayList<>(getChildren()).get(getChildren().size() - 1)
			                              .addClass(BSComponentBreadcrumbOptions.Active);
		}
		super.preConfigure();
	}

	@Override
	public boolean equals(Object obj)
	{
		return super.equals(obj);
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}
}
