package Java_Project;

import java.util.Scanner;
import java.util.ArrayList;

import static Java_Project.Olive_Dinner.order.total;
import static java.lang.Thread.sleep;


// Constructor
class Payment_Card {
    String A1;
    String A2;
    String A3;

    public Payment_Card(String A1, String A2, String A3) {
        this.A1 = A1;
        this.A2 = A2;
        this.A3 = A3;
    }

    public static void Payment_Card() {
        Scanner o = new Scanner(System.in);
        Payment_Card Pay_Card = new Payment_Card("--►Please Enter Card Numbers :",
                "--►Enter Your Pin :",
                "Processing Your Payment...");
        Add.Add();
        System.out.println(Pay_Card.A1);
        long Card = o.nextLong();
        System.out.println();
        System.out.println(Pay_Card.A2);
        int pin = o.nextInt();
        System.out.println();
        System.out.println(Pay_Card.A3);
        System.out.println("Please Wait!");
        System.out.print("Loading");
        try {
            for (int i = 0; i < 7; i++) {
                Thread.sleep(300);
                System.out.print(". ");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println();
        ZERO_Beer.generateBill_Beer();
        System.out.println("Total Payable Amount: " + total + " ₹ " + " Successfully Paid\n");
        System.out.println("\nYour Card Transaction Successfully Done.\n");
        System.out.println("Please Wait!");
        System.out.print("Loading.");
        try {
            for (int i = 0; i < 7; i++) {
                Thread.sleep(300);
                System.out.print(". ");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println();
        System.out.println("\nYour Order Place Successfully \n");
        System.out.println();
        System.out.println("Searching For Delivery Boy.");
        System.out.print("Loading.");
        try {
            for (int i = 0; i < 8; i++) {
                Thread.sleep(400);
                System.out.print(". ");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println();
        System.out.println("Delivery Boy Name   : Rahul Codingwala");
        System.out.println("Delivery Boy No     : 4648551285 ");
        System.out.println("Delivery Boy Rating : 4.5 ");
        System.out.println("\nYour Order Will Be Deliver Within a 15 to 20  mints ..\n");
    }
}

class Add {
    public static void Add() {
        Scanner no = new Scanner(System.in);
        System.out.println("Enter Your Delivery Address : ");
        String add = no.nextLine();
        System.out.println("Confirm Your Delivery Address : ");
        String adds = no.nextLine();

        if (add.equals(adds)) {
            System.out.println("Address Confirm");
            System.out.println("Please Wait!");
            System.out.print("Loading.");
            try {
                for (int i = 0; i < 7; i++) {
                    Thread.sleep(300);
                    System.out.print(". ");
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        else {
            Add.Add();
        }
    }
}

class Payment_Online {
    public static void Payment_Online() {
        Scanner o = new Scanner(System.in);
        Payment_Card Pay_Online = new Payment_Card("\n--►Please Enter Your UPI Id :",
                "--►Enter Your  UPI Pin :",
                "Processing Your Payment...");
        Add.Add();
        System.out.println(Pay_Online.A1);
        String upi = o.nextLine();
        System.out.println();
        System.out.println(Pay_Online.A2);
        int pin = o.nextInt();
        System.out.println();
        System.out.println(Pay_Online.A3);
        System.out.println("Please Wait!");
        System.out.print("Loading.");
        try {
            for (int i = 0; i < 7; i++) {
                Thread.sleep(300);
                System.out.print(". ");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println();
        ZERO_Beer.generateBill_Beer();
        System.out.println("Total Payable Amount: " + total + " ₹ " + " Successfully Paid");
        System.out.println("\nYour UPI Transaction Successfully Done.\n");
        System.out.println("Please Wait!");
        System.out.print("Loading.");
        try {
            for (int i = 0; i < 7; i++) {
                Thread.sleep(300);
                System.out.print(". ");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println();
        System.out.println("\nYour Order Place Successfully \n");
        System.out.println();
        System.out.println("Searching For Delivery Boy.");
        System.out.print("Loading.");
        try {
            for (int i = 0; i < 8; i++) {
                Thread.sleep(400);
                System.out.print(". ");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println();
        System.out.println("Delivery Boy Name   : Rahul Codingwala");
        System.out.println("Delivery Boy No     : 4648551285 ");
        System.out.println("Delivery Boy Rating : 4.5 ");

        System.out.println("\nYour Order Will Be Deliver Within a 15 to 20  mints ..\n");
    }
}

class Payment_Method {
    public static void Payment_Method() {
        System.out.println();
        System.out.println("Choose Payment Method ");
        System.out.println("1 : Enter For Card Payment ");
        System.out.println("2 : Enter For UPI Payment  ");
        Scanner no = new Scanner(System.in);
        int n = no.nextInt();
        switch (n) {
            case 1:
                System.out.println();
                Payment_Card.Payment_Card();
                break;
            case 2:
                System.out.println();
                Payment_Online.Payment_Online();
        }
    }
}

class Banner {
    public static void Banner() {
        System.out.println("-------------------------------------------------------------------");
        System.out.println("                   \uD835\uDCE6\uD835\uDCEE\uD835\uDCF5\uD835\uDCEC\uD835\uDCF8\uD835\uDCF6\uD835\uDCEE \uD835\uDCE3\uD835\uDCF8 \uD835\uDCD5\uD835\uDCF8\uD835\uDCF8\uD835\uDCED \uD835\uDCD3\uD835\uDCEE\uD835\uDCF5\uD835\uDCF2\uD835\uDCFF\uD835\uDCEE\uD835\uDCFB\uD835\uDD02 \uD835\uDCD0\uD835\uDCF9\uD835\uDCF9");
        System.out.println("                     \uD835\uDD40ℕ\uD835\uDD3B\uD835\uDD40\uD835\uDD38ℕ-ℝ\uD835\uDD3C\uD835\uDD4A\uD835\uDD4B\uD835\uDD38\uD835\uDD4Cℝ\uD835\uDD38ℕ\uD835\uDD4B \uD835\uDD38ℕ\uD835\uDD3B \uD835\uDD39\uD835\uDD38ℝ                   ");
        System.out.println("-------------------------------------------------------------------");
    }
}

class Olive_Banner {
    public static void Olive_Banner() {
        System.out.println();
        System.out.println("===================================================================");
        System.out.println("=============== \uD83D\uDD25 Most Welcome to All Of You \uD83D\uDD25   ================");
        System.out.println("==============           Olive Restaurant            ==============");
        System.out.println("============================= WARDHA ==============================");
        System.out.println();
    }
}

class Gulshan_Banner {
    public static void Gulshan_Banner() {
        System.out.println();
        System.out.println("===================================================================");
        System.out.println("=============== \uD83D\uDD25 Most Welcome to All Of You \uD83D\uDD25   ================");
        System.out.println("==============           Gulshan Restaurant          ==============");
        System.out.println("============================= WARDHA ==============================");
        System.out.println();
    }
}

class S_CUBE_Banner {
    public static void S_CUBE_Banner() {
        System.out.println();
        System.out.println("===================================================================");
        System.out.println("=============== \uD83D\uDD25 Most Welcome to All Of You \uD83D\uDD25   ================");
        System.out.println("==============            S CUBE Restaurant          ==============");
        System.out.println("============================= WARDHA ==============================");
        System.out.println();
    }
}

class Shahi_Daawat_Banner {
    public static void Shahi_Daawat_Banner() {
        System.out.println();
        System.out.println("===================================================================");
        System.out.println("=============== \uD83D\uDD25 Most Welcome to All Of You \uD83D\uDD25   ================");
        System.out.println("==============         Shahi Daawat Restaurant       ==============");
        System.out.println("============================= WARDHA ==============================");
        System.out.println();
    }
}

class ZERO {
    public static void ZERO() {
        System.out.println();
        System.out.println("===================================================================");
        System.out.println("=============== \uD83D\uDD25 Most Welcome to All Of You \uD83D\uDD25   ================");
        System.out.println("==============        ZERO DEGREE THE BOUTIQUE       ==============");
        System.out.println("============================= WARDHA ==============================");
        System.out.println();
    }
}

class JALSA_Banner {
    public static void JALSA_Banner() {
        System.out.println();
        System.out.println("===================================================================");
        System.out.println("=============== \uD83D\uDD25 Most Welcome to All Of You \uD83D\uDD25   ================");
        System.out.println("==============                   JALSA BAR           ==============");
        System.out.println("================================   WARDHA    ======================");
        System.out.println();
    }
}

class COCKTAIL_Banner {
    public static void COCKTAIL_Banner() {
        System.out.println();
        System.out.println("===================================================================");
        System.out.println("=============== \uD83D\uDD25 Most Welcome to All Of You \uD83D\uDD25   ================");
        System.out.println("==============                 COCKTAIL BAR          ==============");
        System.out.println("================================   WARDHA    ======================");
        System.out.println();
    }
}


class Select {
    public static void Select() {
        Banner.Banner();
        System.out.println();
        System.out.println("Select The Restaurant");
        System.out.println();

        ArrayList<String> m = new ArrayList<>();
        m.add("1 : Olive Restaurant ");
        m.add("2 : Gulshan Restaurant");
        m.add("3 : S CUBE Restaurant ");
        m.add("4 : Shahi Daawat Restaurant");
        m.add("5 : Back To The Main ");
        for (Object obj : m) {
            System.out.println(obj);
        }
        Scanner se = new Scanner(System.in);
        int n = se.nextInt();
        System.out.println();

        //---- Switch For Restaurant------

        switch (n) {
            case 1:
                System.out.println();
                System.out.println("You have Selected Olive Restaurant");
                Olive_Food.Olive_Food();
                break;
            case 2:
                System.out.println();
                System.out.println("You have Selected Gulshan Restaurant");
                Gulshan_Food.Gulshan_Food();
                break;
            case 3:
                System.out.println();
                System.out.println("You have Selected S CUBE Restaurant");
                S_CUBE_Food.S_CUBE_Food();
                break;
            case 4:
                System.out.println("You have Selected Shahi Daawat Restaurant");
                Shahi_Daawat_Food.Shahi_Daawat_Food();
                break;
            case 5:
                Start.Start();
            default:
                System.out.println();
                System.out.println("Invalid Enter .. Please Select Correct Number");
                Select.Select();
                break;
        }
    }
}


class Olive_Food {

    //----- Olive_Food Method -----
    public static void Olive_Food() {
        Olive_Banner.Olive_Banner();

        System.out.println("1 : Breakfast");
        System.out.println("2 : Food ");
        System.out.println("3 : Back To The Main ");
        Scanner o = new Scanner(System.in);
        int Olive = o.nextInt();

        //------ Switch For Olive_Food -----
        switch (Olive) {
            case 1:
                System.out.println();
                System.out.println("You have Selected Breakfast");
                Olive_Breakfast.Olive_Breakfast();
                break;
            case 2:
                System.out.println();
                System.out.println("You have Selected Food");
                Olive_Dinner.Olive_Dinner();
                break;
            case 3:
                Start.Start();
            default:
                System.out.println();
                System.out.println("Invalid Enter .. Please Select Correct Number");
                Olive_Food.Olive_Food();
                break;
        }


    }

}

// ------ Olive_Breakfast Menu ------

// -------Hierarchical Inheritance -------
class Olive_Breakfast extends Olive_Food {

    public static void Olive_Breakfast() {
        //Olive_Breakfast
        ArrayList<String> b = new ArrayList<>();
        b.add("---------------------------------------------------------");
        b.add("******************** Breakfast **************************");
        b.add("---------------------------------------------------------");
        b.add("   Breakfast_List           Full_Plate       Half_Plate  ");
        b.add("---------------------------------------------------------");
        b.add("1   : Tari Poha                30 ₹           20 ₹       ");
        b.add("2   : Uthpa                    30 ₹           20 ₹       ");
        b.add("3   : Dosa                     30 ₹           --         ");
        b.add("4   : Mendu Vada               30 ₹           --         ");
        b.add("5   : Chole Bhature            60 ₹           --         ");
        b.add("---------------------------------------------------------");

        for (Object obj : b) {
            System.out.println(obj);
        }
        order_breakfast.order_breakfast();
    }


    class order_breakfast {
        public static void order_breakfast() {
            System.out.println("Enter Your Choice Breakfast");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();
            String again;
            switch (ch) {
                case 1:// Tari_poha
                    System.out.println("You have Selected Tari_poha");
                    System.out.println();
                    System.out.println("Enter the Choice : ");
                    System.out.println("1 : Choose Full Plate");
                    System.out.println("2 : Choose Half Plate");
                    Scanner s = new Scanner(System.in);
                    int c = s.nextInt();
                    int quantity;
                    switch (c) {
                        case 1:
                            System.out.println(" Full Plate --- 30 ₹ ");
                            System.out.println("Enter the Choose Quantity : ");
                            quantity = sc.nextInt();
                            int Tari_poha = 30;
                            total = total + quantity * Tari_poha;
                            break;
                        case 2:
                            System.out.println(" Half Plate --- 20 ₹ ");
                            System.out.println("Enter the Choose Quantity : ");
                            quantity = sc.nextInt();
                            int Tari_poha_half = 20;
                            total = total + quantity * Tari_poha_half;
                            break;
                        default:
                            System.out.println("Invalid Enter .. Please Select Correct Number");
                            order_breakfast.order_breakfast();
                            break;
                    }
                    System.out.print("Do you wish to order anything else (Y/N) : ");
                    again = sc.next();
                    if (again.equalsIgnoreCase("Y")) {
                        Olive_Breakfast.Olive_Breakfast();
                        order_breakfast();
                    } else if (again.equalsIgnoreCase("N")) {
                        Payment_Method.Payment_Method();
                        System.out.println(" Enter For Main 'Y'");
                        System.out.println(" Enter For Exit 'N' ");
                        sc = new Scanner(System.in);
                        char b = sc.next().charAt(0);
                        if (b == 'Y' || b == 'y') {
                            Start.Start();
                        } else {
                            System.out.println("Thanks Yor Visit Again \uD83D\uDE4F\uD83D\uDE4F");
                            System.exit(1);
                        }
                    } else {
                        System.out.println("Invalid Choice");
                        order_breakfast.order_breakfast();

                    }
                case 2:// Uthpa
                    System.out.println("You have Selected Uthpa");
                    System.out.println();
                    System.out.println("Enter the Choice : ");
                    System.out.println("1 : Choose Full Plate");
                    System.out.println("2 : Choose Half Plate");
                    Scanner d = new Scanner(System.in);
                    int k = d.nextInt();
                    switch (k) {
                        case 1:
                            System.out.println(" Full Plate --- 30 ₹ ");
                            System.out.println("Enter the Choose Quantity : ");
                            quantity = sc.nextInt();
                            int Uthpa = 30;
                            total = total + quantity * Uthpa;
                            break;
                        case 2:
                            System.out.println(" Half Plate --- 20 ₹ ");
                            System.out.println("Enter the Choose Quantity : ");
                            quantity = sc.nextInt();
                            int Uthpa_half = 20;
                            total = total + quantity * Uthpa_half;
                            break;
                        default:
                            System.out.println("Invalid Enter .. Please Select Correct Number");
                            order_breakfast.order_breakfast();
                            break;
                    }
                    System.out.print("Do you wish to order anything else (Y/N) : ");
                    again = sc.next();
                    if (again.equalsIgnoreCase("Y")) {
                        Olive_Breakfast.Olive_Breakfast();
                        order_breakfast();
                    } else if (again.equalsIgnoreCase("N")) {
                        Payment_Method.Payment_Method();
                        System.out.println(" Enter For Main 'Y'");
                        System.out.println(" Enter For Exit 'N' ");
                        sc = new Scanner(System.in);
                        char b = sc.next().charAt(0);
                        if (b == 'Y' || b == 'y') {
                            Start.Start();
                        } else {
                            System.out.println("Thanks Yor Visit Again \uD83D\uDE4F\uD83D\uDE4F");
                            System.exit(1);
                        }
                    } else {
                        System.out.println("Invalid Choice");
                        order_breakfast.order_breakfast();
                    }

                case 3:// Dosa
                    System.out.println("You have Selected Dosa");
                    System.out.println();
                    System.out.println("Enter the Choose Quantity : ");
                    quantity = sc.nextInt();
                    int Dosa = 30;
                    total = total + quantity * Dosa;
                    break;
                case 4:// Mendu_vada
                    System.out.println(" Full Plate --- 30 ₹ ");
                    System.out.println("You have Selected Mendu_Vada");
                    System.out.println();
                    System.out.println("Enter the Choose Quantity : ");
                    quantity = sc.nextInt();
                    int Mendu_Vada = 30;
                    total = total + quantity * Mendu_Vada;
                    break;
                case 5:// Chole_Bhature
                    System.out.println("You have Selected Chole_Bhature");
                    System.out.println();
                    System.out.println(" Full Plate --- 60 ₹ ");
                    System.out.println("Enter the Choose Quantity : ");
                    quantity = sc.nextInt();
                    int Chole_Bhature = 60;
                    total = total + quantity * Chole_Bhature;
                    break;
                default:
                    System.out.println("Invalid Enter .. Please Select Correct Number");
                    order_breakfast.order_breakfast();
                    break;
            }
            System.out.print("Do you wish to order anything else (Y/N) : ");
            again = sc.next();
            if (again.equalsIgnoreCase("Y")) {
                Olive_Breakfast.Olive_Breakfast();
                order_breakfast();
            } else if (again.equalsIgnoreCase("N")) {

                Payment_Method.Payment_Method();
                System.out.println(" Enter For Main 'Y'");
                System.out.println(" Enter For Exit 'N' ");
                sc = new Scanner(System.in);
                char b = sc.next().charAt(0);
                if (b == 'Y' || b == 'y') {
                    Start.Start();
                } else {
                    System.out.println("Thanks Yor Visit Again \uD83D\uDE4F\uD83D\uDE4F");
                    System.exit(1);
                }

            } else {
                System.out.println("Invalid Choice");
                order_breakfast.order_breakfast();
            }
        }

    }
}


class Olive_Dinner extends Olive_Food {


    {
        Olive_Banner.Olive_Banner();
    }

    public static void Olive_Dinner() {

        ArrayList<String> b = new ArrayList<>();
        b.add("-----------------------------------------------------------");
        b.add("::::::::::::::::::::::::::: VEG :::::::::::::::::::::::::::");
        b.add("-----------------------------------------------------------");
        b.add("      Dinner_List            Full_Plate      Half_Plate    ");
        b.add("-----------------------------------------------------------");
        b.add("1  : Paneer Butter Masala       250  ₹        180 ₹        ");
        b.add("2  : Sahi Paneer                220 ₹         160 ₹        ");
        b.add("3  : Paneer Kadai               230 ₹         180 ₹        ");
        b.add("4  : Tawa Paneer                180 ₹         140 ₹        ");
        b.add("-----------------------------------------------------------");

        b.add("::::::::::::::::::::::: NON-VEG :::::::::::::::::::::::::::");
        b.add("-----------------------------------------------------------");
        b.add("      Dinner_List            Full_Plate      Half_Plate    ");
        b.add("-----------------------------------------------------------");
        b.add("5 : Chiken Kolapuri            450  ₹         260 ₹        ");
        b.add("6 : Chiken Savji               500  ₹         300 ₹        ");
        b.add("7 : Muttan Kolapuri            960  ₹         500 ₹        ");
        b.add("8 : Muttan Savji               1100 ₹         620 ₹        ");
        b.add("-----------------------------------------------------------");
        for (Object obj : b) {
            System.out.println(obj);
        }
        order.order();
    }


    class order {
        static int total;

        //Breakfast
        public static void order() {
            System.out.println("Enter Your Choice Food");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();
            switch (ch) {

                case 1:// Paneer_Butter_Masala
                    System.out.println("You have Selected Paneer_Butter_Masala");
                    System.out.println();
                    System.out.println("Enter the Choice : ");
                    System.out.println("1 : Choose Full Plate");
                    System.out.println("2 : Choose Half Plate");
                    Scanner PBM = new Scanner(System.in);
                    int p = PBM.nextInt();
                    int quantity;
                    switch (p) {
                        case 1:
                            System.out.println(" Full Plate --- 250 ₹ ");
                            System.out.println("Enter the Choose Quantity : ");
                            quantity = sc.nextInt();
                            int Paneer_Butter_Masala = 250;
                            total = total + quantity * Paneer_Butter_Masala;
                            break;
                        case 2:
                            System.out.println(" Half Plate --- 180 ₹ ");
                            System.out.println("Enter the Choose Quantity : ");
                            quantity = sc.nextInt();
                            int Paneer_Butter_Masala_half = 180;
                            total = total + quantity * Paneer_Butter_Masala_half;
                            break;
                        default:
                            System.out.println("Invalid Enter .. Please Select Correct Number");
                            order.order();
                            break;
                    }
                    System.out.print("Do you wish to order anything else (Y/N) : ");
                    String again = sc.next();
                    if (again.equalsIgnoreCase("Y")) {
                        Olive_Dinner.Olive_Dinner();
                        order();
                    } else if (again.equalsIgnoreCase("N")) {
                        Payment_Method.Payment_Method();
                        System.out.println(" Enter For Main 'Y'");
                        System.out.println(" Enter For Exit 'N' ");
                        sc = new Scanner(System.in);
                        char b = sc.next().charAt(0);
                        if (b == 'Y' || b == 'y') {
                            Start.Start();
                        } else {
                            System.out.println("Thanks Yor Visit Again \uD83D\uDE4F\uD83D\uDE4F");
                            System.exit(1);
                        }
                    } else {
                        System.out.println("Invalid Choice");
                        order.order();

                    }
                case 2:// Sahi_Paneer
                    System.out.println("You have Selected Sahi_Paneer");
                    System.out.println();
                    System.out.println("Enter the Choice : ");
                    System.out.println("1 : Choose Full Plate");
                    System.out.println("2 : Choose Half Plate");
                    Scanner sahi = new Scanner(System.in);
                    int sa = sahi.nextInt();
                    switch (sa) {
                        case 1:
                            System.out.println(" Full Plate --- 200 ₹ ");
                            System.out.println("Enter the Choose Quantity : ");
                            quantity = sc.nextInt();
                            int Sahi_Paneer = 220;
                            total = total + quantity * Sahi_Paneer;
                            break;
                        case 2:
                            System.out.println(" Half Plate --- 150 ₹ ");
                            System.out.println("Enter the Choose Quantity : ");
                            quantity = sc.nextInt();
                            int Sahi_Paneer_half = 160;
                            total = total + quantity * Sahi_Paneer_half;
                            break;
                        default:
                            System.out.println("Invalid Enter .. Please Select Correct Number");
                            order.order();
                            break;
                    }
                    System.out.print("Do you wish to order anything else (Y/N) : ");
                    again = sc.next();
                    if (again.equalsIgnoreCase("Y")) {
                        Olive_Dinner.Olive_Dinner();
                        order();
                    } else if (again.equalsIgnoreCase("N")) {
                        Payment_Method.Payment_Method();
                        System.out.println(" Enter For Main 'Y'");
                        System.out.println(" Enter For Exit 'N' ");
                        sc = new Scanner(System.in);
                        char b = sc.next().charAt(0);
                        if (b == 'Y' || b == 'y') {
                            Start.Start();
                        } else {
                            System.out.println("Thanks Yor Visit Again \uD83D\uDE4F\uD83D\uDE4F");
                            System.exit(1);
                        }
                    } else {
                        System.out.println("Invalid Choice");
                        order.order();

                    }
                case 3:// Paneer_Kadai
                    System.out.println("You have Selected Paneer_Kadai");
                    System.out.println();
                    System.out.println("Enter the Choice : ");
                    System.out.println("1 : Choose Full Plate");
                    System.out.println("2 : Choose Half Plate");
                    Scanner kad = new Scanner(System.in);
                    int ka = kad.nextInt();
                    switch (ka) {
                        case 1:
                            System.out.println(" Full Plate --- 180 ₹ ");
                            System.out.println("Enter the Choose Quantity : ");
                            quantity = sc.nextInt();
                            int Paneer_Kadai = 230;
                            total = total + quantity * Paneer_Kadai;
                            break;
                        case 2:
                            System.out.println(" Half Plate --- 180 ₹ ");
                            System.out.println("Enter the Choose Quantity : ");
                            quantity = sc.nextInt();
                            int Paneer_Kadai_half = 180;
                            total = total + quantity * Paneer_Kadai_half;
                            break;
                        default:
                            System.out.println("Invalid Enter .. Please Select Correct Number");
                            order.order();
                            break;
                    }
                    System.out.print("Do you wish to order anything else (Y/N) : ");
                    again = sc.next();
                    if (again.equalsIgnoreCase("Y")) {
                        Olive_Dinner.Olive_Dinner();
                        order();
                    } else if (again.equalsIgnoreCase("N")) {
                        Payment_Method.Payment_Method();
                        System.out.println(" Enter For Main 'Y'");
                        System.out.println(" Enter For Exit 'N' ");
                        sc = new Scanner(System.in);
                        char b = sc.next().charAt(0);
                        if (b == 'Y' || b == 'y') {
                            Start.Start();
                        } else {
                            System.out.println("Thanks Yor Visit Again \uD83D\uDE4F\uD83D\uDE4F");
                            System.exit(1);
                        }
                    } else {
                        System.out.println("Invalid Choice");
                        order.order();

                    }

                case 4:// Tawa_Paneer
                    System.out.println("You have Selected Tawa_Paneer");
                    System.out.println();
                    System.out.println("Enter the Choice : ");
                    System.out.println("1 : Choose Full Plate");
                    System.out.println("2 : Choose Half Plate");
                    Scanner ta = new Scanner(System.in);
                    int a = ta.nextInt();
                    switch (a) {
                        case 1:
                            System.out.println(" Full Plate --- 180 ₹ ");
                            System.out.println("Enter the Choose Quantity : ");
                            quantity = sc.nextInt();
                            int Tawa_Paneer = 180;
                            total = total + quantity * Tawa_Paneer;
                            break;
                        case 2:
                            System.out.println(" Half Plate --- 140 ₹ ");
                            System.out.println("Enter the Choose Quantity : ");
                            quantity = sc.nextInt();
                            int Tawa_Paneer_half = 140;
                            total = total + quantity * Tawa_Paneer_half;
                            break;
                        default:
                            System.out.println("Invalid Enter .. Please Select Correct Number");
                            order.order();
                            break;
                    }
                    System.out.print("Do you wish to order anything else (Y/N) : ");
                    again = sc.next();
                    if (again.equalsIgnoreCase("Y")) {
                        Olive_Dinner.Olive_Dinner();
                        order();
                    } else if (again.equalsIgnoreCase("N")) {
                        Payment_Method.Payment_Method();
                        System.out.println(" Enter For Main 'Y'");
                        System.out.println(" Enter For Exit 'N' ");
                        sc = new Scanner(System.in);
                        char b = sc.next().charAt(0);
                        if (b == 'Y' || b == 'y') {
                            Start.Start();
                        } else {
                            System.out.println("Thanks Yor Visit Again \uD83D\uDE4F\uD83D\uDE4F");
                            System.exit(1);
                        }
                    } else {
                        System.out.println("Invalid Choice");
                        order.order();
                    }
                case 5:// Chiken_Kolapuri
                    System.out.println("You have Selected Chiken_Kolapuri");
                    System.out.println();
                    System.out.println("Enter the Choice : ");
                    System.out.println("1 : Choose Full Plate");
                    System.out.println("2 : Choose Half Plate");
                    Scanner chi = new Scanner(System.in);
                    int i = chi.nextInt();
                    switch (i) {
                        case 1:
                            System.out.println(" Full Plate --- 450 ₹ ");
                            System.out.println("Enter the Choose Quantity : ");
                            quantity = sc.nextInt();
                            int Chiken_Kolapuri = 450;
                            total = total + quantity * Chiken_Kolapuri;
                            break;
                        case 2:
                            System.out.println(" Half Plate --- 260 ₹ ");
                            System.out.println("Enter the Choose Quantity : ");
                            quantity = sc.nextInt();
                            int Chiken_Kolapuri_half = 260;
                            total = total + quantity * Chiken_Kolapuri_half;
                            break;
                        default:
                            System.out.println("Invalid Enter .. Please Select Correct Number");
                            order.order();
                            break;
                    }
                    System.out.print("Do you wish to order anything else (Y/N) : ");
                    again = sc.next();
                    if (again.equalsIgnoreCase("Y")) {
                        Olive_Dinner.Olive_Dinner();
                        order();
                    } else if (again.equalsIgnoreCase("N")) {
                        Payment_Method.Payment_Method();
                        System.out.println(" Enter For Main 'Y'");
                        System.out.println(" Enter For Exit 'N' ");
                        sc = new Scanner(System.in);
                        char b = sc.next().charAt(0);
                        if (b == 'Y' || b == 'y') {
                            Start.Start();
                        } else {
                            System.out.println("Thanks Yor Visit Again \uD83D\uDE4F\uD83D\uDE4F");
                            System.exit(1);
                        }
                    } else {
                        System.out.println("Invalid Choice");
                        order.order();
                    }
                case 6:// Chiken_Savji
                    System.out.println("You have Selected Chiken_Savji");
                    System.out.println();
                    System.out.println("Enter the Choice : ");
                    System.out.println("1 : Choose Full Plate");
                    System.out.println("2 : Choose Half Plate");
                    Scanner sav = new Scanner(System.in);
                    int v = sav.nextInt();
                    switch (v) {
                        case 1:
                            System.out.println(" Full Plate --- 500 ₹ ");
                            System.out.println("Enter the Choose Quantity : ");
                            quantity = sc.nextInt();
                            int Chiken_Savji = 500;
                            total = total + quantity * Chiken_Savji;
                            break;
                        case 2:
                            System.out.println(" Half Plate --- 300 ₹ ");
                            System.out.println("Enter the Choose Quantity : ");
                            quantity = sc.nextInt();
                            int Chiken_Savji_half = 300;
                            total = total + quantity * Chiken_Savji_half;
                            break;
                        default:
                            System.out.println("Invalid Enter .. Please Select Correct Number");
                            order.order();
                            break;
                    }
                    System.out.print("Do you wish to order anything else (Y/N) : ");
                    again = sc.next();
                    if (again.equalsIgnoreCase("Y")) {
                        Olive_Dinner.Olive_Dinner();
                        order();
                    } else if (again.equalsIgnoreCase("N")) {

                        Payment_Method.Payment_Method();
                        System.out.println(" Enter For Main 'Y'");
                        System.out.println(" Enter For Exit 'N' ");
                        sc = new Scanner(System.in);
                        char b = sc.next().charAt(0);
                        if (b == 'Y' || b == 'y') {
                            Start.Start();
                        } else {
                            System.out.println("Thanks Yor Visit Again \uD83D\uDE4F\uD83D\uDE4F");
                            System.exit(1);
                        }
                    } else {
                        System.out.println("Invalid Choice");
                        order.order();
                    }
                case 7:// Muttan_Kolapuri
                    System.out.println("You have Selected Muttan_Kolapuri");
                    System.out.println();
                    System.out.println("Enter the Choice : ");
                    System.out.println("1 : Choose Full Plate");
                    System.out.println("2 : Choose Half Plate");
                    Scanner mu = new Scanner(System.in);
                    int m = mu.nextInt();
                    switch (m) {
                        case 1:
                            System.out.println(" Full Plate --- 960 ₹ ");
                            System.out.println("Enter the Choose Quantity : ");
                            quantity = sc.nextInt();
                            int Muttan_Kolapuri = 960;
                            total = total + quantity * Muttan_Kolapuri;
                            break;
                        case 2:
                            System.out.println(" Half Plate --- 500 ₹ ");
                            System.out.println("Enter the Choose Quantity : ");
                            quantity = sc.nextInt();
                            int Muttan_Kolapuri_half = 500;
                            total = total + quantity * Muttan_Kolapuri_half;
                            break;
                        default:
                            System.out.println("Invalid Enter .. Please Select Correct Number");
                            order.order();
                            break;
                    }
                    System.out.print("Do you wish to order anything else (Y/N) : ");
                    again = sc.next();
                    if (again.equalsIgnoreCase("Y")) {
                        Olive_Dinner.Olive_Dinner();
                        order();
                    } else if (again.equalsIgnoreCase("N")) {
                        Payment_Method.Payment_Method();
                        System.out.println(" Enter For Main 'Y'");
                        System.out.println(" Enter For Exit 'N' ");
                        sc = new Scanner(System.in);
                        char b = sc.next().charAt(0);
                        if (b == 'Y' || b == 'y') {
                            Start.Start();
                        } else {
                            System.out.println("Thanks Yor Visit Again \uD83D\uDE4F\uD83D\uDE4F");
                            System.exit(1);
                        }
                    } else {
                        System.out.println("Invalid Choice");
                        order.order();
                    }
                case 8://  Muttan_Savji
                    System.out.println("You have Selected  Muttan_Savji");
                    System.out.println();
                    System.out.println("Enter the Choice : ");
                    System.out.println("1 : Choose Full Plate");
                    System.out.println("2 : Choose Half Plate");
                    Scanner mut = new Scanner(System.in);
                    int l = mut.nextInt();
                    switch (l) {
                        case 1:
                            System.out.println(" Full Plate --- 1100 ₹ ");
                            System.out.println("Enter the Choose Quantity : ");
                            quantity = sc.nextInt();
                            int Muttan_Savji = 1100;
                            total = total + quantity * Muttan_Savji;
                            break;
                        case 2:
                            System.out.println(" Half Plate --- 600 ₹ ");
                            System.out.println("Enter the Choose Quantity : ");
                            quantity = sc.nextInt();
                            int Muttan_Savji_half = 600;
                            total = total + quantity * Muttan_Savji_half;
                            break;
                        default:
                            System.out.println("Invalid Enter .. Please Select Correct Number");
                            order.order();
                            break;
                    }
                    System.out.print("Do you wish to order anything else (Y/N) : ");
                    again = sc.next();
                    if (again.equalsIgnoreCase("Y")) {
                        Olive_Dinner.Olive_Dinner();
                        order();
                    } else if (again.equalsIgnoreCase("N")) {
                        Payment_Method.Payment_Method();
                        System.out.println(" Enter For Main 'Y'");
                        System.out.println(" Enter For Exit 'N' ");
                        sc = new Scanner(System.in);
                        char b = sc.next().charAt(0);
                        if (b == 'Y' || b == 'y') {
                            Start.Start();
                        } else {
                            System.out.println("Thanks Yor Visit Again \uD83D\uDE4F\uD83D\uDE4F");
                            System.exit(1);
                        }
                    } else {
                        System.out.println("Invalid Choice");
                        order.order();
                    }
                default:
                    System.out.println("Invalid Enter .. Please Select Correct Number");
                    order.order();
                    break;
            }
            System.out.println();
            System.out.print("Do you wish to order anything else (Y/N) : ");
            String again;
            again = sc.next();
            if (again.equalsIgnoreCase("Y")) {
                Olive_Dinner.Olive_Dinner();
                order();
            } else if (again.equalsIgnoreCase("N")) {
                Payment_Method.Payment_Method();
                System.out.println(" Enter For Main 'Y'");
                System.out.println(" Enter For Exit 'N'");
                sc = new Scanner(System.in);
                char b = sc.next().charAt(0);
                if (b == 'Y' || b == 'y') {
                    Start.Start();
                } else {
                    System.out.println("Thanks Yor Visit Again \uD83D\uDE4F\uD83D\uDE4F");
                    System.exit(1);
                }
            } else {
                System.out.println("Invalid Choice");
                order.order();
            }
        }
    }
}

//Gulshan_Food
//super_class
class Gulshan_Food {
    //----- Gulshan_Food Method -----
    public static void Gulshan_Food() {
        Gulshan_Banner.Gulshan_Banner();
        System.out.println("1 :  Breakfast");
        System.out.println("2 :  Food");
        System.out.println("3 : Back To The Main ");
        Scanner s = new Scanner(System.in);
        int south = s.nextInt();

        switch (south) {
            case 1:
                System.out.println();
                System.out.println("You have Selected Breakfast");
                Gulshan_Breakfast.Gulshan_Breakfast();
                break;
            case 2:
                System.out.println();
                System.out.println("You have Selected Food");
                Gulshan_Dinner.Gulshan_Dinner();
                break;
            case 3:
                Start.Start();
            default:
                System.out.println();
                System.out.println("Invalid Enter .. Please Select Correct Number");
                Gulshan_Food.Gulshan_Food();
                break;
        }
    }
}

// ------ Gulshan_Breakfast Menu ------
class Gulshan_Breakfast extends Gulshan_Food {
    public static void Gulshan_Breakfast() {
        Gulshan_Banner.Gulshan_Banner();
        Olive_Breakfast.Olive_Breakfast();
    }
}

class Gulshan_Dinner extends Gulshan_Food {
    public static void Gulshan_Dinner() {
        Gulshan_Banner.Gulshan_Banner();
        Olive_Dinner.Olive_Dinner();

    }
}

//Super_class
//S_CUBE_Food
class S_CUBE_Food {
    //----- S_CUBE_Food Method -----
    public static void S_CUBE_Food() {
        System.out.println("1 : Breakfast ");
        System.out.println("2 : Food");
        System.out.println("3 : Back To The Main ");
        Scanner j = new Scanner(System.in);
        int north = j.nextInt();

        switch (north) {
            case 1:
                System.out.println();
                System.out.println("You have Selected Breakfast");
                S_CUBE_Breakfast.S_CUBE_Breakfast();
                break;
            case 2:
                System.out.println();
                System.out.println("You have Selected Breakfast");
                S_CUBE_Dinner.S_CUBE_Dinner();
                break;
            case 3:
                Start.Start();
            default:
                System.out.println();
                System.out.println("Invalid Enter .. Please Select Correct Number");
                S_CUBE_Food.S_CUBE_Food();
        }
        S_CUBE_Food.S_CUBE_Food();
    }
}

class S_CUBE_Breakfast extends S_CUBE_Food {
    public static void S_CUBE_Breakfast() {
        S_CUBE_Banner.S_CUBE_Banner();
        Olive_Breakfast.Olive_Breakfast();
        S_CUBE_Breakfast ref = new S_CUBE_Breakfast();
    }

}

class S_CUBE_Dinner extends S_CUBE_Food {
    public static void S_CUBE_Dinner() {
        S_CUBE_Banner.S_CUBE_Banner();
        Olive_Dinner.Olive_Dinner();
    }
}

//Super_class
//Shahi_Daawat_Food
class Shahi_Daawat_Food {

    public static void Shahi_Daawat_Food() {
        System.out.println("1 : Breakfast");
        System.out.println("2 : Food");
        System.out.println("3 : Back To The Main ");
        Scanner j = new Scanner(System.in);
        int north = j.nextInt();

        switch (north) {
            case 1:
                System.out.println();
                System.out.println("You have Selected Breakfast");
                Shahi_Daawat_Breakfast.Shahi_Daawat_Breakfast();
                break;
            case 2:
                System.out.println();
                System.out.println("You have Selected Food");
                Shahi_Daawat_Dinner.Shahi_Daawat_Dinner();
                break;
            case 3:
                Start.Start();
            default:
                System.out.println();
                System.out.println("Invalid Enter .. Please Select Correct Number");
                S_CUBE_Food.S_CUBE_Food();
        }
        Shahi_Daawat_Food.Shahi_Daawat_Food();
    }
}

class Shahi_Daawat_Breakfast extends S_CUBE_Food {
    public static void Shahi_Daawat_Breakfast() {
        Shahi_Daawat_Banner.Shahi_Daawat_Banner();
        Olive_Breakfast.Olive_Breakfast();
    }
}

class Shahi_Daawat_Dinner extends S_CUBE_Food {
    public static void Shahi_Daawat_Dinner() {
        Shahi_Daawat_Banner.Shahi_Daawat_Banner();
        Olive_Dinner.Olive_Dinner();
    }
}

class Select_Bar {
    public static void Select_Bar() {
        Banner.Banner();
        System.out.println();
        System.out.println("-----------------------------------");
        System.out.println("---\uD83E\uDD42 \uD83C\uDF7B  SELECT THE BAR \uD83E\uDD42 \uD83C\uDF7B ---");
        System.out.println("-----------------------------------");
        System.out.println();
        ArrayList<String> l = new ArrayList<>();
        l.add("1 : ZERO DEGREE THE BOUTIQUE ");
        l.add("2 : JALSA BAR");
        l.add("3 : COCKTAIL BAR ");
        l.add("4 : Back to the Main ");
        for (Object obj : l) {
            System.out.println(obj);
        }

        //---- Switch For BAR------
        Scanner se = new Scanner(System.in);
        int n = se.nextInt();
        System.out.println();
        switch (n) {
            case 1:
                System.out.println();
                System.out.println("You have Selected ZERO DEGREE THE BOUTIQUE");
                ZERO_DEGREE.ZERO_DEGREE();
                break;
            case 2:
                System.out.println();
                System.out.println("You have Selected JALSA BAR");
                JALSA.JALSA();
                break;
            case 3:
                System.out.println();
                System.out.println("You have Selected COCKTAIL BAR");
                COCKTAIL.COCKTAIL();
                break;
            case 4:
                Start.Start();
            default:
                System.out.println();
                System.out.println("Invalid Enter .. Please Select Correct Number");
                Select_Bar.Select_Bar();
                break;
        }

    }
}


class ZERO_DEGREE {
    public static void ZERO_DEGREE() {
        System.out.println("Enter Your Choice");
        System.out.println("1 : Beer ");
        System.out.println("2 : Wine ");
        System.out.println("3 : Whisky");
        System.out.println("4 : Back to the Main ");
        Scanner o = new Scanner(System.in);
        int Olive = o.nextInt();

        switch (Olive) {
            case 1:
                System.out.println();
                System.out.println("You have Selected Beer");
                ZERO_Beer.ZERO_Beer();
                break;
            case 2:
                System.out.println();
                System.out.println("You have Selected Wine");
                Wine.Wine();
                break;
            case 3:
                System.out.println();
                System.out.println("You have Selected Whisky");
                Whisky.Whisky();
                break;
            case 4:
                Start.Start();
            default:
                System.out.println();
                System.out.println("Invalid Enter .. Please Select Correct Number");
                ZERO_DEGREE.ZERO_DEGREE();
                break;
        }
    }
}


class ZERO_Beer extends ZERO_DEGREE {
    {
        ZERO.ZERO();
    }

    public static void ZERO_Beer() {

        ArrayList<String> b = new ArrayList<>();
        b.add("---------------------------------------------------------");
        b.add("*************              Beer            **************");
        b.add("---------------------------------------------------------");
        b.add("     Beer_List                500ml            250ml     ");
        b.add("---------------------------------------------------------");
        b.add("1  : Budweiser                180 ₹            120 ₹     ");
        b.add("2  : Tuborg                   160 ₹            100 ₹     ");
        b.add("3  : Bira                     150 ₹             90 ₹     ");
        b.add("---------------------------------------------------------");

        for (Object obj : b) {
            System.out.println(obj);
        }

        order_beer.order_beer();
    }


    public static void generateBill_Beer() {

        System.out.println("*************************************************************************");
        System.out.println("Total Amount : " + total + " ₹");
        System.out.println("SGST -> 12% : " + total * 0.12);
        System.out.println("CGST -> 12% : " + total * 0.12);
        System.out.println("-------------------------------------------------------------------------");
        total = (int) (total + (total * 0.12));
        System.out.println("Total Payable Amount: " + total + " ₹");
        System.out.println("*************************************************************************");
    }

    class order_beer {
        public static void order_beer() {
            System.out.println("Enter Your Choice Beer");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();
            switch (ch) {
                case 1://Budweiser
                    System.out.println("You have Selected Budweiser");
                    System.out.println();
                    System.out.println("Enter the Choice : ");
                    System.out.println("1 : 500ml--- 180 ₹");
                    System.out.println("2 : 250ml--- 120 ₹");
                    Scanner s = new Scanner(System.in);
                    int c = s.nextInt();
                    int quantity;
                    switch (c) {
                        case 1:
                            System.out.println("1 : 500ml--- 180 ₹");
                            System.out.println("Enter the Choose Quantity : ");
                            quantity = sc.nextInt();
                            int Budweiser = 180;
                            total = total + quantity * Budweiser;
                            break;
                        case 2:
                            System.out.println("2 : 250ml--- 120 ₹");
                            System.out.println("Enter the Choose Quantity : ");
                            quantity = sc.nextInt();
                            int Budweiser_half = 120;
                            total = total + quantity * Budweiser_half;
                            break;
                        default:
                            System.out.println("Invalid Enter .. Please Select Correct Number");
                            order_beer.order_beer();
                            break;
                    }
                    System.out.print("Do you wish to order anything else (Y/N) : ");
                    String again;
                    again = sc.next();
                    if (again.equalsIgnoreCase("Y")) {
                        ZERO_Beer.ZERO_Beer();
                        Olive_Dinner.order.order();
                    } else if (again.equalsIgnoreCase("N")) {
                        Payment_Method.Payment_Method();
                        System.out.println(" Enter For Main 'Y'");
                        System.out.println(" Enter For Exit 'N' ");
                        sc = new Scanner(System.in);
                        char b = sc.next().charAt(0);
                        if (b == 'Y' || b == 'y') {
                            Start.Start();
                        } else {
                            System.out.println("Thanks Yor Visit Again \uD83D\uDE4F\uD83D\uDE4F");
                            System.exit(1);
                        }
                    } else {
                        System.out.println("Invalid Choice");
                        order_beer.order_beer();

                    }
                case 2://Tuborg
                    System.out.println("You have Selected Tuborg");
                    System.out.println();
                    System.out.println("Enter the Choice : ");
                    System.out.println("1 : 500ml --- 160 ₹");
                    System.out.println("2 : 250ml ----100 ₹");
                    s = new Scanner(System.in);
                    c = s.nextInt();
                    switch (c) {
                        case 1:
                            System.out.println("1 : 500ml --- 160 ₹");
                            System.out.println("Enter the Choose Quantity : ");
                            quantity = sc.nextInt();
                            int Tuborg = 160;
                            total = total + quantity * Tuborg;
                            break;
                        case 2:
                            System.out.println("Enter the Choose Quantity : ");
                            quantity = sc.nextInt();
                            int Tuborg_half = 100;
                            total = total + quantity * Tuborg_half;
                            break;
                        default:
                            System.out.println("Invalid Enter .. Please Select Correct Number");
                            order_beer.order_beer();
                            break;
                    }
                    System.out.print("Do you wish to order anything else (Y/N) : ");
                    again = sc.next();
                    if (again.equalsIgnoreCase("Y")) {
                        ZERO_Beer.ZERO_Beer();
                        Olive_Dinner.order.order();
                    } else if (again.equalsIgnoreCase("N")) {
                        Payment_Method.Payment_Method();
                        System.out.println(" Enter For Main 'Y'");
                        System.out.println(" Enter For Exit 'N' ");
                        sc = new Scanner(System.in);
                        char b = sc.next().charAt(0);
                        if (b == 'Y' || b == 'y') {
                            Start.Start();
                        } else {
                            System.out.println("Thanks Yor Visit Again \uD83D\uDE4F\uD83D\uDE4F");
                            System.exit(1);
                        }
                    } else {
                        System.out.println("Invalid Choice");
                        order_beer.order_beer();

                    }
                case 3://Bira
                    System.out.println("You have Selected Bira");
                    System.out.println();
                    System.out.println("Enter the Choice : ");
                    System.out.println("1 : 500ml--- 150 ₹");
                    System.out.println("2 : 250ml---  90 ₹");
                    s = new Scanner(System.in);
                    c = s.nextInt();
                    switch (c) {
                        case 1:
                            System.out.println("1 : 500ml--- 150 ₹");
                            System.out.println("Enter the Choose Quantity : ");
                            quantity = sc.nextInt();
                            int Bira = 150;
                            total = total + quantity * Bira;
                            break;
                        case 2:
                            System.out.println("2 : 250ml---  90 ₹");
                            System.out.println("Enter the Choose Quantity : ");
                            quantity = sc.nextInt();
                            int Bira_half = 90;
                            total = total + quantity * Bira_half;
                            break;
                        default:
                            System.out.println("Invalid Enter .. Please Select Correct Number");
                            order_beer.order_beer();
                            break;
                    }
                    System.out.print("Do you wish to order anything else (Y/N) : ");
                    again = sc.next();
                    if (again.equalsIgnoreCase("Y")) {
                        ZERO_Beer.ZERO_Beer();
                        Olive_Dinner.order.order();
                    } else if (again.equalsIgnoreCase("N")) {
                        Payment_Method.Payment_Method();
                        System.out.println(" Enter For Main 'Y'");
                        System.out.println(" Enter For Exit 'N' ");
                        sc = new Scanner(System.in);
                        char b = sc.next().charAt(0);
                        if (b == 'Y' || b == 'y') {
                            Start.Start();
                        } else {
                            System.out.println();
                            System.out.println("Thanks Yor Visit Again \uD83D\uDE4F\uD83D\uDE4F");
                            System.exit(1);
                        }
                    } else {
                        System.out.println("Invalid Choice");
                        order_beer.order_beer();
                    }
            }

        }
    }

}

class Wine extends ZERO_DEGREE {
    {
        ZERO.ZERO();
    }

    public static void Wine() {


        ArrayList<String> b = new ArrayList<>();
        b.add("---------------------------------------------------------");
        b.add("*************              Wine            **************");
        b.add("---------------------------------------------------------");
        b.add("     Wine_List              --              750ml        ");
        b.add("---------------------------------------------------------");
        b.add("1  : Cabernet Shiraz By Sula                 895  ₹      ");
        b.add("2  : Sette by Fratelli Wines                 1700 ₹      ");
        b.add("3  : Big Banyan Merlot                       750  ₹      ");
        b.add("---------------------------------------------------------");

        for (Object obj : b) {
            System.out.println(obj);
        }
        order_Wine.order_Wine();
    }


    class order_Wine {
        public static void order_Wine() {
            System.out.println("Enter Your Choice Wine");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();
            String again;
            switch (ch) {
                case 1:
                    System.out.println("You have Selected Cabernet Shiraz By Sula");
                    System.out.println();
                    System.out.println("750ml--- 895 ₹");
                    System.out.println("Enter the Choose Quantity : ");
                    int quantity = sc.nextInt();
                    int Sula = 895;
                    total = total + quantity * Sula;
                    break;
                case 2:
                    System.out.println("You have Selected Sette by Fratelli Wines  ");
                    System.out.println();
                    System.out.println("750ml--- 1700 ₹");
                    System.out.println("Enter the Choose Quantity : ");
                    quantity = sc.nextInt();
                    int Fratelli = 1700;
                    total = total + quantity * Fratelli;
                    break;
                case 3:
                    System.out.println("You have Selected Big Banyan Merlot  ");
                    System.out.println();
                    System.out.println("750ml--- 750 ₹");
                    System.out.println("Enter the Choose Quantity : ");
                    quantity = sc.nextInt();
                    int Merlot = 750;
                    total = total + quantity * Merlot;
                    break;
                default:
                    System.out.println("Invalid Enter .. Please Select Correct Number");
                    order_Wine.order_Wine();
                    break;
            }
            System.out.print("Do you wish to order anything else (Y/N) : ");
            again = sc.next();
            if (again.equalsIgnoreCase("Y")) {
                Wine.Wine();
                order_Wine();
            } else if (again.equalsIgnoreCase("N")) {
                Payment_Method.Payment_Method();
                System.out.println(" Enter For Main 'Y'");
                System.out.println(" Enter For Exit 'N' ");
                sc = new Scanner(System.in);
                char b = sc.next().charAt(0);
                if (b == 'Y' || b == 'y') {
                    Start.Start();
                } else {
                    System.out.println("Thanks Yor Visit Again \uD83D\uDE4F\uD83D\uDE4F");
                    System.exit(1);
                }
            } else {
                System.out.println("Invalid Choice");
                order_Wine.order_Wine();

            }
        }
    }
}

class Whisky extends ZERO_DEGREE {
    {
        ZERO.ZERO();
    }

    public static void Whisky() {

        ArrayList<String> b = new ArrayList<>();
        b.add("---------------------------------------------------------");
        b.add("*************              Whisky          **************");
        b.add("---------------------------------------------------------");
        b.add("     Whisky_List               750ml            375ml    ");
        b.add("---------------------------------------------------------");
        b.add("1   : Blenders Pride            1000 ₹           510 ₹   ");
        b.add("2   : Signature                 1350 ₹           675 ₹   ");
        b.add("3   : Royal Stag                 610 ₹           310 ₹   ");
        b.add("---------------------------------------------------------");

        for (Object obj : b) {
            System.out.println(obj);
        }
        order_Whisky.order_Whisky();
    }

    class order_Whisky {
        public static void order_Whisky() {
            System.out.println("Enter Your Choice Whisky");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();
            String again;
            switch (ch) {
                case 1://Blenders Pride
                    System.out.println("You have Selected Blenders Pride");
                    System.out.println();
                    System.out.println("Enter the Choice : ");
                    System.out.println("1 : 750ml--- 1000 ₹");
                    System.out.println("2 : 357ml---  510 ₹");
                    Scanner s = new Scanner(System.in);
                    int c = s.nextInt();
                    int quantity;
                    switch (c) {
                        case 1:
                            System.out.println("1 : 750ml--- 1000 ₹");
                            System.out.println("Enter the Choose Quantity : ");
                            quantity = sc.nextInt();
                            int Blenders_Pride = 1000;
                            total = total + quantity * Blenders_Pride;
                            break;
                        case 2:
                            System.out.println("2 : 357ml---  510 ₹");
                            System.out.println("Enter the Choose Quantity : ");
                            quantity = sc.nextInt();
                            int Blenders_Pride_half = 510;
                            total = total + quantity * Blenders_Pride_half;
                            break;
                        default:
                            System.out.println("Invalid Enter .. Please Select Correct Number");
                            order_Whisky.order_Whisky();
                            break;
                    }
                    System.out.print("Do you wish to order anything else (Y/N) : ");
                    again = sc.next();
                    if (again.equalsIgnoreCase("Y")) {
                        Whisky.Whisky();
                        Olive_Dinner.order.order();
                    } else if (again.equalsIgnoreCase("N")) {
                        Payment_Method.Payment_Method();
                        System.out.println(" Enter For Main 'Y'");
                        System.out.println(" Enter For Exit 'N' ");
                        sc = new Scanner(System.in);
                        char b = sc.next().charAt(0);
                        if (b == 'Y' || b == 'y') {
                            Start.Start();
                        } else {
                            System.out.println("Thanks Yor Visit Again \uD83D\uDE4F\uD83D\uDE4F");
                            System.exit(1);
                        }
                    } else {
                        System.out.println("Invalid Choice");
                        order_Whisky.order_Whisky();

                    }
                case 2://Signature
                    System.out.println("You have Selected Signature");
                    System.out.println();
                    System.out.println("Enter the Choice : ");
                    System.out.println("1 : 750ml--- 1350 ₹");
                    System.out.println("2 : 357ml---  675 ₹");
                    s = new Scanner(System.in);
                    c = s.nextInt();
                    switch (c) {
                        case 1:
                            System.out.println("1 : 750ml--- 1350 ₹");
                            System.out.println("Enter the Choose Quantity : ");
                            quantity = sc.nextInt();
                            int Signature = 1350;
                            total = total + quantity * Signature;
                            break;
                        case 2:
                            System.out.println("2 : 357ml---  675 ₹");
                            System.out.println("Enter the Choose Quantity : ");
                            quantity = sc.nextInt();
                            int Signature_half = 675;
                            total = total + quantity * Signature_half;
                            break;
                        default:
                            System.out.println("Invalid Enter .. Please Select Correct Number");
                            order_Whisky.order_Whisky();
                            break;
                    }
                    System.out.print("Do you wish to order anything else (Y/N) : ");
                    again = sc.next();
                    if (again.equalsIgnoreCase("Y")) {
                        Whisky.Whisky();
                        Olive_Dinner.order.order();
                    } else if (again.equalsIgnoreCase("N")) {
                        Payment_Method.Payment_Method();
                        System.out.println(" Enter For Main 'Y'");
                        System.out.println(" Enter For Exit 'N' ");
                        sc = new Scanner(System.in);
                        char b = sc.next().charAt(0);
                        if (b == 'Y' || b == 'y') {
                            Start.Start();
                        } else {
                            System.out.println("Thanks Yor Visit Again \uD83D\uDE4F\uD83D\uDE4F");
                            System.exit(1);
                        }
                    } else {
                        System.out.println("Invalid Choice");
                        order_Whisky.order_Whisky();

                    }
                case 3://Royal Stag
                    System.out.println("You have Selected Royal Stag");
                    System.out.println();
                    System.out.println("Enter the Choice : ");
                    System.out.println("1 : 750ml--- 610 ₹");
                    System.out.println("2 : 357ml--- 310 ₹");
                    s = new Scanner(System.in);
                    c = s.nextInt();
                    switch (c) {
                        case 1:
                            System.out.println("1 : 750ml--- 610 ₹");
                            System.out.println("Enter the Choose Quantity : ");
                            quantity = sc.nextInt();
                            int Royal_Stag = 610;
                            total = total + quantity * Royal_Stag;
                            break;
                        case 2:
                            System.out.println("2 : 357ml--- 310 ₹");
                            System.out.println("Enter the Choose Quantity : ");
                            quantity = sc.nextInt();
                            int Royal_Stag_half = 310;
                            total = total + quantity * Royal_Stag_half;
                            break;
                        default:
                            System.out.println("Invalid Enter .. Please Select Correct Number");
                            order_Whisky.order_Whisky();
                            break;
                    }
                    System.out.print("Do you wish to order anything else (Y/N) : ");
                    again = sc.next();
                    if (again.equalsIgnoreCase("Y")) {
                        Whisky.Whisky();
                        Olive_Dinner.order.order();
                    } else if (again.equalsIgnoreCase("N")) {
                        Payment_Method.Payment_Method();
                        System.out.println(" Enter For Main 'Y'");
                        System.out.println(" Enter For Exit 'N' ");
                        Scanner sc1 = new Scanner(System.in);
                        char b = sc1.next().charAt(0);
                        if (b == 'Y' || b == 'y') {
                            Start.Start();
                        } else {
                            System.out.println("Thanks Yor Visit Again \uD83D\uDE4F\uD83D\uDE4F");
                            System.exit(1);
                        }
                    } else {
                        System.out.println("Invalid Choice");
                        order_Whisky.order_Whisky();
                    }
            }
        }
    }
}


class JALSA {
    {
        JALSA_Banner.JALSA_Banner();
    }

    public static void JALSA() {
        System.out.println("Enter Your Choice");
        System.out.println("1 : Beer ");
        System.out.println("2 : Wine ");
        System.out.println("3 : Whisky");
        System.out.println("4 : Back to the Main ");
        Scanner o = new Scanner(System.in);
        int Olive = o.nextInt();

        switch (Olive) {
            case 1:
                System.out.println();
                System.out.println("You have Selected Beer");
                JALSA_beer.JALSA_beer();
                break;
            case 2:
                System.out.println();
                System.out.println("You have Selected Wine");
                JALSA_Wine.JALSA_Wine();
                break;
            case 3:
                System.out.println();
                System.out.println("You have Selected Whisky");
                JALSA_Whisky.JALSA_Whisky();
                break;
            case 4:
                Start.Start();

            default:
                System.out.println("Invalid Enter .. Please Select Correct Number");
                JALSA.JALSA();
                break;
        }
    }
}

class JALSA_beer extends ZERO_DEGREE {
    {
        JALSA_Banner.JALSA_Banner();
    }

    public static void JALSA_beer() {
        ZERO_Beer.ZERO_Beer();
    }
}

class JALSA_Wine extends ZERO_DEGREE {
    {
        JALSA_Banner.JALSA_Banner();
    }

    public static void JALSA_Wine() {
        Wine.Wine();
    }
}

class JALSA_Whisky extends ZERO_DEGREE {
    {
        System.out.println();
        JALSA_Banner.JALSA_Banner();
    }

    public static void JALSA_Whisky() {
        Whisky.Whisky();
    }
}

class COCKTAIL {
    {
        COCKTAIL_Banner.COCKTAIL_Banner();
    }

    public static void COCKTAIL() {
        System.out.println("Enter Your Choice");
        System.out.println("1 : Beer ");
        System.out.println("2 : Wine ");
        System.out.println("3 : Whisky");
        System.out.println("4 : Back to the Main ");
        Scanner o = new Scanner(System.in);
        int Olive = o.nextInt();

        switch (Olive) {
            case 1:
                System.out.println();
                System.out.println("You have Selected Beer");
                COCKTAIL_beer.COCKTAIL_beer();
                break;
            case 2:
                System.out.println();
                System.out.println("You have Selected Wine");
                COCKTAIL_Wine.COCKTAIL_Wine();
                break;
            case 3:
                System.out.println();
                System.out.println("You have Selected Whisky");
                COCKTAIL_Whisky.COCKTAIL_Whisky();
                break;
            case 4:
                Start.Start();
            default:
                System.out.println();
                System.out.println("Invalid Enter .. Please Select Correct Number");
                COCKTAIL.COCKTAIL();
                break;
        }
    }
}


class COCKTAIL_beer extends ZERO_DEGREE {
    {
        COCKTAIL_Banner.COCKTAIL_Banner();
    }

    public static void COCKTAIL_beer() {

        ZERO_Beer.ZERO_Beer();
    }
}

class COCKTAIL_Wine extends ZERO_DEGREE {
    {
        COCKTAIL_Banner.COCKTAIL_Banner();
    }

    public static void COCKTAIL_Wine() {
        Wine.Wine();
    }
}

class COCKTAIL_Whisky extends ZERO_DEGREE {
    {
        COCKTAIL_Banner.COCKTAIL_Banner();
    }

    public static void COCKTAIL_Whisky() {
        Whisky.Whisky();
    }
}


//Restaurant Rating
class Rating {
    public static void Rating() {
        System.out.println("Select The Restaurant");
        System.out.println();
        System.out.println("1 : Olive Restaurant ");
        System.out.println("2 : Gulshan Restaurant");
        System.out.println("3 : S CUBE Restaurant ");
        System.out.println("4 : Shahi Daawat Restaurant");


        Scanner se = new Scanner(System.in);
        int n = se.nextInt();
        System.out.println();

        //---- Switch For Rating------

        switch (n) {
            case 1:
                System.out.println();
                System.out.println("You have Selected Olive Restaurant Rating");
                Olive_Rating.Olive_Rating();
                break;
            case 2:
                System.out.println();
                System.out.println("You have Selected Gulshan Restaurant Rating");
                Olive_Rating.Olive_Rating();
                break;
            case 3:
                System.out.println();
                System.out.println("You have Selected S CUBE Restaurant Rating");
                Olive_Rating.Olive_Rating();
                break;
            case 4:
                System.out.println();
                System.out.println("You have Selected Shahi Daawat Restaurant Rating");
                Olive_Rating.Olive_Rating();
                break;
            default:
                System.out.println();
                System.out.println("Invalid Enter .. Please Select Correct Number");
                Rating.Rating();
                break;
        }
        System.out.println(" Enter For Place Your Drink Order 'Y'");
        System.out.println(" Enter For Place Your Food Order  'N' ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (ch == 'Y' || ch == 'y') {
            Select_Bar.Select_Bar();
        } else {
            Select.Select();
        }
    }
}

//Bar Rating
class Rating_Bar {
    public static void Rating_Bar() {
        Banner.Banner();
        System.out.println();
        System.out.println("-----------------------------------");
        System.out.println("--------  SELECT THE BAR  ---------");
        System.out.println("-----------------------------------");
        System.out.println();
        System.out.println("1 : ZERO DEGREE THE BOUTIQUE ");
        System.out.println("2 : JALSA BAR");
        System.out.println("3 : COCKTAIL BAR ");

        //---- Switch For BAR------
        Scanner se = new Scanner(System.in);
        int n = se.nextInt();
        System.out.println();
        switch (n) {
            case 1:
                System.out.println();
                System.out.println("You have Selected ZERO DEGREE THE BOUTIQUE RATING ");
                Bar_Rating.Bar_Rating();
                break;
            case 2:
                System.out.println();
                System.out.println("You have Selected JALSA BAR RATING  ");
                Bar_Rating.Bar_Rating();
                break;
            case 3:
                System.out.println();
                System.out.println("You have Selected COCKTAIL BAR RATING ");
                Bar_Rating.Bar_Rating();
                break;

            default:
                System.out.println();
                System.out.println("Invalid Enter .. Please Select Correct Number");
                Bar_Rating.Bar_Rating();
                break;
        }
        System.out.println(" Enter For Place Your Drink Order 'Y'");
        System.out.println(" Enter For Place Your Food Order 'N' ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (ch == 'Y') {
            Select_Bar.Select_Bar();
        } else {
            Select.Select();
        }
    }
}

class Olive_Rating {
    public static void Olive_Rating() {

        System.out.println("Restaurant Rating : 4.9  ★ ★ ★ ★ ☆");
        System.out.println();
        System.out.println("   Customer Review - ");
        System.out.println("   Iron Man : Nice ambience and tasty food with prompt service by staff.... \n");
        System.out.println("   Rohit    :  It is really a great place with mesmerizing ambiance and super delicious food!!\n ");
        System.out.println("   ★ ★ ★ ★ ☆");
        System.out.println("-------------------------------------------------------------------------------");
    }
}

class Bar_Rating {
    public static void Bar_Rating() {

        System.out.println(" Bar Rating   : 4.9  ★ ★ ★ ★ ☆");
        System.out.println();
        System.out.println("   Customer Review - ");
        System.out.println("   Tont Stark : All are staff serving very fast and very awesome.  \n");
        System.out.println("   Rohit      : It is really a great place with mesmerizing ambiance and Enjoy the Moment! \n ");
        System.out.println("   ★ ★ ★ ★ ☆");
        System.out.println("-------------------------------------------------------------------------------");

    }
}

//Choose_class
class Choose {
    String Ch1;
    String Ch2;
    String Ch3;
    String Ch4;

    // Constructor
    Choose(String Ch1, String Ch2, String Ch3, String Ch4) {
        this.Ch1 = Ch1;
        this.Ch2 = Ch2;
        this.Ch3 = Ch3;
        this.Ch4 = Ch4;
    }
}

class Start {
    public static void Start() {
        Banner.Banner();
        System.out.println();
        System.out.println("Main");
        System.out.println();
        Choose ref = new Choose("\n 1 : Place Your Food Order \uD83E\uDD69 \uD83C\uDF57",
                "\n 2 : Place Your Drink Order \uD83E\uDD42 \uD83C\uDF7B",
                "\n 3 : Check Restaurant Rating ★ ★ ★ ★ ★",
                "\n 4 : Check Bar Rating ★ ★ ★ ★ ★\n");
        System.out.print(ref.Ch1);
        System.out.print(ref.Ch2);
        System.out.print(ref.Ch3);
        System.out.print(ref.Ch4);

        Scanner s = new Scanner(System.in);
        int start = s.nextInt();
        switch (start) {
            case 1:
                System.out.println("Select The Restaurant");
                Select.Select();
                break;
            case 2:
                System.out.println("Select The BAR");
                Select_Bar.Select_Bar();
            case 3:
                System.out.println("Check Restaurant Rating");
                Rating.Rating();
                break;
            case 4:
                Rating_Bar.Rating_Bar();
                System.out.println("Check BAR Rating");
                break;
            default:
                System.out.println("Invalid Enter .. Please Select Correct Number");
                Start.Start();
                break;
        }
    }
}


public class Restaurant {
    //Static Block
    static {
        System.out.println();
        Banner.Banner();
    }

    static class Register {
        Scanner sc = new Scanner(System.in);
        private String firstname;
        private String lastname;

        private String Mail;

        private Long Mobile_No;
        private String username;
        private String password;


        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public String getUsername() {
            return username;
        }

        public String getMail() {
            return Mail;
        }

        public void setMail(String mail) {
            Mail = mail;
        }

        public Long getMobile_No() {
            return Mobile_No;
        }

        public void setMobile_No(Long mobile_No) {
            Mobile_No = mobile_No;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public void Login() {
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("                                  Login Page                                   ");
            System.out.println("-------------------------------------------------------------------------------");
            System.out.print("Enter Your Username      :");
            String un = sc.next();
            System.out.print("Enter the Password       :");
            String ps = sc.next();

            if (un.equals(username) && ps.equals(password)) {
                System.out.println();
                System.out.println("Login Successfully");
            } else {
                Login();
            }

        }
    }

    // Main Method


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Register ref = new Register();
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("                                  Register Page                                ");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.print("Enter Your First Name    :");
        String firstname = sc.nextLine();
        ref.setFirstname(firstname);

        System.out.print("Enter Your Last Name     :");
        String lastname = sc.nextLine();
        ref.setLastname(lastname);

        System.out.print("Enter Your Mail Id       :");
        String Mail = sc.next();
        ref.setMail(Mail);

        System.out.print("Enter Your Mobile Number :");
        long Mobile_No = sc.nextLong();
        ref.setMobile_No(Mobile_No);

        System.out.print("Enter Your Username      :");
        String username = sc.next();
        ref.setUsername(username);

        System.out.print("Enter the Password       :");
        String password = sc.next();
        ref.setPassword(password);
        ref.Login();

//ArrayList For Your Info.....

        System.out.println();
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("                                  Your Info                                    ");
        System.out.println("-------------------------------------------------------------------------------");
        ArrayList<String> a = new ArrayList<>();
        a.add("-------------------------------------------------------------------------------");
        a.add(" --► Your Full Name        : " + ref.getFirstname());
        a.add(" --► Your Last Name        : " + ref.getLastname());
        a.add(" --► Your Mail_ID          : " + ref.getMail());
        a.add(" --► Your Mobile_No        : " + ref.getMobile_No());
        a.add(" --► Your UserName         : " + ref.getUsername());
        a.add(" --► Your UserName         : " + ref.getPassword());
        a.add("-------------------------------------------------------------------------------");
        for (Object obj : a) {
            System.out.println(obj);
        }
        System.out.println();
        System.out.println("Please Wait!");
        System.out.print("Loading");
        try {
            for (int i = 1; i < 7; i++) {
                sleep(400);
                System.out.print(". ");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println();
        System.out.println("-----------------------\uD83D\uDE4F \uD835\uDC74\uD835\uDC90\uD835\uDC94\uD835\uDC95 \uD835\uDC7E\uD835\uDC86\uD835\uDC8D\uD835\uDC84\uD835\uDC90\uD835\uDC8E\uD835\uDC86 \uD83D\uDE4F--------------------------");
        Start.Start();
    }
}
