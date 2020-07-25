package com.zkk.findhome.dataobject;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
//@Entity
@Document
public class UserInfo {
    @Id
    private String userId;

    private String houseName;

    private String location;

    private Integer walkDistance;

    private String url;
}
