package ca.dal.cs.csci3130.a3.q1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class PromoOfferSender {
    public void sendOffer(IPromoOffer offer) throws ParseException {

        String expiredDateString = offer.getExpiredDate();
        Date expiredDate = convertToDate(expiredDateString);

        Date date = Calendar.getInstance().getTime();
        if (date.before(expiredDate)) {
            String offerDetails = offer.getOffer();
            //details code for sending the offer
        }
    }

    public Date convertToDate(String dateString) throws ParseException {
        Date convertedDate = null;
        //convert the date string to a date class!
        convertedDate = new SimpleDateFormat("yyyy-mm-dd").parse(dateString);
        return convertedDate;
    }

}
