package br.com.handaltech.financialmonolithic.infrastructure.database.repositories

import br.com.handaltech.financialmonolithic.infrastructure.database.entities.SellerEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface SellerRepository : JpaRepository<SellerEntity, String> {
}