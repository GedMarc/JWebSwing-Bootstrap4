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
package com.jwebmp.plugins.bootstrap4;

import com.jwebmp.BaseTestClass;
import com.jwebmp.Page;
import com.jwebmp.base.angular.AngularPageConfigurator;

/**
 * @author GedMarc
 */
public class BootstrapPageConfiguratorTest
		extends BaseTestClass
{
	public BootstrapPageConfiguratorTest()
	{
	}

	@org.junit.jupiter.api.Test
	public void testPageConfigurationBS4()
	{
		Page p = getInstance();
		AngularPageConfigurator.setRequired(true);
		BootstrapPageConfigurator bpc = new BootstrapPageConfigurator();
		bpc.configure(p);
		System.out.println(p.toString(true));
	}
}