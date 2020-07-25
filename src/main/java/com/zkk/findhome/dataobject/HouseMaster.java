package com.zkk.findhome.dataobject;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
//@Entity
public class HouseMaster {

    @Id
    private String houseId;

    private String houseName;

    private String location;

    private Integer walkDistance;

    private String url;
}
