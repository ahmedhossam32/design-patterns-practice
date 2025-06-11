package Facade;

public class Main {
    public static void main(String[] args)
    {
        Facade travelFacade = new Facade();
        travelFacade.DecemberPackageRome("Cairo", "ITA Airways",
                "Grand Roma", 4, "SUV", 5);

        System.out.println("\n=== ROMA PACKAGE ===");
        travelFacade.DecemberPackageRome("Cairo", "ITA Airways", "Grand Roma", 4, "SUV", 5);

        System.out.println("\n=== BARCELONA PACKAGE ===");
        travelFacade.BarcelonaSummerPackage("Cairo", "Vueling", "Hotel Barcelona Center", 3, "Compact", 4);
    }
}
