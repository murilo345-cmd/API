package br.sp.etec.sebrae.api_login.controller

import br.sp.etec.sebrae.api_login.entity.Login
import br.sp.etec.sebrae.api_login.entity.Usuario
import br.sp.etec.sebrae.api_login.repositore.UsuarioRepositore
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@CrossOrigin(origins = ["*"])
@Controller
class UsuarioController {

    @Autowired
    var repositore : UsuarioRepositore? = null

    @PostMapping("/cadastro")
    fun cadastrarUsuario(@RequestBody usuario: Usuario): ResponseEntity<Usuario> {
        return ResponseEntity.ok(repositore!!.save(usuario))
    }

    @PostMapping("/autenticar")
    fun autenticar(@RequestBody login : Login) : ResponseEntity<Boolean> {
        val usuario = repositore?.findByEmail(login.email)
        if (usuario != null && usuario.senha == login.senha) {
            return ResponseEntity.ok(true)
        }
        return ResponseEntity.ok(false)
    }
}
