package com.nanuvem.nncore.runtime

import com.nanuvem.nncore.design.PartType;

class Part {

	static belongsTo = PartType
	
	static hasMany = [values:AttributeValue, fatherRelations:Relation, childRelations: Relation]
	
    static constraints = {
    }
}
