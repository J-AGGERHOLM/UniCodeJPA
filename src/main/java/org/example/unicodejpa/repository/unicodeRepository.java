package org.example.unicodejpa.repository;

import org.example.unicodejpa.model.Unicode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface unicodeRepository extends JpaRepository<Unicode,Integer> {


}
