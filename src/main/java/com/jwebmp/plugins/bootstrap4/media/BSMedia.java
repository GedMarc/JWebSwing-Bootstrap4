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
package com.jwebmp.plugins.bootstrap4.media;

import com.jwebmp.core.Component;
import com.jwebmp.core.base.html.*;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.bootstrap4.options.BSSpacingOptions;

import java.util.Objects;

import static com.jwebmp.core.utilities.StaticStrings.*;

/**
 * Media object
 * <p>
 * The media object is an abstract element used as the basis for building more complex and repetitive components (like blog comments,
 * Tweets, etc).
 * <p>
 * Included is support for left and right aligned content, content alignment options, nesting, and more.
 *
 * @param <J>
 *
 * @author Marc Magon
 * @version 1.0
 * @since 29 Aug 2015
 */
@ComponentInformation(name = "Bootstrap Media",
		description = "The media object helps build complex and repetitive components where some media is positioned alongside content " +
		              "that doesn’t wrap around said media. Plus, it does this with only two required classes thanks to flexbox.",
		url = "https://v4-alpha.getbootstrap.com/layout/media-object/",
		wikiUrl = "https://github.com/GedMarc/JWebSwing-BootstrapPlugin/wiki")
public class BSMedia<J extends BSMedia<J>>
		extends Div<BSMediaChildren, BSMediaAttributes, GlobalFeatures, BSMediaEvents, J>
		implements IBSMedia
{

	private static final long serialVersionUID = 1L;
	/**
	 * The media image
	 */
	private Image mediaImage;
	/**
	 * The link for the media object
	 */
	private Link mediaLink;
	/**
	 * The body for the media object
	 */
	private Div mediaBody;
	/**
	 * The header for the media object
	 */
	private HeaderText mediaHeader;
	/**
	 * The media object being displayed (usually image or something)
	 */
	private Component mediaComponent;

	/**
	 * The media object is an abstract element used as the basis for building more complex and repetitive components (like blog comments,
	 * Tweets, etc).
	 * <p>
	 * Included is support for left and right aligned content, content alignment options, nesting, and more.
	 */
	public BSMedia()
	{
		addClass(BSComponentMediaOptions.Media);

	}

	/**
	 * Returns the body portion of this media object
	 *
	 * @return
	 */
	@Override
	public Div getMediaBody()
	{
		if (mediaBody == null)
		{
			setMediaBody(new Div());
		}
		return mediaBody;
	}

	/**
	 * Sets the media body and adds it to this object
	 *
	 * @param mediaBody
	 *
	 * @return
	 */
	@Override
	public BSMedia setMediaBody(Div mediaBody)
	{
		if (this.mediaBody != null)
		{
			getChildren().remove(this.mediaBody);
			this.mediaBody = null;
		}
		this.mediaBody = mediaBody;
		if (this.mediaBody != null)
		{
			this.mediaBody.addClass(BSComponentMediaOptions.Media_Body);
		}
		getChildren().add(mediaBody);
		return this;
	}

	/**
	 * Returns the component displayed inside the link that is used for display
	 *
	 * @return
	 */
	@Override
	public Component getMediaComponent()
	{
		if (mediaComponent == null)
		{
			setMediaComponent(new Div());
		}
		return mediaComponent;
	}

	/**
	 * Returns a new H4 header
	 *
	 * @return
	 */
	@Override
	public HeaderText getMediaHeader()
	{
		if (mediaHeader == null)
		{
			setMediaHeader(new H4(""));
		}
		return mediaHeader;
	}

	/**
	 * Returns the associated media link, never null
	 *
	 * @return
	 */
	@Override
	public Link getMediaLink()
	{
		if (mediaLink == null)
		{
			setMediaLink(new Link(STRING_HASH), true);
		}
		return mediaLink;
	}

	/**
	 * Sets the media link
	 *
	 * @param mediaLink
	 */
	@SuppressWarnings("unchecked")
	public J setMediaLink(Link mediaLink)
	{
		this.mediaLink = mediaLink;
		return (J) this;
	}

	/**
	 * Sets the header to the required object
	 *
	 * @param mediaHeader
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	public J setMediaHeader(HeaderText mediaHeader)
	{
		if (this.mediaHeader != null)
		{
			getMediaBody().remove(this.mediaHeader);
			this.mediaHeader = null;
		}
		this.mediaHeader = mediaHeader;
		if (this.mediaHeader != null)
		{
			this.mediaHeader.addClass(BSComponentMediaOptions.Media_Heading);
			this.mediaHeader.addClass(BSSpacingOptions.Margin_Top_1);
			getMediaBody().add(this.mediaHeader);
		}
		return (J) this;
	}

	/**
	 * Sets the media link, and moves the media object into the new link if necessary
	 *
	 * @param mediaLink
	 * @param left
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	public J setMediaLink(Link mediaLink, boolean left)
	{
		if (this.mediaLink != null)
		{
			mediaLink.add(getMediaComponent());
			getChildren().remove(this.mediaLink);
			this.mediaLink = null;
		}
		this.mediaLink = mediaLink;
		if (this.mediaLink != null)
		{
			if (left)
			{
				this.mediaLink.addClass(BSComponentMediaOptions.Media_Left);
			}
			else
			{
				this.mediaLink.addClass(BSComponentMediaOptions.Media_Right);
			}
			getChildren().add(this.mediaLink);
		}
		return (J) this;
	}

	/**
	 * Sets the component displayed to the left or right (set that in the link)
	 *
	 * @param mediaComponent
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	public J setMediaComponent(Component mediaComponent)
	{
		if (this.mediaComponent != null)
		{
			getMediaLink().remove(this.mediaComponent);
			this.mediaComponent = null;
		}
		this.mediaComponent = mediaComponent;
		if (this.mediaComponent != null)
		{
			this.mediaComponent.addClass(BSComponentMediaOptions.Media_Object);
			getMediaLink().add(this.mediaComponent);
		}
		return (J) this;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof BSMedia))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}
		BSMedia<?> bsMedia = (BSMedia<?>) o;
		return Objects.equals(getMediaLink(), bsMedia.getMediaLink()) &&
		       Objects.equals(getMediaBody(), bsMedia.getMediaBody()) &&
		       Objects.equals(getMediaHeader(),
		                      bsMedia.getMediaHeader()) &&
		       Objects.equals(
				       getMediaComponent(), bsMedia.getMediaComponent());
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(super.hashCode(), getMediaLink(), getMediaBody(), getMediaHeader(), getMediaComponent());
	}

	/**
	 * Gets the media image
	 *
	 * @return
	 */
	public Image getMediaImage()
	{
		return mediaImage;
	}

	/**
	 * Sets the media image
	 *
	 * @param mediaImage
	 */
	@SuppressWarnings("unchecked")
	public J setMediaImage(Image mediaImage)
	{
		this.mediaImage = mediaImage;
		if (mediaImage != null)
		{
			mediaImage.addClass(BSSpacingOptions.Margin_Right_3);
			getChildren().add(mediaImage);
		}
		return (J) this;
	}
}
