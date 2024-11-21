package main.java.com.tucompania.minibodegas.services;

import com.tucompania.minibodegas.models.MiniBodega;
import com.tucompania.minibodegas.repositories.MiniBodegaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MiniBodegaService {

    @Autowired
    private MiniBodegaRepository miniBodegaRepository;

    public MiniBodega guardarMiniBodega(MiniBodega bodega) {
        return miniBodegaRepository.save(bodega);
    }
}
