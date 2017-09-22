package com.spring.lw.vo;

import lombok.Data;

@Data
public class User {
	private int id;
    
    private String username;
    
    private String password;
    
    public String toString(){
    	return "id = " + id + " , username = " + username + ", password = " + password ;
    }
}
