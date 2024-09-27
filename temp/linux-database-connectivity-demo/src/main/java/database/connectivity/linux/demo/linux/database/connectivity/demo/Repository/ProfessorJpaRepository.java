package database.connectivity.linux.demo.linux.database.connectivity.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import database.connectivity.linux.demo.linux.database.connectivity.demo.Model.Professor;

public interface ProfessorJpaRepository extends JpaRepository<Professor, Integer>{
    
}
