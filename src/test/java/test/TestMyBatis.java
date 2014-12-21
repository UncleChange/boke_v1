package test;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.cn.wangsy.mapping.pojo.User;
import com.cn.wangsy.business.user.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestMyBatis {
	private static Logger logger = Logger.getLogger(TestMyBatis.class);
	@Resource
	private IUserService iUserService = null;


	@Test
	public void test1() {
		User user = iUserService.getUserById(1);
		logger.info(JSON.toJSONString(user));
	}
}
