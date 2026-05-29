package br.sp.etec.sebrae.api_login.repositore

import br.sp.etec.sebrae.api_login.entity.Boleto
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BoletoRepository : JpaRepository<Boleto, Long> {
}