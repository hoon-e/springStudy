package com.jh.firstSpring.dao;

import com.jh.firstSpring.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

// define operations
public interface PersonDao {

    int insertPerson(UUID id, Person person);

    default int insertPerson(Person person){
        // randomly generate
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

    List<Person> selectAllPeople();

    Optional<Person> selectPersonById(UUID id);

    int deletePersonById(UUID id);

    int updatePersonById(UUID id, Person person);
}
