package io.alapierre.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.val;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Adrian Lapierre {@literal al@alapierre.io}
 * Copyrights by original author 17.11.2024
 */
public class TestPolimorfizm {

    ObjectMapper objectMapper = new ObjectMapper();

    @Test
    void toJson() throws Exception {

        val currencyInvoice = new CurrencyInvoiceCreateDto();
        currencyInvoice.setCurrency("EUR");
        currencyInvoice.setBuyer("buyer");
        currencyInvoice.setSeller("seller");

        val res = objectMapper.writeValueAsString(currencyInvoice);

        System.out.println(res);

    }

    @Test
    void fromJsonCurrency() throws Exception {

        String json = """
                {
                    "docType":"FW",
                    "seller":"seller",
                    "buyer":"buyer",
                    "currency":"EUR"
                }
                """;

        val res = objectMapper.readValue(json, CreateInvoiceRequest.class);

        System.out.println(res.getClass().getSimpleName());

        Assertions.assertInstanceOf(CurrencyInvoiceCreateDto.class,res);

    }

    @Test
    void fromJsonSales() throws Exception {

        String json = """
                {
                    "docType":"FS",
                    "seller":"seller",
                    "buyer":"buyer"
                }
                """;

        val res = objectMapper.readValue(json, CreateInvoiceRequest.class);

        System.out.println(res.getClass().getSimpleName());

        Assertions.assertInstanceOf(SalesInvoiceCreateDto.class,res);
    }

}
