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
package za.co.mmagon.jwebswing.plugins.bootstrap.navbar;

import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.base.html.Image;
import za.co.mmagon.jwebswing.plugins.bootstrap.forms.BSFormInline;
import za.co.mmagon.jwebswing.plugins.bootstrap.navbar.brand.BSNavBarBrandImage;
import za.co.mmagon.jwebswing.plugins.bootstrap.navbar.toggler.BSNavBarToggler;
import za.co.mmagon.jwebswing.plugins.bootstrap.navbar.toggler.BSNavBarTogglerAlignments;
import za.co.mmagon.jwebswing.plugins.bootstrap.navbar.toggler.BSNavBarTogglerSizes;
import za.co.mmagon.jwebswing.plugins.bootstrap.navs.BSNavItemDropDown;
import za.co.mmagon.jwebswing.plugins.bootstrap.navs.BSNavLinkItem;
import za.co.mmagon.jwebswing.plugins.bootstrap.navs.BSNavs;

import static za.co.mmagon.jwebswing.utilities.StaticStrings.STRING_HASH;

/**
 * @author GedMarc
 */
public class BSNavBarTest
{

	public BSNavBarTest()
	{
	}

	@Test
	public void testSomeMethod()
	{
		BSNavBar nav = new BSNavBar(BSNavBarTogglerSizes.Navbar_Toggleable_MD, BSNavBarColourSchemes.Navbar_Light, BSNavBarColourSchemes.BG_Faded).setPositioning(BSNavBarPositioning.Fixed_Top);

		BSNavBarToggler toggle = new BSNavBarToggler(BSNavBarTogglerAlignments.Navbar_Toggler_Right);
		nav.add(toggle);
		nav.add(new BSNavBarBrandImage(new Image("image")));

		BSNavs navs = new BSNavs();
		navs.add(new BSNavItemDropDown());
		navs.add(new BSNavLinkItem(STRING_HASH));

		navs.add(new BSFormInline());

		nav.add(toggle.createCollapsingDiv(navs));

		System.out.println(nav.toString(true));
	}

}
