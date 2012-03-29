package com.nanuvem.nncore.config

class Resource {

	String path
	String description
	boolean active
	
	static belongsTo = Tenant
	
	static hasMany = [roles: Role]
	
    static constraints = {
		path(nullable:false)
		description()
		active(nullable:false)
    }
}
