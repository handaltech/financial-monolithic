package br.com.handaltech.financialmonolithic.infrastructure.api.v1.resources

import br.com.handaltech.financialmonolithic.domains.seller.resources.CreateSeller
import br.com.handaltech.financialmonolithic.infrastructure.api.v1.requests.CreateSellerRequest
import br.com.handaltech.financialmonolithic.infrastructure.api.v1.responses.SellerResponse
import jakarta.validation.Valid
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController("/v1/sellers")
class SellerResources(
    private val createSeller: CreateSeller
) {
    @PostMapping
    fun create(
        @Valid @RequestBody request: CreateSellerRequest
    ): SellerResponse = request.toInput()
        .let { createSeller.execute(it) }
        .let { SellerResponse(it) }
}