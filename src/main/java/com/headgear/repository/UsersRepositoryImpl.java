package com.headgear.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.headgear.Users;

/**
 * = UsersRepositoryImpl
 *
 * TODO Auto-generated class documentation
 *
 */ 
@RooJpaRepositoryCustomImpl(repository = UsersRepositoryCustom.class)
public class UsersRepositoryImpl extends QueryDslRepositorySupportExt<Users> {

    /**
     * TODO Auto-generated constructor documentation
     */
    UsersRepositoryImpl() {
        super(Users.class);
    }
}