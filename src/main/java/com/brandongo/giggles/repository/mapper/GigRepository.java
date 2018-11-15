package com.brandongo.giggles.repository.mapper;

import com.brandongo.giggles.data.entity.Gig;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class GigRepository {


    private final static String SINGLE_GIG_QUERY = "SELECT * FROM GIGDATA WHERE Gig_id= ?";
    private final static String ALL_GIG_QUERY = "SELECT * FROM GIGDATA";



    public static Gig getSingleGig(int id, JdbcTemplate jdbcTemplate) {
        Gig gig = jdbcTemplate.queryForObject(SINGLE_GIG_QUERY , new Object[] {id}, new GigMapper());
        return gig;
    }

    public static List<Gig> getAllGigs(JdbcTemplate jdbcTemplate) {

        List<Gig> gigs = jdbcTemplate.query(ALL_GIG_QUERY, new BeanPropertyRowMapper(Gig.class));
        return gigs;
    }

}
