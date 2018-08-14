package com.diatoz.jhipster.repository.search;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Configuration;

/**
 * Configure a Mock version of JobSearchRepository to test the
 * application without starting Elasticsearch.
 */
@Configuration
public class JobSearchRepositoryMockConfiguration {

    @MockBean
    private JobSearchRepository mockJobSearchRepository;

}
