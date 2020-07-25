package com.zkk.findhome.repository;

import com.zkk.findhome.FindhomeApplication;
import com.zkk.findhome.dataobject.UserInfo;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class UserInfoRepositoryTest {
    @Autowired
    private UserInfoRepository repository;

    @Test
    public void saveTest() {
        UserInfo userInfo = new UserInfo();
        userInfo.setHouseName("dp");
        userInfo.setLocation("bline");
        userInfo.setUrl("www.dp.com");
        userInfo.setUserId("1");
        userInfo.setWalkDistance(5);

        repository.save(userInfo);
    }

    @Test
    public void findByUserIdTest() {
        UserInfo userInfo = repository.findByUserId("1");
        Assert.assertNotNull(userInfo);
    }
}