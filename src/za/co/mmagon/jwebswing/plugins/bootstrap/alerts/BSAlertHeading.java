package za.co.mmagon.jwebswing.plugins.bootstrap.alerts;

import za.co.mmagon.jwebswing.base.html.H4;

public class BSAlertHeading<J extends BSAlertHeading<J>> extends H4<J>
{
	/**
	 * Adds a new alert heading
	 */
	public BSAlertHeading()
	{
		addClass(BSAlertOptions.Alert_Heading);
	}

	/**
	 * Sets the alert heading
	 *
	 * @param text
	 */
	public BSAlertHeading(String text)
	{
		super(text);
	}
}
