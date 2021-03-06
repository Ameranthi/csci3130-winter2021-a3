package ca.dal.cs.csci3130.a3;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.text.ParseException;

import ca.dal.cs.csci3130.a3.q1.IPromoOffer;
import ca.dal.cs.csci3130.a3.q1.PromoOfferSender;
import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.Silent.class)
public class PromoOfferSenderTest {


    static IPromoOffer offer = Mockito.mock(IPromoOffer.class);

    @BeforeClass
    public static void setup(){
        Mockito.when(offer.getOffer()).thenReturn("This is a cool offer!"); //mockito for getOffer()
        Mockito.when(offer.getExpiredDate()).thenReturn("2021-03-31"); //mockito for getExpiredDate();
    }


    @Test
    public void testSendOffer() throws ParseException {
        PromoOfferSender sender = new PromoOfferSender();
        sender.sendOffer(offer);
        assertEquals("This is a cool offer!", offer.getOffer());
        assertEquals("2021-03-31", offer.getExpiredDate());
        Mockito.verify(offer, Mockito.atLeastOnce()).getExpiredDate();
        Mockito.verify(offer, Mockito.atLeastOnce()).getOffer();
    }

}
