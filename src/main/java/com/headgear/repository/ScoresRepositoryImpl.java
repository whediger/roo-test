package com.headgear.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.headgear.Scores;

/**
 * = ScoresRepositoryImpl
 *
 * TODO Auto-generated class documentation
 *
 */ 
@RooJpaRepositoryCustomImpl(repository = ScoresRepositoryCustom.class)
public class ScoresRepositoryImpl extends QueryDslRepositorySupportExt<Scores> {

    /**
     * TODO Auto-generated constructor documentation
     */
    ScoresRepositoryImpl() {
        super(Scores.class);
    }
}