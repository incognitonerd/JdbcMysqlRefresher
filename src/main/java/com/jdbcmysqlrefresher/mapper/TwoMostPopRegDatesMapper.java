package com.jdbcmysqlrefresher.mapper;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.jdbcmysqlrefresher.dto.TwoMostPopRegDatesDTO;

public class TwoMostPopRegDatesMapper implements RowMapper<TwoMostPopRegDatesDTO> {
	@Override
	public TwoMostPopRegDatesDTO mapRow(ResultSet r, int rowNum) throws SQLException{
		TwoMostPopRegDatesDTO dto = new TwoMostPopRegDatesDTO(r.getString("day"), r.getInt("total"));
		return dto;
	}
}
