package joaopaulofelipe.myapi;

import joaopaulofelipe.myapi.domain.Usuario;
import joaopaulofelipe.myapi.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class MyapiApplication implements CommandLineRunner {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public static void main(String[] args) {
        SpringApplication.run(MyapiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Usuario u1 = new Usuario(null, "Josy Frota", "josy", "123");
        Usuario u2 = new Usuario(null, "Felipe Souza", "felipe", "123");

        usuarioRepository.saveAll(Arrays.asList(u1, u2));

    }
}
