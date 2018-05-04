package com.jdbcmysqlrefresher.services;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.jdbcmysqlrefresher.dao.randomqueries.RandomQueriesRepository;
import com.jdbcmysqlrefresher.dto.AvgPhotosPerUserDTO;
import com.jdbcmysqlrefresher.dto.InactiveUsersDTO;
import com.jdbcmysqlrefresher.dto.MostPopPhotoDTO;
import com.jdbcmysqlrefresher.dto.TwoMostPopRegDatesDTO;

@RestController
@RequestMapping(value = "/randomqueries")
public class RandomQueriesServices {
	private static final Logger LOGGER = LoggerFactory.getLogger(RandomQueriesServices.class);
	@Autowired
	private RandomQueriesRepository dataSet;
	
	// http://localhost:8080/JdbcMysqlRefresher/randomqueries/getTwoMostPopRegDates
	@RequestMapping(value = "/getTwoMostPopRegDates", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
	public Object getAllComments() throws Exception{
		List<TwoMostPopRegDatesDTO> results = dataSet.getTwoMostPopRegDates();
		if(results != null){
			LOGGER.info("results size - " + results.size());
			return results;
		} else{
			return null;
		}
	}
	
	// http://localhost:8080/JdbcMysqlRefresher/randomqueries/getInactiveUsers
	@RequestMapping(value = "/getInactiveUsers", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
	public Object getInactiveUsers() throws Exception{
		List<InactiveUsersDTO> results = dataSet.getInactiveUsers();
		if(results != null){
			LOGGER.info("results size - " + results.size());
			return results;
		} else{
			return null;
		}
	}
	
	// http://localhost:8080/JdbcMysqlRefresher/randomqueries/getMostPopPhoto
	@RequestMapping(value = "/getMostPopPhoto", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
	public Object getMostPopPhoto() throws Exception{
		List<MostPopPhotoDTO> results = dataSet.getMostPopPhoto();
		if(results != null){
			LOGGER.info("results size - " + results.size());
			return results;
		} else{
			return null;
		}
	}
	
	// http://localhost:8080/JdbcMysqlRefresher/randomqueries/getAvgPhotosPerUser
	@RequestMapping(value = "/getAvgPhotosPerUser", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
	public Object getAvgPhotosPerUser() throws Exception{
		List<AvgPhotosPerUserDTO> results = dataSet.getAvgPhotosPerUser();
		if(results != null){
			LOGGER.info("results size - " + results.size());
			return results;
		} else{
			return null;
		}
	}
}