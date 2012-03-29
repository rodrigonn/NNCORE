package com.nanuvem.nncore.config

class Parameter {

	String key
	String value
	
	static belongsTo = Tenant
	
    static constraints = {
		key(nullable:false)
		value()
		//Tenant + key deve ser unique
    }
}
