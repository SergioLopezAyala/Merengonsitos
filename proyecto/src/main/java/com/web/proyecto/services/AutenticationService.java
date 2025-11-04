package com.web.proyecto.services;

import com.web.proyecto.dtos.LoginDto;
import com.web.proyecto.entities.Usuario;
import com.web.proyecto.repositories.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.*;
import java.util.*;

@Service
@RequiredArgsConstructor
public class AutenticationService {
    private final UsuarioRepository usuarioRepository;

    public boolean login(LoginDto loginDto) {
        List<Usuario> usuarios = usuarioRepository.findAll();
        boolean login = false;
        for (Usuario u : usuarios) {
            if (
                    u.getEmail()
                            .equals(loginDto.getEmail()) && u.getPassword().equals(loginDto.getPassword())
            ) {
                login = true;
                break;
            }
        }

        return login;

    }
}