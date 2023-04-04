package com.earth.withdang;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcUserDao implements UserDao {

	@Autowired
    private JdbcTemplate jdbcTemplate;

	@Override
	public void save(User user) {
		String sql = "INSERT INTO users(name, email) VALUES (?, ?)";
        jdbcTemplate.update(sql, user.getName(), user.getEmail());
		
	}

	@Override
	public void update(User user) {
		String sql = "UPDATE users SET name = ?, email = ? WHERE id = ?";
        jdbcTemplate.update(sql, user.getName(), user.getEmail(), user.getId());
		
	}

	@Override
	public void delete(User user) {
		String sql = "DELETE FROM users WHERE id = ?";
        jdbcTemplate.update(sql, user.getId());
		
	}

	@Override
	public User findById(int id) {
		String sql = "SELECT * FROM users WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[] { id }, new UserMapper());
	}

	@Override
	public List<User> findAll() {
		 String sql = "SELECT * FROM users";
	     return jdbcTemplate.query(sql, new UserMapper());
	}
	
	
}
