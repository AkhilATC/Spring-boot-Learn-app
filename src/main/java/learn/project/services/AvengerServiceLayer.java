package learn.project.services;

import learn.project.models.db.Avengers;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvengerServiceLayer extends MongoRepository<Avengers, ObjectId> {
}
