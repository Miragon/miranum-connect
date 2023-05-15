package io.miragon.miranum.connect.json.registry.adapter.out;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface SchemaRepository extends JpaRepository<SchemaEntity, String> {

    @Query(value = "SELECT max(version) FROM SchemaEntity WHERE ref = ?1")
    Optional<SchemaEntity> findLatestByRef(String ref);

    Optional<SchemaEntity> findByRefAndVersion(String ref, Integer version);
}
