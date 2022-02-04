package com.patika.software.principle.association;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

//Nesneler arasında olan zayıf ve bağımsız ilişkidir.
//Süper market müşteri olmadan da var olur.

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Log4j2
public class SuperMarket {

    private String süperMarketAd;
    private String süperMarketSehir;

}
