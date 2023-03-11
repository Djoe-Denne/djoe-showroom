package io.github.djoedenne.djoeshowroom.infra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * JPA implementation for the Universal Repository.
 *
 * @param <T>
 * @param <ID>
 */
@Repository
public interface UniversalRepository<T, ID> extends JpaRepository<T, ID> {
}
