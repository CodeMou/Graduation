/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.cqwu.graduation.config;

import com.cqwu.graduation.bean.User;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.autoconfigure.cache.CacheProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cache.CacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializationContext;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import java.net.UnknownHostException;
import java.time.Duration;

/**
 * @author Administrator (Administrator@yiji.com)
 * @version 1.0
 * @filename com.cqwu.graduation.config
 * @since 2019/3/25
 */
@Configuration
public class RedisCacheConfig {

	@Bean
	public RedisTemplate<Object, User> empRedisTemplate(
			RedisConnectionFactory redisConnectionFactory)
			throws UnknownHostException {
		RedisTemplate<Object, User> template = new RedisTemplate<Object, User>();
		template.setConnectionFactory(redisConnectionFactory);
		Jackson2JsonRedisSerializer<User> ser = new Jackson2JsonRedisSerializer<User>(User.class);
		template.setDefaultSerializer(ser);
		return template;
	}

	@Bean(name = "redisTemplate")
	public RedisTemplate<String, String> redisTemplate(RedisConnectionFactory factory) {
		RedisTemplate<String, String> template = new RedisTemplate<>();
		ObjectMapper om = new ObjectMapper();
		om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
		om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
		RedisSerializer stringSerializer = new StringRedisSerializer();
		template.setKeySerializer(stringSerializer);
		template.setValueSerializer(stringSerializer);
		template.setHashKeySerializer(stringSerializer);
		template.setHashValueSerializer(stringSerializer);
		template.setConnectionFactory(factory);
		return template;
	}

	@Bean
	/**  redis-cache configuration */
	public CacheManager cacheManager(RedisConnectionFactory factory) {
		RedisSerializer<String> redisSerializer = new StringRedisSerializer();
		Jackson2JsonRedisSerializer jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer(Object.class);

		//解决查询缓存转换异常的问题
		ObjectMapper om = new ObjectMapper();
		om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
		om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
		jackson2JsonRedisSerializer.setObjectMapper(om);

		// 配置序列化（解决乱码的问题）
		RedisCacheConfiguration config = RedisCacheConfiguration.defaultCacheConfig()
				// 7 天缓存过期
				.entryTtl(Duration.ofDays(7))
				.serializeKeysWith(RedisSerializationContext.SerializationPair.fromSerializer(redisSerializer))
				.serializeValuesWith(RedisSerializationContext.SerializationPair.fromSerializer(jackson2JsonRedisSerializer))
				.disableCachingNullValues();

		RedisCacheManager cacheManager = RedisCacheManager.builder(factory)
				.cacheDefaults(config)
				.build();
		return cacheManager;
	}
}
