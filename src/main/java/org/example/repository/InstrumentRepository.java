package org.example.repository;

import org.example.model.Instrument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstrumentRepository extends MongoRepository<Instrument, String> {
}



