
package com.kendoui.taglib.datasource;

import com.kendoui.taglib.BaseTag;

import javax.servlet.jsp.JspException;

@SuppressWarnings("serial")
public class UpdateTag extends BaseTag /* interfaces *//* interfaces */ {
    
    @Override
    public int doEndTag() throws JspException {
//>> doEndTag

        Update parent = (Update)findParentWithClass(Update.class);

        parent.setUpdate(this);

//<< doEndTag

        return super.doEndTag();
    }

    @Override
    public void initialize() {
//>> initialize
//<< initialize

        super.initialize();
    }

    @Override
    public void destroy() {
//>> destroy
//<< destroy

        super.destroy();
    }

//>> Attributes

    public boolean getCache() {
        return (boolean)getProperty("cache");
    }

    public void setCache(boolean value) {
        setProperty("cache", value);
    }

    public String getContentType() {
        return (String)getProperty("contentType");
    }

    public void setContentType(String value) {
        setProperty("contentType", value);
    }

    public String getDataType() {
        return (String)getProperty("dataType");
    }

    public void setDataType(String value) {
        setProperty("dataType", value);
    }

    public String getType() {
        return (String)getProperty("type");
    }

    public void setType(String value) {
        setProperty("type", value);
    }

    public String getUrl() {
        return (String)getProperty("url");
    }

    public void setUrl(String value) {
        setProperty("url", value);
    }

//<< Attributes

}
