package com.example.webserviceConcern.repositories;

import com.example.webserviceConcern.model.Concern;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "concerns", path = "concerns")
public interface ConcernRepository extends JpaRepository<Concern, Long> {
}
