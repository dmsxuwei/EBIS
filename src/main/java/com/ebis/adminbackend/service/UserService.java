package com.ebis.adminbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ebis.adminbackend.dao.AUserMapper;
import com.ebis.adminbackend.po.AUser;
import com.ebis.adminbackend.po.AUserExample;

@Service
public class UserService {
	@Autowired
	private AUserMapper aUserMapper;

	public int deleteByPrimaryKey(String userid) {
		return aUserMapper.deleteByPrimaryKey(userid);
	}

	public int insert(AUser record) {
		return aUserMapper.insert(record);
	}

	public List<AUser> queryUserByUsername(String username) {
		AUserExample example = new AUserExample();
		example.createCriteria().andUsernameEqualTo(username);
		return aUserMapper.selectByExample(example);
	}

	public AUser selectByPrimaryKey(String userid) {
		return aUserMapper.selectByPrimaryKey(userid);
	}

}
