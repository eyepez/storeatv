package com.pe.atvstore.restcontroller;

import com.pe.atvstore.model.Categoria;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/menu")
public class MenuRestController {

    @GetMapping("/listar")
    public ResponseEntity<Categoria> listarCategorias(@RequestParam(value = "page", defaultValue = "0") int page,
                                                      @RequestParam(value = "size", defaultValue = "10") int size,
                                                      @RequestParam(value = "sort", defaultValue = "ASC") String sort,
                                                      @RequestParam(value = "sortBy", defaultValue = "id") String sortBy) {
        Categoria categoria = new Categoria();
        categoria.setCatCcodCat("01");
        categoria.setCatCdesCat("Televisores");
        return ResponseEntity.ok(categoria);
    }
}
