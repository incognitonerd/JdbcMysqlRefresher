package com.jdbcmysqlrefresher.mapper;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.jdbcmysqlrefresher.dto.UsersWhoMayBeBotsDTO;

public class UsersWhoMayBeBotsMapper implements RowMapper<UsersWhoMayBeBotsDTO> {
	@Override
	public UsersWhoMayBeBotsDTO mapRow(ResultSet r, int rowNum) throws SQLException{
		UsersWhoMayBeBotsDTO dto = new UsersWhoMayBeBotsDTO(r.getString("username"), r.getInt("numOflikes"));
		return dto;
	}
}
