package io.github.djoedenne.djoeshowroom.infra.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Mongo implementation for the Universal Repository.
 *
 * @param <T>
 * @param <ID>
 */
@Repository
public interface UniversalRepository<T, ID> extends MongoRepository<T, ID> {
}
