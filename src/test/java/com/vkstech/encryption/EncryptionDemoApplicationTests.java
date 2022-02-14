package com.vkstech.encryption;

import com.vkstech.encryption.entity.CardDetail;
import com.vkstech.encryption.repository.CardDetailRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EncryptionDemoApplicationTests {

    @Autowired
    private CardDetailRepository cardDetailRepository;

    @Test
    void contextLoads() {
    }


    @Test
    void insertData() {
        CardDetail cardDetail = new CardDetail();
        cardDetail.setCardHolderName("VKSTECH");
        cardDetail.setCvv(123);
        cardDetail.setAmount(100.0);
        cardDetail.setIsActive(false);

        cardDetailRepository.save(cardDetail);
    }

    @Test
    void retrieveData() {
        CardDetail cardDetail = cardDetailRepository.findById(1).get();
        System.out.println(cardDetail);
    }

}
