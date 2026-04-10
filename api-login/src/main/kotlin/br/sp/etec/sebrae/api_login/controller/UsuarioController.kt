package br.sp.etec.sebrae.api_login.controller

import br.sp.etec.sebrae.api_login.entity.Usuario
import br.sp.etec.sebrae.api_login.repositore.UsuarioRepositore
import jakarta.annotation.PostConstruct
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@Controller
class UsuarioController {

    @Autowired
    var repositore : UsuarioRepositore? = null

    @PostMapping("/cadastro")
    fun cadastrarUsuario(@RequestBody usuario: Usuario): ResponseEntity<Usuario> {
        return ResponseEntity.ok(repositore!!.save(usuario))
    }
}