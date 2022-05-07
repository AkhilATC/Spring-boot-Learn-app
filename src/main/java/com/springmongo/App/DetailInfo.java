package com.springmongo.App;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "mock_world")
public class DetailInfo {

    public DetailInfo(String nameOfCharcter,
                      int ageOf,
                      String valueIs) {
        this.nameOfCharcter = nameOfCharcter;
        this.ageOf = ageOf;
        this.valueIs = valueIs;
    }

    @Id
    private ObjectId id;

    private String nameOfCharcter;
    private int ageOf;
    private String valueIs;
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("{").append("Name:").append(this.nameOfCharcter)
                .append("age:").append(this.ageOf).append(",")
                .append("Pos:").append(this.valueIs).append("}");
        return sb.toString();
    }
}
