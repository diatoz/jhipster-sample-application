package com.diatoz.jhipster.service.mapper;

import com.diatoz.jhipster.domain.*;
import com.diatoz.jhipster.service.dto.EmployeeDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity Employee and its DTO EmployeeDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface EmployeeMapper extends EntityMapper<EmployeeDTO, Employee> {


}
