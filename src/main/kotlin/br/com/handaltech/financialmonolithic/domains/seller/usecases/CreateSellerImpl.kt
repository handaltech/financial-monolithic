package br.com.handaltech.financialmonolithic.domains.seller.usecases

import br.com.handaltech.financialmonolithic.domains.seller.inputs.CreateSellerInput
import br.com.handaltech.financialmonolithic.domains.seller.models.SellerModel
import br.com.handaltech.financialmonolithic.domains.seller.ports.SellerDatabasePort
import br.com.handaltech.financialmonolithic.domains.seller.resources.CreateSeller
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class CreateSellerImpl(
    private val sellerDatabasePort: SellerDatabasePort
) : CreateSeller {
    @Transactional
    override fun execute(input: CreateSellerInput): SellerModel =
        sellerDatabasePort.createSeller(input)
}