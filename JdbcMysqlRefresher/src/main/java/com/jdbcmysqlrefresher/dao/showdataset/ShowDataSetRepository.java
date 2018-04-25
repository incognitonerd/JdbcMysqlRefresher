package com.jdbcmysqlrefresher.dao.showdataset;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.jdbcmysqlrefresher.dom.tables.AvailableEndpoint;
import com.jdbcmysqlrefresher.dom.tables.Comment;
import com.jdbcmysqlrefresher.dom.tables.Follow;
import com.jdbcmysqlrefresher.dom.tables.Like;
import com.jdbcmysqlrefresher.dom.tables.Photo;
import com.jdbcmysqlrefresher.dom.tables.PhotoTag;
import com.jdbcmysqlrefresher.dom.tables.Table;
import com.jdbcmysqlrefresher.dom.tables.TableStat;
import com.jdbcmysqlrefresher.dom.tables.Tag;
import com.jdbcmysqlrefresher.dom.tables.User;

@Repository
public class ShowDataSetRepository {
	private static final Logger LOGGER = LoggerFactory.getLogger(ShowDataSetRepository.class);
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Comment> getAllComments(){
		List<Comment> result = jdbcTemplate.query("SELECT * FROM comments", (rs, rowNum)->new Comment(rs.getInt("id"),
				rs.getString("comment_text"), rs.getInt("photo_id"), rs.getInt("user_id"), rs.getTimestamp("created_at")));
		return result;
	}
	
	public List<Follow> getAllFollows(){
		List<Follow> result = jdbcTemplate.query("SELECT * FROM follows",
				(rs, rowNum)->new Follow(rs.getInt("follower_id"), rs.getInt("followee_id"), rs.getTimestamp("created_at")));
		return result;
	}
	
	public List<Like> getAllLikes(){
		List<Like> result = jdbcTemplate.query("SELECT * FROM likes",
				(rs, rowNum)->new Like(rs.getInt("user_id"), rs.getInt("photo_id"), rs.getTimestamp("created_at")));
		return result;
	}
	
	public List<Photo> getAllPhotos(){
		List<Photo> result = jdbcTemplate.query("SELECT * FROM photos", (rs, rowNum)->new Photo(rs.getInt("id"),
				rs.getString("image_url"), rs.getInt("user_id"), rs.getTimestamp("created_at")));
		return result;
	}
	
	public List<PhotoTag> getAllPhotoTags(){
		List<PhotoTag> result = jdbcTemplate.query("SELECT * FROM photoTags",
				(rs, rowNum)->new PhotoTag(rs.getInt("photo_id"), rs.getInt("tag_id")));
		return result;
	}
	
	public List<Table> getAllTables(){
		List<Table> result = jdbcTemplate.query(
				"SELECT TABLE_NAME AS tableName FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA = 'ig_clone';",
				(rs, rowNum)->new Table(rs.getString("tableName")));
		return result;
	}
	
	public List<TableStat> getAllTableStats(){
		jdbcTemplate.update("DROP TABLE IF EXISTS tableStats");
		jdbcTemplate.update(
				"CREATE TABLE tableStats (id INTEGER AUTO_INCREMENT PRIMARY KEY, tableName VARCHAR(255) UNIQUE NOT NULL, numOfRows INTEGER DEFAULT 0)");
		List<Table> tables = getAllTables();
		for(Table t: tables){
			if(!(t.getTableName().equalsIgnoreCase("tableStats"))){
				String sqlInsert = "INSERT INTO tableStats (tableName, numOfRows) VALUES ('" + t.getTableName()
						+ "',  (select count(*) from " + t.getTableName() + "))";
				LOGGER.info("sqlInsert " + sqlInsert);
				jdbcTemplate.update(sqlInsert);
			}
		}
		List<TableStat> result = jdbcTemplate.query("SELECT * FROM tableStats",
				(rs, rowNum)->new TableStat(rs.getInt("id"), rs.getString("tableName"), rs.getInt("numOfRows")));
		return result;
	}
	
	public List<Tag> getAllTags(){
		List<Tag> result = jdbcTemplate.query("SELECT * FROM tags",
				(rs, rowNum)->new Tag(rs.getInt("id"), rs.getString("tag_name"), rs.getTimestamp("created_at")));
		return result;
	}
	
	public List<User> getAllUsers(){
		List<User> result = jdbcTemplate.query("SELECT * FROM users",
				(rs, rowNum)->new User(rs.getInt("id"), rs.getString("username"), rs.getTimestamp("created_at")));
		return result;
	}
	
	public List<AvailableEndpoint> getAvailableEndpoints(){
		List<AvailableEndpoint> result = jdbcTemplate.query("SELECT * FROM endpoints", (rs,
				rowNum)->new AvailableEndpoint(rs.getInt("id"), rs.getString("endpointUrl"), rs.getString("endpointQuery")));
		return result;
	}
}
