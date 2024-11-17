package io.alapierre.jackson;

import lombok.Data;

/**
 * @author Adrian Lapierre {@literal al@alapierre.io}
 * Copyrights by original author 17.11.2024
 */
@Data
public class SalesInvoiceCreateDto implements CreateInvoiceRequest {

    private String docType;

    private String seller;

    private String buyer;

}
