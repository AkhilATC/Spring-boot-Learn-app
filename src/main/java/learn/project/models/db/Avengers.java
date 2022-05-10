package learn.project.models.db;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@AllArgsConstructor
@Document(collection = "avengers")
public class Avengers {

    @Id
    private ObjectId id;

    @Field("name")
    private String name;

    @Field("information")
    private String info;


}
