package joaopaulofelipe.myapi.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import joaopaulofelipe.myapi.domain.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
