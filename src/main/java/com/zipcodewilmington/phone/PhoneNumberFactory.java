package com.zipcodewilmington.phone;

import com.zipcodewilmington.exceptions.InvalidPhoneNumberFormatException;
import com.zipcodewilmington.tools.RandomNumberFactory;

import java.util.Random;
import java.util.logging.Logger;

/**
 * Created by leon on 5/1/17.
 */
public final class PhoneNumberFactory {
    private static final Logger logger = Logger.getGlobal();

    private PhoneNumberFactory() {
        /** This constructor is private
         *  This class is uninstantiable */
    }

    /**
     * @param phoneNumberCount - number of PhoneNumber objects to instantiate
     * @return array of randomly generated PhoneNumber objects
     */ //TODO - Implement logic



    public static PhoneNumber[] createRandomPhoneNumberArray(int phoneNumberCount) {
        return null;
    }

    /**
     * @return an instance of PhoneNumber with randomly generated phone number value
     */ //TODO - Implement logic
    public static PhoneNumber createRandomPhoneNumber()  {


        Integer areacode = RandomNumberFactory.createInteger(100,999);
        Integer centralofficecode = RandomNumberFactory.createInteger(100,999);
        Integer phonelinecode = RandomNumberFactory.createInteger(1000,9999);





        return createPhoneNumberSafely(areacode ,centralofficecode,phonelinecode);




    }


    /**
     * @param areaCode          - 3 digit code
     * @param centralOfficeCode - 3 digit code
     * @param phoneLineCode     - 4 digit code
     * @return a new phone number object
     */ //TODO - if input is valid, return respective PhoneNumber object, else return null


    public static PhoneNumber createPhoneNumberSafely(int areaCode, int centralOfficeCode, int phoneLineCode)  {

        String mystring = "("+areaCode+")-"+centralOfficeCode+"-"+phoneLineCode;


        try {
            return createPhoneNumber(mystring);

        } catch (InvalidPhoneNumberFormatException e) {
            logger.info(mystring+"is not a valid phone number" );
            logger.info("Where"+mystring+ "will be replaced with the respective input parameter.");
        }
        return null;
    }

    /**
     * @param phoneNumberString - some String corresponding to a phone number whose format is `(###)-###-####`
     * @return a new phone number object
     * @throws InvalidPhoneNumberFormatException - thrown if phoneNumberString does not match acceptable format
     */ // TODO - Add throws statement to method signature
    public static PhoneNumber createPhoneNumber(String phoneNumberString) throws InvalidPhoneNumberFormatException {

        PhoneNumber myNumber = new PhoneNumber(phoneNumberString);
        logger.info("Attempting to create a new PhoneNumber object with a value of "+myNumber+ "where" + myNumber+" will be replaced with the respective input parameter" );

        return myNumber;
    }
}
