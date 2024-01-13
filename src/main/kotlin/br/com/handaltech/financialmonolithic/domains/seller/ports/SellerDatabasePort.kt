package br.com.handaltech.financialmonolithic.domains.seller.ports

import br.com.handaltech.financialmonolithic.domains.seller.inputs.CreateSellerInput
import br.com.handaltech.financialmonolithic.domains.seller.models.SellerModel

interface SellerDatabasePort {
    fun createSeller(input: CreateSellerInput): SellerModel
}