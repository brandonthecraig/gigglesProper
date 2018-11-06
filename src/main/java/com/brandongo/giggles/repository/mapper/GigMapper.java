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

    public List<Gig> findAll(JdbcTemplate jdbcTemplate) {

        String sql = "SELECT * FROM GIGDATA";

        List<Gig> gigs = new ArrayList<Gig>();

        // pulled this from that great website that shows all this stuff
        // supposedly there's a way to do this with entities and beans as well
        // for now just kept it simple

        List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
        for (Map row : rows) {
            Gig gig = new Gig ();
            gig.setGig_id((int)(row.get("Gig_id")));
            gig.setQuality((int)(row.get("Gig_quality")));
            gig.setShowName((String)(row.get("Gig_showName")));
            gig.setContactName((String)(row.get("Gig_contactName")));
            gigs.add(gig);
        }

        return gigs;
    }


    // this is leftover from my RowMapper implementation. I think in an ideal world there's a way to use this
    // that doesn't involve me having to write all that stuff up top but I don't want to mess with it atm.
    @Override
    public Gig mapRow(ResultSet resultSet, int i) throws SQLException {
        return null;
    }
}



