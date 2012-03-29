package com.nanuvem.nncore.config

class User {

	String login
	String password
	boolean active
	String email
	
	static belongsTo = Tenant
	
	static hasMany = [roles: Role]
	
    static constraints = {
		login(nullable:false)
		password(nullable:false, password:true)
		email(nullable:false, email:true)
		active(nullable:false)
    }
}
