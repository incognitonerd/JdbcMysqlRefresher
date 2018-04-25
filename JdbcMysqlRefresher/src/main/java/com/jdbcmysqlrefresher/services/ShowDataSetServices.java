package com.jdbcmysqlrefresher.services;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.jdbcmysqlrefresher.dao.showdataset.ShowDataSetRepository;
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

@RestController
@RequestMapping(value = "/showdataset")
public class ShowDataSetServices {
	private static final Logger LOGGER = LoggerFactory.getLogger(ShowDataSetServices.class);
	@Autowired
	private ShowDataSetRepository dataSet;
	
	//http://localhost:8080/jdbcmysqlrefresher/showdataset/getAllComments
	@RequestMapping(value = "/getAllComments", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
	public Object getAllComments() throws Exception{
		List<Comment> comments = dataSet.getAllComments();
		if(comments != null){
			LOGGER.info("comments size - " + comments.size());
			return comments;
		} else{
			return null;
		}
	}
	
	//http://localhost:8080/jdbcmysqlrefresher/showdataset/getAllFollows
	@RequestMapping(value = "/getAllFollows", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
	public Object getAllFollows() throws Exception{
		List<Follow> follows = dataSet.getAllFollows();
		if(follows != null){
			LOGGER.info("follows size - " + follows.size());
			return follows;
		} else{
			return null;
		}
	}
	
	//http://localhost:8080/jdbcmysqlrefresher/showdataset/getAllLikes
	@RequestMapping(value = "/getAllLikes", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
	public Object getAllLikes() throws Exception{
		List<Like> likes = dataSet.getAllLikes();
		if(likes != null){
			LOGGER.info("likes size - " + likes.size());
			return likes;
		} else{
			return null;
		}
	}
	
	//http://localhost:8080/jdbcmysqlrefresher/showdataset/getAllPhotos
	@RequestMapping(value = "/getAllPhotos", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
	public Object getAllPhotos() throws Exception{
		List<Photo> photos = dataSet.getAllPhotos();
		if(photos != null){
			LOGGER.info("photos size - " + photos.size());
			return photos;
		} else{
			return null;
		}
	}
	
	//http://localhost:8080/jdbcmysqlrefresher/showdataset/getAllPhotoTags
	@RequestMapping(value = "/getAllPhotoTags", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
	public Object getAllPhotoTags() throws Exception{
		List<PhotoTag> photoTags = dataSet.getAllPhotoTags();
		if(photoTags != null){
			LOGGER.info("photoTags size - " + photoTags.size());
			return photoTags;
		} else{
			return null;
		}
	}
	
	//http://localhost:8080/jdbcmysqlrefresher/showdataset/getAllTables
	@RequestMapping(value = "/getAllTables", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
	public Object getAllTables() throws Exception{
		List<Table> tables = dataSet.getAllTables();
		if(tables != null){
			LOGGER.info("tables size - " + tables.size());
			return tables;
		} else{
			return null;
		}
	}
	
	//http://localhost:8080/jdbcmysqlrefresher/showdataset/getAllTableStats
	@RequestMapping(value = "/getAllTableStats", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
	public Object getAllTableStats() throws Exception{
		List<TableStat> tableStats = dataSet.getAllTableStats();
		if(tableStats != null){
			LOGGER.info("tableStats size - " + tableStats.size());
			return tableStats;
		} else{
			return null;
		}
	}
	
	//http://localhost:8080/jdbcmysqlrefresher/showdataset/getAllTags
	@RequestMapping(value = "/getAllTags", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
	public Object getAllTags() throws Exception{
		List<Tag> tags = dataSet.getAllTags();
		if(tags != null){
			LOGGER.info("tags size - " + tags.size());
			return tags;
		} else{
			return null;
		}
	}
	
	//http://localhost:8080/jdbcmysqlrefresher/showdataset/getAllUsers
	@RequestMapping(value = "/getAllUsers", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
	public Object getAllUsers() throws Exception{
		List<User> users = dataSet.getAllUsers();
		if(users != null){
			LOGGER.info("users size - " + users.size());
			return users;
		} else{
			return null;
		}
	}
	
	//http://localhost:8080/jdbcmysqlrefresher/showdataset/getAvailableEndpoints
	@RequestMapping(value = "/getAvailableEndpoints", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
	public Object getAvailableEndpoints() throws Exception{
		List<AvailableEndpoint> availableEndpoints = dataSet.getAvailableEndpoints();
		if(availableEndpoints != null){
			LOGGER.info("availableEndpoints size - " + availableEndpoints.size());
			return availableEndpoints;
		} else{
			return null;
		}
	}
}