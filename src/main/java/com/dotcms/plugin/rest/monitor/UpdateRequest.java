package com.dotcms.plugin.rest.monitor;

import java.io.Serializable;

public class UpdateRequest implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String field;
	String value;
	String query;
	boolean publish=false;
	
	

	public boolean isPublish() {
		return publish;
	}
	public void setPublish(boolean publish) {
		this.publish = publish;
	}
	public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "UpdateRequest [field=" + field + ", value=" + value + ", query=" + query + "]";
	}

	
	
	
	
}
