package com.nanuvem.nncore.runtime

class AttributeValue {

	String value
	
	static belongsTo = Part
	

    static constraints = {
		value()
    }
}
