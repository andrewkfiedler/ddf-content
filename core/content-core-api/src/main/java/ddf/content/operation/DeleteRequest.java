/**
 * Copyright (c) Codice Foundation
 * 
 * This is free software: you can redistribute it and/or modify it under the terms of the GNU Lesser
 * General Public License as published by the Free Software Foundation, either version 3 of the
 * License, or any later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details. A copy of the GNU Lesser General Public License
 * is distributed along with this program and can be found at
 * <http://www.gnu.org/licenses/lgpl.html>.
 * 
 **/
package ddf.content.operation;

import ddf.content.ContentFramework;
import ddf.content.data.ContentItem;

/**
 * Defines a Delete Request object which can be sent to the {@link ContentFramework#delete
 * ContentFramework.delete}
 * 
 * @author Hugh Rodgers, Lockheed Martin
 * @author ddf.isgs@lmco.com
 */
public interface DeleteRequest extends Request {

    /**
     * Gets the GUID associated with the {@link ContentItem} to be deleted.
     * 
     * @return the item's ID
     */
    // public String getId();

    /**
     * Gets the {@link ContentItem} to be deleted.
     * 
     * @return the {@link ContentItem}
     */
    public ContentItem getContentItem();
}
