package ar.edu.uade.grupo1.backendadminconsorcios.controllers;

import ar.edu.uade.grupo1.backendadminconsorcios.models.Usuario;
import ar.edu.uade.grupo1.backendadminconsorcios.repositories.AdministradorRepository;
import ar.edu.uade.grupo1.backendadminconsorcios.repositories.UsuarioRepository;
import ar.edu.uade.grupo1.backendadminconsorcios.repositories.VivienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/usuarios")
public class UsuarioController {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    AdministradorRepository administradorRepository;

    @Autowired
    VivienteRepository vivienteRepository;

    @GetMapping(path = "/{username}")
    public Usuario getPersonaByUsername(
            @PathVariable(name = "username") String username
    ) {
        Usuario user = usuarioRepository.findUsuarioByUsername(username);

        switch (user.getRol()) {
            case "ADMIN":
                user.setAdministrador(administradorRepository.findAdministradorByUsuarioId(user.getId()));
                break;
            case "USER":
                user.setViviente(vivienteRepository.findVivienteByUsuarioId(user.getId()));
                break;
            case "INSPECTOR":
                System.out.println("Inspector");
                break;
            default:
                System.out.println("No se matcheo con ningun rol");
        }

        return user;
    }


}
