package io.alapierre.jackson;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Adrian Lapierre {@literal al@alapierre.io}
 * Copyrights by original author 17.11.2024
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class CurrencyInvoiceCreateDto extends SalesInvoiceCreateDto implements CreateInvoiceRequest {

    private String currency;

}
