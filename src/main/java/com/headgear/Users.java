package com.headgear;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaEntity;

/**
 * = Users
 *
 * TODO Auto-generated class documentation
 *
 */
@RooJavaBean
@RooToString
@RooJpaEntity
public class Users {

    /**
     * TODO Auto-generated field documentation
     *
     */
    private String firstName;

    /**
     * TODO Auto-generated field documentation
     *
     */
    private String lastName;

    /**
     * TODO Auto-generated field documentation
     *
     */
    private long account;
}
