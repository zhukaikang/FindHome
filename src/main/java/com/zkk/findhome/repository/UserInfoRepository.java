package com.zkk.findhome.repository;

import com.zkk.findhome.dataobject.UserInfo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserInfoRepository extends MongoRepository<UserInfo, String> {

    public UserInfo findByUserId(String userId);
}
