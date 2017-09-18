package com.idea.redis.dao.impl;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.stereotype.Repository;

import com.idea.redis.dao.IUserDao;
import com.idea.redis.dao.RedisBaseDao;
import com.idea.redis.entity.User;
import com.idea.redis.utils.SerializeUtil;

@Repository
public class UserDaoImpl extends RedisBaseDao<String, Object> implements IUserDao {
	
//	@Override
	public boolean addUser(final User user) {
		boolean result = redisTemplate.execute(new RedisCallback<Boolean>() {
			@Override
			public Boolean doInRedis(RedisConnection connection) throws DataAccessException {
				 RedisSerializer<String> serializer = getRedisSerializer();
				 byte[] userIdKey = serializer.serialize("user_id_"+user.getId().toString());
				 byte[] userValue = serializer.serialize(user.toString());
				 return connection.setNX(userIdKey, userValue);
			}
		});
		return result;
	}
	
	@Override
	public boolean add(final User user) {
		boolean result = redisTemplate.execute(new RedisCallback<Boolean>() {
			@Override
			public Boolean doInRedis(RedisConnection connection) throws DataAccessException {
				 RedisSerializer<String> serializer = getRedisSerializer();
				 byte[] userIdKey = serializer.serialize("user_id_"+user.getId().toString());
				 byte[] userValue = SerializeUtil.serialize(user);
				 return connection.setNX(userIdKey, userValue);
			}
		});
		return result;
	}

	@Override
	public boolean add(List<User> list) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Long delete(final String key) {
		Long result = redisTemplate.execute(new RedisCallback<Long>() {
			@Override
			public Long doInRedis(RedisConnection connection) throws DataAccessException {
				 RedisSerializer<String> serializer = getRedisSerializer();
				 byte[] userIdKey = serializer.serialize("user_id_"+key);
				 byte[] userValue = SerializeUtil.serialize(userIdKey);
				 return connection.del(userValue);
			}
		});
		return result;
	}

	@Override
	public void delete(List<String> keys) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean update(final User user) {
		boolean result = redisTemplate.execute(new RedisCallback<Boolean>(){
			@Override
			public Boolean doInRedis(RedisConnection connection) {
				try {
					RedisSerializer<String> serializer = getRedisSerializer();
					byte[] userIdKey = serializer.serialize("user_id_"+user.getId());
					byte[] userValue = SerializeUtil.serialize(user);
					connection.set(userIdKey, userValue);
					return true;
				} catch (Exception e) {
					e.printStackTrace();
					return false;
				}
			}
		});
		return result;
	}

	@Override
	public User get(final String keyId) {
		User result = redisTemplate.execute(new RedisCallback<User>() {
			@Override
			public User doInRedis(RedisConnection connection) throws DataAccessException {
				RedisSerializer<String> serializer = getRedisSerializer();
				byte[] key = serializer.serialize("user_id_"+keyId);
				byte[] value = connection.get(key);
				if (value == null) {    
                    return null;    
                }    
				User user = (User) SerializeUtil.unserialize(value);
                return user;
			}
		}); 
		return result;
	}

}
