// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.headgear;

import com.headgear.Users;

privileged aspect Users_Roo_JavaBean {
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String Users.getFirstName() {
        return this.firstName;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param firstName
     */
    public void Users.setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String Users.getLastName() {
        return this.lastName;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param lastName
     */
    public void Users.setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Long
     */
    public long Users.getAccount() {
        return this.account;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param account
     */
    public void Users.setAccount(long account) {
        this.account = account;
    }
    
}