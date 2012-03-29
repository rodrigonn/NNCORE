package com.nanuvem.nncore.design

import com.nanuvem.nncore.config.Tenant;

class AttributeType {

	String name
	boolean active
	
	static belongsTo = Tenant
	
    static constraints = {
    }
}
