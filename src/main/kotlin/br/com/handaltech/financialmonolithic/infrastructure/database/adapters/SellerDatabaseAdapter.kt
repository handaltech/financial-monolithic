package br.com.handaltech.financialmonolithic.infrastructure.database.adapters

import br.com.handaltech.financialmonolithic.domains.seller.inputs.CreateSellerInput
import br.com.handaltech.financialmonolithic.domains.seller.models.SellerModel
import br.com.handaltech.financialmonolithic.domains.seller.ports.SellerDatabasePort
import br.com.handaltech.financialmonolithic.infrastructure.database.entities.SellerEntity
import br.com.handaltech.financialmonolithic.infrastructure.database.repositories.SellerRepository
import org.springframework.stereotype.Component

@Component
class SellerDatabaseAdapter(
    private val sellerRepository: SellerRepository
) : SellerDatabasePort {
    override fun createSeller(input: CreateSellerInput): SellerModel =
        sellerRepository.save(SellerEntity(input))
            .toModel()
}