package com.brandongo.giggles.service;

import com.brandongo.giggles.data.entity.Gig;
import com.brandongo.giggles.repository.mapper.GigRepository;
import org.springframework.jdbc.core.JdbcTemplate;

public class GigListService {
    public static Gig getSingleGig(int id, JdbcTemplate jdbcTemplate) {
        return GigRepository.getSingleGig(id, jdbcTemplate);
    }
}
