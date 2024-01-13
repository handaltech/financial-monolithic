package br.com.handaltech.financialmonolithic.infrastructure.api.v1.requests

import br.com.handaltech.financialmonolithic.domains.seller.inputs.CreateSellerInput
import jakarta.validation.constraints.NotBlank
import org.hibernate.validator.constraints.br.CNPJ

data class CreateSellerRequest(
    @field:NotBlank
    val fantasyName: String,
    @field:NotBlank
    val companyName: String,
    @field:CNPJ
    val cnpj: String
) {
    fun toInput() = CreateSellerInput(
        fantasyName = fantasyName,
        companyName = companyName,
        cnpj = cnpj
    )
}
