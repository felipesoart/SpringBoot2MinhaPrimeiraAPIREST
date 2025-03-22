package joaopaulofelipe.myapi.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;
import java.util.Objects;

@Entity
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty(message = "Campo Nome é mandatório")
    @Length(min = 3,max = 100,message = "O Nome deve ter entre 3 a 100 caracteres")
    private String nome;
    @NotEmpty(message = "Campo Login é mandatório")
    @Length(min = 3,max = 100,message = "O Login deve ter entre 3 a 100 caracteres")
    private String login;
    @NotEmpty(message = "Campo Senha é mandatório")
    @Length(min = 3,max = 100,message = "O Senha deve ter entre 3 a 100 caracteres")
    private String senha;

    public Usuario() {
        super();
    }

    public Usuario(Integer id, String nome, String login, String senha) {
        this.id = id;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(id, usuario.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
