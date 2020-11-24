package ar.edu.uade.grupo1.backendadminconsorcios.controllers;

import ar.edu.uade.grupo1.backendadminconsorcios.models.Usuario;
import ar.edu.uade.grupo1.backendadminconsorcios.repositories.AdministradorRepository;
import ar.edu.uade.grupo1.backendadminconsorcios.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/usuarios")
public class UsuarioController {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    AdministradorRepository administradorRepository;

    @GetMapping(path = "/{username}")
    public Usuario getUsuarioByUsername(@PathVariable(name = "username") String username) {
        return usuarioRepository.findUsuarioByUsername(username);
    }

    @GetMapping(path = "/{username}/login")
    public Usuario getPersonaByUsername(@PathVariable(name ="username") String username) {
        Usuario user = usuarioRepository.findUsuarioByUsername(username);

        if (user.getRol() == "ADMIN") {
           user.setAdministrador(administradorRepository.findAdministradorByUsuarioId(user.getId()));
        }

        return user;
    }


}
