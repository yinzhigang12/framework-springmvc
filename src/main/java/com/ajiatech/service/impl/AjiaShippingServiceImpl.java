package com.ajiatech.service.impl;

import java.io.InputStream;
import java.util.List;

import com.ajiatech.mapper.AjiaShippingMapper;
import com.ajiatech.pojo.AjiaShipping;
import com.ajiatech.pojo.AjiaShippingExample;
import com.ajiatech.service.AjiaShippingService;

public class AjiaShippingServiceImpl implements AjiaShippingService {

	@Override
	public void save(AjiaShipping shipping) {
		// TODO 自动生成的方法存根
		InputStream is = getClass().getClassLoader().getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory fac = new SqlSessionFactoryBuilder().build(is);
		SqlSession sqlSession = fac.openSession();
		AjiaShippingMapper shippingMapper = sqlSession.getMapper(AjiaShippingMapper.class);
		shippingMapper.insertSelective(shipping);
		sqlSession.commit();
		sqlSession.close();
	}

	@Override
	public List<AjiaShipping> findByUserId(Long userId) {
		// TODO 自动生成的方法存根
		InputStream is = getClass().getClassLoader().getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory fac = new SqlSessionFactoryBuilder().build(is);
		SqlSession sqlSession = fac.openSession();
		AjiaShippingMapper shippingMapper = sqlSession.getMapper(AjiaShippingMapper.class);
		AjiaShippingExample example = new AjiaShippingExample();
		example.createCriteria().andUserIdEqualTo(userId).andStatusEqualTo((byte)1);
		List<AjiaShipping> shippings = shippingMapper.selectByExample(example);
		sqlSession.close();
		return shippings;
	}

	@Override
	public void delete(Long addId) {
		// TODO 自动生成的方法存根
		InputStream is = getClass().getClassLoader().getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory fac = new SqlSessionFactoryBuilder().build(is);
		SqlSession sqlSession = fac.openSession();
		AjiaShippingMapper shippingMapper = sqlSession.getMapper(AjiaShippingMapper.class);
		AjiaShipping shipping = new AjiaShipping();
		shipping.setAddId(addId);
		shipping.setStatus((byte)2);
		shippingMapper.updateByPrimaryKeySelective(shipping);
		sqlSession.commit();
		sqlSession.close();
	}

	@Override
	public void updateDefault(Long addId) {
		// TODO 自动生成的方法存根
		InputStream is = getClass().getClassLoader().getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory fac = new SqlSessionFactoryBuilder().build(is);
		SqlSession sqlSession = fac.openSession();
		AjiaShippingMapper shippingMapper = sqlSession.getMapper(AjiaShippingMapper.class);
		AjiaShipping shipping = shippingMapper.selectByPrimaryKey(addId);
		Long userId = shipping.getUserId();
		AjiaShipping sip = new AjiaShipping();
		sip.setIsDefault(false);
		AjiaShippingExample example = new AjiaShippingExample();
		example.createCriteria().andUserIdEqualTo(userId);
		shippingMapper.updateByExample(sip, example);
		sip.setAddId(addId);
		sip.setIsDefault(true);
		shippingMapper.updateByPrimaryKeySelective(sip);
		sqlSession.commit();
		sqlSession.close();
	}

}
