package br.com.handaltech.financialmonolithic.infrastructure.api.v1.responses

import br.com.handaltech.financialmonolithic.domains.seller.models.SellerModel
import java.time.LocalDateTime

data class SellerResponse(
    val code: String,
    val fantasyName: String,
    val companyName: String,
    val cnpj: String,
    val active: Boolean,
    val createdAt: LocalDateTime,
    val createdBy: String,
    val lastModifiedAt: LocalDateTime,
    val lastModifiedBy: String
) {
    constructor(model: SellerModel) : this(
        code = model.code,
        fantasyName = model.fantasyName,
        companyName = model.companyName,
        cnpj = model.cnpj,
        active = model.active,
        createdAt = model.createdAt,
        createdBy = model.createdBy,
        lastModifiedAt = model.lastModifiedAt,
        lastModifiedBy = model.lastModifiedBy
    )
}
