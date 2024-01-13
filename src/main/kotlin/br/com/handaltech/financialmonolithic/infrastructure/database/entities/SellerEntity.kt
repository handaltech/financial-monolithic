package br.com.handaltech.financialmonolithic.infrastructure.database.entities

import br.com.handaltech.financialmonolithic.domains.seller.inputs.CreateSellerInput
import br.com.handaltech.financialmonolithic.domains.seller.models.SellerModel
import jakarta.persistence.*
import org.hibernate.envers.Audited
import org.springframework.data.annotation.CreatedBy
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedBy
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime
import java.util.*

@Entity
@Audited
@Table(name = "seller")
@EntityListeners(AuditingEntityListener::class)
data class SellerEntity(
    @Id
    @Column(name = "code")
    val code: String,
    @Column(name = "fantasy_name")
    val fantasyName: String,
    @Column(name = "company_name")
    val companyName: String,
    @Column(name = "cnpj")
    val cnpj: String,
    @Column(name = "active")
    val active: Boolean,
    @CreatedDate
    @Column(name = "created_at")
    val createdAt: LocalDateTime? = null,
    @CreatedBy
    @Column(name = "created_by")
    val createdBy: String? = null,
    @LastModifiedDate
    @Column(name = "last_modified_at")
    val lastModifiedAt: LocalDateTime? = null,
    @LastModifiedBy
    @Column(name = "last_modified_by")
    val lastModifiedBy: String? = null
) {
    constructor(input: CreateSellerInput) : this(
        code = UUID.randomUUID().toString(),
        fantasyName = input.fantasyName,
        companyName = input.companyName,
        cnpj = input.cnpj,
        active = true
    )

    fun toModel() = SellerModel(
        code = code,
        fantasyName = fantasyName,
        companyName = companyName,
        cnpj = cnpj,
        active = active,
        createdAt = createdAt!!,
        createdBy = createdBy!!,
        lastModifiedAt = lastModifiedAt!!,
        lastModifiedBy = lastModifiedBy!!
    )
}
