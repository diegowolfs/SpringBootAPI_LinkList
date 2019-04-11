package com.ibm.wolfsapi.linklist.api;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ibm.wolfsapi.linklist.api.linkentities.Link;

@RepositoryRestResource
public interface RestLinkRepository extends CrudRepository<Link, Long> {

}
