package com.diatoz.jhipster.service.mapper;

import com.diatoz.jhipster.domain.*;
import com.diatoz.jhipster.service.dto.LocationDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity Location and its DTO LocationDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface LocationMapper extends EntityMapper<LocationDTO, Location> {


}
