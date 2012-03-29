package com.nanuvem.nncore.runtime

import com.nanuvem.nncore.design.RelationRule;

class Relation {

	String role
	Date begin
	Date end
	String config
	Part father
	Part child

	static belongsTo = RelationRule
	
    static constraints = {
		role()
		begin()
		end()
		config()
    }
}
