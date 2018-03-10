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
package za.co.mmagon.jwebswing.plugins.bootstrap4.modal.events.shown;

import za.co.mmagon.jwebswing.Component;
import za.co.mmagon.jwebswing.Event;
import za.co.mmagon.jwebswing.base.ajax.AjaxCall;
import za.co.mmagon.jwebswing.base.ajax.AjaxResponse;
import za.co.mmagon.jwebswing.base.html.interfaces.events.GlobalEvents;
import za.co.mmagon.jwebswing.htmlbuilder.javascript.events.enumerations.EventTypes;
import za.co.mmagon.logger.LogFactory;

import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

import static za.co.mmagon.jwebswing.utilities.StaticStrings.STRING_ANGULAR_EVENT_START_SHORT;
import static za.co.mmagon.jwebswing.utilities.StaticStrings.STRING_CLOSING_BRACKET_SEMICOLON;

/**
 * Handles all events. Over-ride methods.
 *
 * @author Marc Magon
 */
public abstract class BSModalShownAdapter<J extends BSModalShownAdapter<J>>
		extends Event<J>
		implements GlobalEvents
{

	/**
	 * Logger for the Component
	 */
	private static final Logger LOG = LogFactory.getInstance()
	                                            .getLogger("BootstrapShownModal");
	private static final long serialVersionUID = 1L;
	private BSModalShownEventDirective directive;

	/**
	 * Performs a click
	 *
	 * @param component
	 * 		The component this click is going to be acting on
	 */
	public BSModalShownAdapter(Component component)
	{
		super(EventTypes.contextmenu, component);

	}

	@Override
	public void fireEvent(AjaxCall call, AjaxResponse response)
	{
		try
		{
			onModalShown(call, response);
		}
		catch (Exception e)
		{
			LOG.log(Level.SEVERE, "Error In Firing Event", e);
		}
	}

	/**
	 * Sets JQuery and Angular enabled, adds the directive to angular, and the attribute to the component
	 */
	@Override
	public void preConfigure()
	{
		if (!isConfigured())
		{

			getComponent().addAttribute("ng-shown-bootstrap-modal",
			                            STRING_ANGULAR_EVENT_START_SHORT + renderVariables() + STRING_CLOSING_BRACKET_SEMICOLON);
		}
		super.preConfigure();
	}

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(super.hashCode(), getDirective());
	}

	/**
	 * Returns the angular directive associated with the right click event
	 *
	 * @return
	 */
	public BSModalShownEventDirective getDirective()
	{
		if (directive == null)
		{
			directive = new BSModalShownEventDirective();
		}
		return directive;
	}

	/**
	 * Sets the right click angular event
	 *
	 * @param directive
	 */
	public void setDirective(BSModalShownEventDirective directive)
	{
		this.directive = directive;
	}

	/**
	 * Triggers on Click
	 * <p>
	 *
	 * @param call
	 * 		The physical AJAX call
	 * @param response
	 * 		The physical Ajax Receiver
	 */
	public abstract void onModalShown(AjaxCall call, AjaxResponse response);
}
