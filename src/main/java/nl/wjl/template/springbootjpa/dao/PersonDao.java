package nl.wjl.template.springbootjpa.dao;

import nl.wjl.template.springbootjpa.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


/**
 * Created by Wouter on 18-2-2016.
 */
@RepositoryRestResource(collectionResourceRel = "person", path = "person")
public interface PersonDao extends JpaRepository<Person, Long> {

}