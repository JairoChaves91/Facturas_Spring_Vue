package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Factura;


@Repository
public interface IFacturasRepo extends CrudRepository<Factura, Integer> {

}
