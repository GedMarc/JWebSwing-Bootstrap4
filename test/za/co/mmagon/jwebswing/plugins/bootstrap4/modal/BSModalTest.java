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
package za.co.mmagon.jwebswing.plugins.bootstrap4.modal;

import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.plugins.bootstrap4.buttons.styles.BSButtonSuccessOutline;
import za.co.mmagon.jwebswing.plugins.bootstrap4.modal.parts.BSModalBody;
import za.co.mmagon.jwebswing.plugins.bootstrap4.modal.parts.BSModalFooter;
import za.co.mmagon.jwebswing.plugins.bootstrap4.modal.parts.BSModalHeader;

/**
 * @author GedMarc
 */
public class BSModalTest
{

	public BSModalTest()
	{
	}

	@Test
	public void testSomeMethod()
	{
		BSModal<?> modal = new BSModal();

		BSModalHeader header = modal.addModalHeader(true);
		header.addTitle("This is the title");
		header.addDissmissIcon();

		BSModalBody body = modal.addModalBody();
		body.add("This ist he contente");

		BSModalFooter footer = new BSModalFooter();
		footer.add(new BSButtonSuccessOutline<>("Test Button Add"));
		footer.addDismissButton();

		//modal.getModalDialog();
		// modal.getModalHeader().add(new BSCloseIcon().setDataDismiss("modal"));
	/*	modal.asMe()
		     .addDismissButton(new BSCloseIcon());
		modal.asMe()
		     .setKeyboard(true);
		modal.asMe()
		     .setBackdrop(true);
		modal.asMe()
		     .setFocus(true);
		modal.asMe()
		     .setShow(false);*/
		System.out.println(modal.toString(true));
	}

}
