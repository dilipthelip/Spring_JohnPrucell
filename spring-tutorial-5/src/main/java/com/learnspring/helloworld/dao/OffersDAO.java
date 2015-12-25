package com.learnspring.helloworld.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.learnspring.helloworld.dao.model.*;

@Component("offersDao")
public class OffersDAO {

	NamedParameterJdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource jdbcTemplate) {
		this.jdbcTemplate = new NamedParameterJdbcTemplate(jdbcTemplate);
	}

	public List<Offer> getOffers() {
		// TODO Auto-generated method stub
		
	//	MapSqlParameterSource params=new MapSqlParameterSource("name","Sue");
		
		return jdbcTemplate.query("select * from offers",new RowMapper<Offer>() {

			public Offer mapRow(ResultSet rs, int rowNum) throws SQLException {

				if(rs!=null){

					Offer offer=new Offer();

					offer.setId(rs.getInt("id"));
					offer.setName(rs.getString("name"));
					offer.setEmail(rs.getString("email"));
					offer.setText(rs.getString("text"));
					return offer;

				}else{
					return null;
				}

			}

		});


	}
	
	public Offer getOffer(int id) {
		// TODO Auto-generated method stub
		
		MapSqlParameterSource params=new MapSqlParameterSource();
		params.addValue("id", id);
		
		return jdbcTemplate.queryForObject("select * from offers where id= :id", params, new RowMapper<Offer>() {

			public Offer mapRow(ResultSet rs, int rowNum) throws SQLException {

				if(rs!=null){

					Offer offer=new Offer();
					offer.setId(rs.getInt("id"));
					offer.setName(rs.getString("name"));
					offer.setEmail(rs.getString("email"));
					offer.setText(rs.getString("text"));
					return offer;

				}else{
					return null;
				}

			}

		});


	}
	
	/**
	 * Used to insert the Record
	 * @param offer
	 * @return
	 */
	public boolean create(Offer offer){
			
		BeanPropertySqlParameterSource params=new BeanPropertySqlParameterSource(offer);
		
		return jdbcTemplate.update("insert into offers (name, text,email) values (:name,:text,:email)", params) == 1;		
		//return true;
	}
	
	/**
	 * Update a Record in the DB
	 * @param offer
	 * @return
	 */
	
	public boolean update(Offer offer){
		
		BeanPropertySqlParameterSource params=new BeanPropertySqlParameterSource(offer);
		
		return jdbcTemplate.update("update offers set name =:name, text = :text, email = :email  where id = :id ", params) == 1;		
		//return true;
		
	}
	
	
	public int delete(int id){
		
		
		MapSqlParameterSource params=new MapSqlParameterSource();
		params.addValue("id", id);
		
		return jdbcTemplate.update("delete from offers where id = :id" , params);
		
		//jdbcTemplate.queryforli
		
	}
	
	/**
	 * This method does the batch update in to the DB.
	 * @param offerList
	 * @return
	 */
	@Transactional()
	public int[] createList(List <Offer> offerList){
		
		SqlParameterSource[] params =  SqlParameterSourceUtils.createBatch(offerList.toArray());
		
		return jdbcTemplate.batchUpdate("insert into offers (id ,name, text,email) values (:id,:name,:text,:email)", params);
		
	}





}
