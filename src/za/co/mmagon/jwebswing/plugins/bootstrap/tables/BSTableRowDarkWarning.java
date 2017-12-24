package za.co.mmagon.jwebswing.plugins.bootstrap.tables;

import za.co.mmagon.jwebswing.plugins.bootstrap.options.BSBackgroundOptions;

/**
 * A pre-defined row context
 *
 * @param <J>
 */
public abstract class BSTableRowDarkWarning<J extends BSTableRowDarkWarning<J>> extends BSTableRow<J>
{
	/**
	 * Creates a table row class with the given context
	 *
	 * @param tableRowClass
	 */
	public BSTableRowDarkWarning()
	{
		super(BSBackgroundOptions.Bg_Warning);
	}
}
