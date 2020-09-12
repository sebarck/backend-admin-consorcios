package ar.edu.uade.grupo1.backendadminconsorcios.repositories;

import ar.edu.uade.grupo1.backendadminconsorcios.models.Persona;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonaRepository extends MongoRepository<Persona, Long> {
    Persona findBy_id(ObjectId _id);
}
