package com.nanuvem.nncore.config

import com.nanuvem.nncore.design.AttributeType;
import com.nanuvem.nncore.design.Model;

class Tenant {
	String name
	String plan
	
	static hasMany = [models:Model, attributeTypes:AttributeType,
		resources:Resource, roles:Role, parameters:Parameter, users:User]
	 
	static constraints = {
		name(nullable:false)
		plan()
	}
}
