package com.jwebmp.plugins.bootstrap4.options;

import static com.guicedee.guicedinjection.json.StaticStrings.*;

/**
 * Colour settings for bootstrap 4 beta and up
 */
public enum BSBackgroundOptions
		implements IBSComponentOptions
{
	Bg_Primary,
	Bg_Secondary,
	Bg_Success,
	Bg_Warning,
	Bg_Danger,
	Bg_Info,
	Bg_Light,
	Bg_Dark,
	Bg_Transparent,
	Bg_Soft_Primary,
	Bg_Soft_Secondary,
	Shadow_Sm,
	Shadow,
	;

	@Override
	public String toString()
	{
		return name().toLowerCase()
		             .replace(CHAR_UNDERSCORE, CHAR_DASH);
	}
}
