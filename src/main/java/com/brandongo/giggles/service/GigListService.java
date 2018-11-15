package com.brandongo.giggles.service;

import com.brandongo.giggles.data.entity.Gig;
import com.brandongo.giggles.repository.GigRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GigListService {
    public static Gig getSingleGig(int id, JdbcTemplate jdbcTemplate) {
        return GigRepository.getSingleGig(id, jdbcTemplate);
    }

    public static List<Gig> getAllGigs(JdbcTemplate jdbcTemplate) {
        return GigRepository.getAllGigs(jdbcTemplate);
    }

    public static void insertSingleGig(JdbcTemplate jdbcTemplate, Gig gig) {
        GigRepository.insertSingleGig(jdbcTemplate, gig);
    }

    public static void updateSingleGig(JdbcTemplate jdbcTemplate, Gig gig) {
        GigRepository.updateSingleGig(jdbcTemplate, gig);
    }
}
