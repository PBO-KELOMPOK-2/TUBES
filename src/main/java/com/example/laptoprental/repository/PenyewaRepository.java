package com.example.laptoprental.repository;

import com.example.laptoprental.model.Penyewa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PenyewaRepository extends JpaRepository<Penyewa, Long> {
}
