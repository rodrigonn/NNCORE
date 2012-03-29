package com.nanuvem.nncore.config

class Role {

	String name
	String description
	boolean active

	static belongsTo = Tenant
	
	static hasMany = [users: User, resources:Resource]
	
    static constraints = {
		name(nullable:false)
		description()
		active(nullable:false)
    }
}
