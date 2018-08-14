package com.diatoz.jhipster.repository;

import com.diatoz.jhipster.domain.Job;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data MongoDB repository for the Job entity.
 */
@SuppressWarnings("unused")
@Repository
public interface JobRepository extends MongoRepository<Job, String> {

}
