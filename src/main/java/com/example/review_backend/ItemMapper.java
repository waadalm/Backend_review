package com.example.review_backend;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;




public class ItemMapper implements RowMapper {
    @Override
    public Item mapRow(ResultSet rs, int rowNum) throws SQLException{
        Item item = new Item();
        item.setidCourse(rs.getString("idCourse"));
        item.setCourseName(rs.getString("courseName"));
        item.setcourseDesc(rs.getString("courseDesc"));
        item.setcourseDuration(rs.getString("courseDuration"));
        item.setcStartDate(rs.getString("cStartDate"));
        item.setcEndDate(rs.getString("cEndDate"));
        item.setcLevel(rs.getString("cLevel"));
        item.setcimageLink(rs.getString("imageLink"));

        return item;
    }


}
