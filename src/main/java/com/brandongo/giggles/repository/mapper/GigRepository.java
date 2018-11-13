package com.brandongo.giggles.repository.mapper;

import com.brandongo.giggles.data.entity.Gig;
import org.springframework.jdbc.core.JdbcTemplate;

public class GigRepository {


    private final static String SINGLE_GIG_QUERY = "SELECT * FROM GIGDATA WHERE Gig_id= ?";

    public static Gig getSingleGig(int id, JdbcTemplate jdbcTemplate) {
        Gig gig = jdbcTemplate.queryForObject(SINGLE_GIG_QUERY , new Object[] {id}, new GigMapper());
        return gig;
    }
}
