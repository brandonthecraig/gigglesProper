package com.brandongo.giggles.repository.mapper;

import com.brandongo.giggles.data.entity.Gig;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.JdbcTemplate;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GigMapper implements RowMapper<Gig> {
    // how mapper works
    // so GigMapper implements RowMapper which means that when we add it into parameters it knows to go to this method
    // mapRow. Default thing from
    public Gig mapRow(ResultSet rs, int id) throws SQLException {
        Gig gig = new Gig();
        gig.setGig_id(rs.getInt("Gig_id"));
        gig.setShowName(rs.getString("Gig_showName"));
        gig.setContactName(rs.getString("Gig_contactName"));
        gig.setQuality(rs.getInt("Gig_quality"));
        return gig;
    }

}



