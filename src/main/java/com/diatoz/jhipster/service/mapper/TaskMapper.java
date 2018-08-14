package com.diatoz.jhipster.service.mapper;

import com.diatoz.jhipster.domain.*;
import com.diatoz.jhipster.service.dto.TaskDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity Task and its DTO TaskDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface TaskMapper extends EntityMapper<TaskDTO, Task> {


}
