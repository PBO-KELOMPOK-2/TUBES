package com.example.laptoprental.service;

import com.example.laptoprental.model.Penyewa;
import com.example.laptoprental.repository.PenyewaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PenyewaService {

    @Autowired
    private PenyewaRepository penyewaRepository;

    public List<Penyewa> getAllPenyewa() {
        return penyewaRepository.findAll();
    }

    public Penyewa register(Penyewa penyewa) {
        return penyewaRepository.save(penyewa);
    }

    public void deletePenyewa(Long id) {
        penyewaRepository.deleteById(id);
    }
}
