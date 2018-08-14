package com.diatoz.jhipster.service.mapper;

import com.diatoz.jhipster.domain.*;
import com.diatoz.jhipster.service.dto.RegionDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity Region and its DTO RegionDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface RegionMapper extends EntityMapper<RegionDTO, Region> {


}
