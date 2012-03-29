package com.nanuvem.nncore.design

class Attribute {

	int sequence
	String name
	String configuration
	boolean active
	boolean mandatory
	String tip
	String defaultValue
	AttributeType attributeType
	
	static belongsTo = PartType
	
    static constraints = {
		name(nullable:false)
		sequence(nullable:false)
		defaultValue()
		configuration()
		tip()
		mandatory(nullable:false)
		active(nullable:false)
    }
}
