package com.example.demo1.repository;

import com.example.clase3gtics.entity.Shipper;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VeterinariaRepository extends JpaRepository<Sede, Integer> {

    List<Sede> findBySedeLs(String textoIngresado);

    @Query(nativeQuery = true, value = "SELECT * FROM veterinaria_db.sede where id = ?1")
    List<Sede> buscarPorId(String textoIngreso);

}

