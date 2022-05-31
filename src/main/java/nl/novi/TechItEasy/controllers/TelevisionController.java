package nl.novi.TechItEasy.controllers;

import nl.novi.TechItEasy.models.Television;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TelevisionController {

    @GetMapping(value = "televisions")
    public ResponseEntity<Object> getTelevisions(){
        return ResponseEntity.ok();
    }

    @GetMapping(value = "televisions/{id}")
    public ResponseEntity<Object> getTelevision(int id){
        return ResponseEntity.ok();
    }

    @PostMapping(value = "/televisions")
    public ResponseEntity<Object> addTelevision(Television television){
        ResponseEntity.created();
    }

    @PutMapping(value = "televisions/{id}")
    public ResponseEntity<Object> replaceTelevision(int id, Television television){
        ResponseEntity.noContent().build();
    }

    @DeleteMapping(value = "/televisions/{id}")
    public ResponseEntity<Object> removeTelevision(int id){
        return ResponseEntity.noContent().build();
    }
}
