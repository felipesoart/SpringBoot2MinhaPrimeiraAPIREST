package joaopaulofelipe.myapi.resources;

import joaopaulofelipe.myapi.domain.Usuario;
import joaopaulofelipe.myapi.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.List;
import java.net.URI;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioResources {

    @Autowired
    private UsuarioService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Usuario> findById(@PathVariable Integer id){
        Usuario obj = this.service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping
    public ResponseEntity<List<Usuario>> findAll(){
        List<Usuario> list = this.service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Usuario> update(@PathVariable Integer id, @RequestBody Usuario obj){
        Usuario newObj = service.update(id,obj);
        return ResponseEntity.ok().body(newObj);
    }

    @PostMapping
    public  ResponseEntity<Usuario> create(@RequestBody Usuario obj){
        Usuario newObj = service.create(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newObj.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
