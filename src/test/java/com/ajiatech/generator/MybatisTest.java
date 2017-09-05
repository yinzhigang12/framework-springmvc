package com.ajiatech.generator;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.ajiatech.mapper.AjiaItemMapper;
import com.ajiatech.mapper.AjiaUserMapper;
import com.ajiatech.pojo.AjiaItem;
import com.ajiatech.pojo.AjiaItemExample;
import com.ajiatech.pojo.AjiaItemExample.Criteria;
import com.ajiatech.pojo.AjiaUser;
import com.ajiatech.pojo.AjiaUserExample;

public class MybatisTest {
	@Test
	public void updateUserPwd()
	{
		InputStream is = getClass().getClassLoader().getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory fac = new SqlSessionFactoryBuilder().build(is);
		SqlSession sqlSession = fac.openSession();
		AjiaUserMapper userMapper = sqlSession.getMapper(AjiaUserMapper.class);
		AjiaUserExample example = new AjiaUserExample();
		example.createCriteria().andUsernameEqualTo("lisi");
		AjiaUser user = new AjiaUser();
		user.setPassword("wwe123456");
		userMapper.updateByExampleSelective(user, example);
		sqlSession.commit();
		sqlSession.close();
	}
	
	public void deleteUserByName()
	{
		InputStream is = getClass().getClassLoader().getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory fac = new SqlSessionFactoryBuilder().build(is);
		SqlSession sqlSession = fac.openSession();
		AjiaUserMapper userMapper = sqlSession.getMapper(AjiaUserMapper.class);
		AjiaUserExample example = new AjiaUserExample();
		example.createCriteria().andUsernameEqualTo("yinzhigang");
		userMapper.deleteByExample(example);
		sqlSession.commit();
		sqlSession.close();
	}
	
	public void insertUser()
	{
		InputStream is = getClass().getClassLoader().getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory fac = new SqlSessionFactoryBuilder().build(is);
		SqlSession sqlSession = fac.openSession();
		AjiaUserMapper userMapper = sqlSession.getMapper(AjiaUserMapper.class);
		AjiaUser user = new AjiaUser();
		user.setUsername("xiguangudu");
		user.setPassword("xg123456");
		user.setPhone("15017517451");
		user.setEmail("yinzhigang12@hotmail.com");
		userMapper.insertSelective(user);
		sqlSession.commit();
		sqlSession.close();
	}
	
	public void selectByExample()
	{
		InputStream is = getClass().getClassLoader().getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory fac = new SqlSessionFactoryBuilder().build(is);
		SqlSession sqlSession = fac.openSession();
		AjiaItemMapper itemMapper = sqlSession.getMapper(AjiaItemMapper.class);
		AjiaItemExample example = new AjiaItemExample();
		Criteria c = example.createCriteria();
		c.andPriceLessThan(5000L);
		c.andTitleLike("%ÁªÏë%");
		Criteria c2 = example.or();
		c2.andTitleLike("%´÷¶û%");
		
		List<AjiaItem> items = itemMapper.selectByExample(example);
		System.out.println(items);
		sqlSession.close();
	}
	
	public void selectUser()
	{
		InputStream is = getClass().getClassLoader().getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory fac = new SqlSessionFactoryBuilder().build(is);
		SqlSession sqlSession = fac.openSession();
		AjiaUserMapper userMapper = sqlSession.getMapper(AjiaUserMapper.class);
		AjiaUser user = userMapper.selectByPrimaryKey(14L);
		System.out.println(user);
		sqlSession.commit();
		sqlSession.close();
	}
	
	public void testMybatis()
	{
		InputStream is = getClass().getClassLoader().getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory fac = new SqlSessionFactoryBuilder().build(is);
		SqlSession sqlSession = fac.openSession();
		AjiaUser user = new AjiaUser();
		user.setId(null);
		user.setUsername("Yingzhigang");
		user.setPassword("yyy123456");
		user.setPhone("15887224884");
		user.setEmail("yinzhigang2@163.com");
		user.setCreated(new Date());
		user.setUpdated(new Date());
		sqlSession.insert("com.ajiatech.mapper.AjiaUserMapper.insertSelective",user);
		sqlSession.commit();
		sqlSession.close();
	}
}
