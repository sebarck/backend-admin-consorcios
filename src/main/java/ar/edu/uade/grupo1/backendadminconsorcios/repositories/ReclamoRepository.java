package ar.edu.uade.grupo1.backendadminconsorcios.repositories;

import ar.edu.uade.grupo1.backendadminconsorcios.models.Reclamo;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReclamoRepository extends MongoRepository<Reclamo, String> {
    Reclamo findBy_id(ObjectId _id);
}
