package home_works.hw_2021_02_21.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompanyAndDeviceMain {

    private static final String OUTPUT_FILE_LOCATION = "/home/deimantas/IdeaProjects/SDA/testProjectCloning/JavaRemoteLT7/src/main/java/home_works/hw_2021_02_21/company/result.txt";

    public static void main(String[] args) {
        List<Company> companies = buildCompanyList();

        String mostExpensiveDevice = findMostExpensiveDevice(companies);
        List<Company> technologyCompanies = findTechnologyCompanies(companies);
        List<Device> mostExpensiveDevicesOfAllCompanies = findEachCompaniesMostExpensiveDevice(companies);

        writeResult(technologyCompanies, mostExpensiveDevice, mostExpensiveDevicesOfAllCompanies);
    }

    private static String findMostExpensiveDevice(List<Company> companies) {
        Device mostExpensiveDevice = companies.get(0).getDevices().get(0);
        for (Company company : companies) {
            for (Device device : company.getDevices()) {
                if (mostExpensiveDevice.getPrice() < device.getPrice()) {
                    mostExpensiveDevice = device;
                }
            }
        }
        return mostExpensiveDevice.toString();
    }

    private static List<Device> findEachCompaniesMostExpensiveDevice(List<Company> companies) {
        List<Device> devices = new ArrayList<>();
        for (Company company : companies) {
            Device mostExpensiveDevice = company.getDevices().get(0);
            for (Device device : company.getDevices()) {
                if (mostExpensiveDevice.getPrice() < device.getPrice()) {
                    mostExpensiveDevice = device;
                }
            }
            devices.add(mostExpensiveDevice);
        }
        return devices;
    }

    private static List<Company> findTechnologyCompanies(List<Company> companies) {
        List<Company> technologyCompanies = new ArrayList<>();
        for (Company company : companies) {
            if (company.getProductionType() == ProductionType.TECHNOLOGIES) {
                technologyCompanies.add(company);
            }
        }
        return technologyCompanies;
    }

    private static void writeResult(List<Company> techCompanies, String mostExpensiveDevice, List<Device> mostExpensiveDevicesOfAllCompanies) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(OUTPUT_FILE_LOCATION))) {
            bw.write("Brangiausia prekė: \n" + mostExpensiveDevice);

            bw.write("\n\nTechnologijų kompanijos: \n");
            for (Company company : techCompanies) {
                bw.write(company + "\n");
            }

            bw.write("\n\nBrangiausi divaisai: \n");
            for (Device device : mostExpensiveDevicesOfAllCompanies) {
                bw.write(device.toString() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Ivyko klaida irasant duomenis i faila");
        }
    }

    private static List<Company> buildCompanyList() {
        return Arrays.asList(
                new Company("Maxima", "Ukmerges g. 256, Vilnius", ProductionType.FOOD, Arrays.asList(
                        new Device("Varske", 2.43, 14, "pusriebe varske"),
                        new Device("Duona", 1.12, 31, "sviesi duona")
                )),
                new Company("Volkswagen", "Gatvagen g. 12, Germany", ProductionType.AUTOMOBILES, Arrays.asList(
                        new Device("Golf", 23543.00, 433112, "kompaktiskas automobilis"),
                        new Device("Arteon", 35553.31, 234132, "sportiskas automobilis"),
                        new Device("Tuareg", 55.889, 42342424, "visureigis")
                )),
                new Company("Logitech", "Laisves pr. 1, Kaunas", ProductionType.TECHNOLOGIES, Arrays.asList(
                        new Device("G07", 123, 412321, "zaidimu pele"),
                        new Device("MX15", 43.11, 3423212, "zaidimu pele")
                )),
                new Company("Senukai", "Zirmunu g. 54, Vilnius", ProductionType.GARDEN_TOOLS, Arrays.asList(
                        new Device("Bosh", 45.99, 4432, "kampinis slifuoklis"),
                        new Device("Makita", 283.41, 15512, "drele")
                )),
                new Company("Steelseries", "Street st. 9882, Stockholm", ProductionType.TECHNOLOGIES, Arrays.asList(
                        new Device("Xai", 250, 11321, "zaidimu pele"),
                        new Device("Sensei", 410.31, 2512, "zaidimu pele")
                ))
        );
    }
}
