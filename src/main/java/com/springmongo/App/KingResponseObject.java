package com.springmongo.App;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
public class KingResponseObject {

    private String kingName;

    private String clanName;

    public KingResponseObject(String kingName, String clanName) {
        this.kingName = kingName;
        this.clanName = clanName;
    }


}
