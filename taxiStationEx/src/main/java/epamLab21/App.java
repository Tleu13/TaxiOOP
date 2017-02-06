package epamLab21;

import epamLab21.services.TaxiStation;

/**
 * Hello JavaLab21!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        TaxiStation taxiStation1 = new TaxiStation("9 region");

        taxiStation1.addTaxiToStation("lada sedan",1.6,1999,149,60,350_000,6);
        taxiStation1.addTaxiToStation("toyta camry",2.5,2013,656,240,5_500_000,11);
        taxiStation1.addTaxiToStation("aston martin DB11",5.0,2012,777,360,30_000_000,21);
        taxiStation1.addTaxiToStation("bmw m2",2.0,2005,109,220,4_000_000,14);

        System.out.println(taxiStation1.getName());

        System.out.println(taxiStation1.getValueOfTaxiStation());

        taxiStation1.showCarsByPetrolConsumption();


        taxiStation1.findCarBySpeedRange(20,40);

        taxiStation1.findCarBySpeedRange(300,390);

        System.out.println(taxiStation1.getTaxiByLicencePlate(777).getFare(2,2));
        System.out.println(taxiStation1.getTaxiByLicencePlate(109).getFare(2,2));
        System.out.println(taxiStation1.getTaxiByLicencePlate(149).getFare(2,2));


    }
}
