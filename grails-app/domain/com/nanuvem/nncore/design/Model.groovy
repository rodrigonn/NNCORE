package com.nanuvem.nncore.design

import com.nanuvem.nncore.config.Tenant;

class Model {

	String name
	boolean active
	
	static belongsTo = Tenant
	
	static hasMany = [relationRules:RelationRule, partTypes:PartType]
	
    static constraints = {
		name(nullable:false)
		active(nullable:false)
    }
}
