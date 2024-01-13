package br.com.handaltech.financialmonolithic.domains.seller.resources

import br.com.handaltech.financialmonolithic.domains.seller.inputs.CreateSellerInput
import br.com.handaltech.financialmonolithic.domains.seller.models.SellerModel

interface CreateSeller {
    fun execute(input: CreateSellerInput): SellerModel
}