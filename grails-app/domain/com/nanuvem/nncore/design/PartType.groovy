package com.nanuvem.nncore.design

import com.nanuvem.nncore.runtime.Part;

class PartType {

	String name
	boolean active
	
	static belongsTo = Model
	
	static hasMany = [attributes:Attribute, operations:Operation, parts: Part,
		fatherRelations:RelationRule, childRelations: RelationRule]
	
    static constraints = {
		name(nullable:false)
		active(nullable:false)
    }
}
