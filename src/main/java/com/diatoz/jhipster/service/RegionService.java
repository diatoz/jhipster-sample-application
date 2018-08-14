package com.diatoz.jhipster.service;

import com.diatoz.jhipster.service.dto.RegionDTO;

import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing Region.
 */
public interface RegionService {

    /**
     * Save a region.
     *
     * @param regionDTO the entity to save
     * @return the persisted entity
     */
    RegionDTO save(RegionDTO regionDTO);

    /**
     * Get all the regions.
     *
     * @return the list of entities
     */
    List<RegionDTO> findAll();


    /**
     * Get the "id" region.
     *
     * @param id the id of the entity
     * @return the entity
     */
    Optional<RegionDTO> findOne(String id);

    /**
     * Delete the "id" region.
     *
     * @param id the id of the entity
     */
    void delete(String id);

    /**
     * Search for the region corresponding to the query.
     *
     * @param query the query of the search
     * 
     * @return the list of entities
     */
    List<RegionDTO> search(String query);
}
