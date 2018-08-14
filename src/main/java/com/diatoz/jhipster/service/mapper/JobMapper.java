package com.diatoz.jhipster.service.mapper;

import com.diatoz.jhipster.domain.*;
import com.diatoz.jhipster.service.dto.JobDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity Job and its DTO JobDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface JobMapper extends EntityMapper<JobDTO, Job> {


}
