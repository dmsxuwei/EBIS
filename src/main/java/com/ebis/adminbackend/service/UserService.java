package com.ebis.adminbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ebis.adminbackend.dao.AUserMapper;
import com.ebis.adminbackend.exception.BizException;
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
	
	public AUser queryUserByEmail(String email) {
		AUserExample example = new AUserExample();
		example.createCriteria().andUsernameEqualTo(email);
		List<AUser> users=aUserMapper.selectByExample(example);
		if(users.size()>1)throw new BizException("-1","一个EMAIL对应多个用户");
		if(users.size()==0)return null;
		return users.get(0);
	}
	

}
