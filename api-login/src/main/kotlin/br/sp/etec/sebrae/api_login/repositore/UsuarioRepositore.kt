package br.sp.etec.sebrae.api_login.repositore

import br.sp.etec.sebrae.api_login.entity.Usuario
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UsuarioRepositore : JpaRepository<Usuario, Long> {
     fun findByEmail(email: String?) : Usuario

}