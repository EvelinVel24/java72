package main.java.com.tucompania.minibodegas.controllers;

import com.tucompania.minibodegas.models.MiniBodega;
import com.tucompania.minibodegas.services.MiniBodegaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/minibodegas")
public class MiniBodegaController {

    @Autowired
    private MiniBodegaService miniBodegaService;

    // Endpoint para listar todas las mini bodegas
    @GetMapping
    public List<MiniBodega> listarMiniBodegas() {
        return miniBodegaService.listarMiniBodegas();
    }

    // Endpoint para obtener una mini bodega por ID
    @GetMapping("/{id}")
    public MiniBodega obtenerMiniBodegaPorId(@PathVariable Long id) {
        return miniBodegaService.obtenerMiniBodegaPorId(id);
    }

    // Endpoint para crear una nueva mini bodega
    @PostMapping
    public MiniBodega crearMiniBodega(@RequestBody MiniBodega miniBodega) {
        return miniBodegaService.guardarMiniBodega(miniBodega);
    }

    // Endpoint para actualizar una mini bodega existente
    @PutMapping("/{id}")
    public MiniBodega actualizarMiniBodega(@PathVariable Long id, @RequestBody MiniBodega miniBodega) {
        return miniBodegaService.actualizarMiniBodega(id, miniBodega);
    }

    // Endpoint para eliminar una mini bodega
    @DeleteMapping("/{id}")
    public void eliminarMiniBodega(@PathVariable Long id) {
        miniBodegaService.eliminarMiniBodega(id);
    }
}
