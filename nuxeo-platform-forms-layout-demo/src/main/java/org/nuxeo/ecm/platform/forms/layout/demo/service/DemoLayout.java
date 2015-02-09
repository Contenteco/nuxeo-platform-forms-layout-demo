/*
 * (C) Copyright 2010 Nuxeo SA (http://nuxeo.com/) and contributors.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser General Public License
 * (LGPL) version 2.1 which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl.html
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * Contributors:
 *     Anahide Tchertchian
 */
package org.nuxeo.ecm.platform.forms.layout.demo.service;

import java.io.Serializable;

/**
 * Demo layout information
 *
 * @author Anahide Tchertchian
 */
public interface DemoLayout extends Serializable {

    String getName();

    String getSourcePath();

    boolean isListing();

    /**
     * @since 6.0
     */
    boolean isHideViewMode();

    /**
     * @since 7.2
     */
    boolean isHideEditMode();

    /**
     * @since 7.2
     */
    public boolean isAddForm();

    /**
     * @since 7.2
     */
    public boolean isUseAjaxForm();

}
