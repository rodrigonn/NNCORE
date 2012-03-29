package com.nanuvem.nncore.design

class Operation {

	String type
	int sequence
	boolean active
	String activation
	String code

	static belongsTo = PartType
	
    static constraints = {
		type(nullable:false)
		sequence(nullable:false)
		activation()
		code(max:5000)
		active(nullable:false)
    }
}
