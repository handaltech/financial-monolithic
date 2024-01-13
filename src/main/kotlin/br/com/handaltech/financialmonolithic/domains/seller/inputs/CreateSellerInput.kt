package br.com.handaltech.financialmonolithic.domains.seller.inputs

data class CreateSellerInput(
    val fantasyName: String,
    val companyName: String,
    val cnpj: String
)
