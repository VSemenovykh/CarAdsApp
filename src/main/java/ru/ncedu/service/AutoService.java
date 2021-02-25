package ru.ncedu.service;

import org.springframework.data.jpa.repository.JpaRepository;	
import org.springframework.stereotype.Repository;	
import ru.ncedu.entity.Auto;
import ru.ncedu.exception.BadResourceException;
import ru.ncedu.exception.ResourceAlreadyExistsException;
import ru.ncedu.exception.ResourceNotFoundException;

import java.util.List;

public interface AutoService{

    List<Auto> getAllAuto();

    List<Auto> findAll(int pageNumber, int rowPerPage);

    Long count();

    Auto save(Auto auto) throws BadResourceException, ResourceAlreadyExistsException;

    Auto findById(Long id) throws ResourceNotFoundException;

    void update(Auto auto);

    void delete(Long id) throws ResourceNotFoundException;
}