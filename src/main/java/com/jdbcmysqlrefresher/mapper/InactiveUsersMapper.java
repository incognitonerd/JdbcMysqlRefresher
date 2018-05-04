package com.jdbcmysqlrefresher.mapper;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.jdbcmysqlrefresher.dto.InactiveUsersDTO;

public class InactiveUsersMapper implements RowMapper<InactiveUsersDTO> {
	@Override
	public InactiveUsersDTO mapRow(ResultSet r, int rowNum) throws SQLException{
		InactiveUsersDTO dto = new InactiveUsersDTO(r.getString("username"));
		return dto;
	}
}
