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
package org.nuxeo.ecm.platform.forms.layout.demo.descriptors;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.nuxeo.common.xmap.annotation.XNode;
import org.nuxeo.common.xmap.annotation.XNodeList;
import org.nuxeo.common.xmap.annotation.XObject;
import org.nuxeo.ecm.platform.forms.layout.demo.service.DemoLayout;
import org.nuxeo.ecm.platform.forms.layout.descriptors.PropertiesDescriptor;

/**
 * @author Anahide Tchertchian
 */
@XObject("widgetType")
public class DemoWidgetTypeDescriptor implements Serializable {

    private static final long serialVersionUID = 1L;

    @XNode("@name")
    protected String name;

    @XNode("label")
    protected String label;

    @XNode("viewId")
    protected String viewId;

    @XNode("category")
    protected String category;

    @XNode("widgetTypeCategory")
    protected String widgetTypeCategory;

    @XNode("preview@enabled")
    protected Boolean previewEnabled = Boolean.FALSE;

    @XNodeList(value = "preview/fields/field", type = ArrayList.class, componentType = String.class)
    protected List<String> fields;

    @XNode("preview/defaultProperties")
    protected PropertiesDescriptor defaultProperties;

    @XNodeList(value = "layouts/layout", type = ArrayList.class, componentType = DemoLayoutDescriptor.class)
    protected List<DemoLayoutDescriptor> demoLayouts;

    public String getName() {
        return name;
    }

    public String getLabel() {
        return label;
    }

    public String getViewId() {
        return viewId;
    }

    public String getCategory() {
        return category;
    }

    /**
     * @since 5.7.3
     */
    public String getWidgetTypeCategory() {
        return widgetTypeCategory;
    }

    public Boolean getPreviewEnabled() {
        return previewEnabled;
    }

    public List<String> getFields() {
        return fields;
    }

    public Map<String, Serializable> getDefaultProperties() {
        if (defaultProperties == null) {
            return null;
        }
        return defaultProperties.getProperties();
    }

    public List<DemoLayout> getDemoLayouts() {
        List<DemoLayout> res = new ArrayList<DemoLayout>();
        res.addAll(demoLayouts);
        return res;
    }

}
