package br.com.handaltech.financialmonolithic.domains.seller.models

import java.time.LocalDateTime

data class SellerModel(
    val code: String,
    val fantasyName: String,
    val companyName: String,
    val cnpj: String,
    val active: Boolean,
    val createdAt: LocalDateTime,
    val createdBy: String,
    val lastModifiedAt: LocalDateTime,
    val lastModifiedBy: String
)
