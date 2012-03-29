package com.nanuvem.nncore.design

import com.nanuvem.nncore.runtime.Relation;

class RelationRule {

	String name
	boolean active
	PartType father
	PartType child
	
	static belongsTo = Model
	
	static hasMany = [relations:Relation]
	
    static constraints = {
		name(nullable:false)
		father(nullable:false)
		child(nullable:false)
		active(nullable:false)
    }
}
