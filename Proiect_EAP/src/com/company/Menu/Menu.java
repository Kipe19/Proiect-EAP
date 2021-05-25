
package com.company.Menu;

import com.company.Angajat;
import com.company.Client;
import com.company.Operatie;
import com.company.Piesa;
import com.company.codCSV.*;
import com.company.Database.*;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private static Menu menu;

    private Menu() {
    }

    public static Menu getInstance() {
        if (menu == null) {
            menu = new Menu();
        }
        return menu;
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        int menu = 0;


        ArrayList<Client> clienti = new ArrayList<>();
        ArrayList<Angajat> angajati = new ArrayList<>();
        ArrayList<Operatie> operatii = new ArrayList<>();
        ArrayList<Piesa> piese = new ArrayList<>();

        Load.LoadPiese(piese);
        Load.LoadAngajati(angajati);
        Load.LoadClienti(clienti);
        Load.LoadOperatii(operatii);

        while (option >= -1 && option <= 11) {


            System.out.print("\033[H\033[2J");
            System.out.flush();


            if (menu == 0) {
                System.out.println("Buna ziua!\nSelectati o optiune:");
                System.out.println("Pentru a adauga selectati:");
                System.out.println("1. Client nou \n2. Angajat nou \n3. Piesa noua \n4. Operatie noua \n5. Update Menu \n6. Delete Menu\n7. Show Menu");
                System.out.println("10. Exit \n");
            } else if (menu == 1) {
                System.out.println("Modificati: ");
                System.out.println("1. Client  \n2. Angajat  \n3. Piesa  \n4. Operatie  \n9. Back\n");
            } else if (menu == 2) {
                System.out.println("Modificati: ");
                System.out.println("1. Client  \n2. Angajat  \n3. Piesa  \n4. Operatie  \n9. Back\n");

            }
            else if (menu ==3)
            {
                System.out.println("Afisare: ");
                System.out.println("1. Clienti  \n2. Angajati  \n3. Piese  \n4. Operatii  \n9. Back\n");
            }

            System.out.println("Alegerea dvs: ");
            option = scanner.nextInt();
            switch (menu) {
                case 0 -> {
                    switch (option) {
                        case 1 -> {
                            System.out.println("CNP client: ");
                            scanner.skip("\n");
                            String cnp = scanner.nextLine();

                            System.out.println("Nume client: ");
                            String nume = scanner.nextLine();

                            System.out.println("Numar de telefon: ");
                            String nr_tel = scanner.nextLine();

                            Client client = new Client(nume, cnp, nr_tel);
                            Add.AddClient(client);
                            Show.ShowClienti();
                            System.out.println("Clientul a fost adaugat.");
                        }

                        case 2 -> {
                            System.out.println("CNP Angajat: ");
                            scanner.skip("\n");

                            String cnp = scanner.nextLine();

                            System.out.println("Nume angajat: ");
                            String nume = scanner.nextLine();

                            System.out.println("Calificare: ");
                            String calificare = scanner.nextLine();

                            System.out.println("Data angajarii: ");
                            String data = scanner.nextLine();

                            Angajat angajat = new Angajat(cnp, nume, calificare, data);
                            Add.AddAngajat(angajat);
                            Show.ShowAngajati();
                            System.out.println("Angajatul a fost adaugat.");
                        }
                        case 3 -> {
                            System.out.println("Numar OEM: ");
                            scanner.skip("\n");

                            String oem = scanner.nextLine();

                            System.out.println("Producator: ");
                            String prod = scanner.nextLine();

                            System.out.println("Denumire: ");
                            String denumire = scanner.nextLine();

                            System.out.println("Pret: ");
                            int pret = Integer.parseInt(scanner.nextLine());

                            Piesa piesa = new Piesa(denumire, pret, prod, oem);
                            Add.AddPiesa(piesa);
                            Show.ShowPiese();
                            System.out.println("Piesa a fost adaugata.");
                        }
                        case 4 -> {
                            System.out.println("ID Operatie: ");

                            scanner.skip("\n");

                            String id = scanner.nextLine();

                            System.out.println("Tip operatie: ");
                            String tip_o = scanner.nextLine();

                            System.out.println("Denumire: ");
                            String denumire = scanner.nextLine();

                            System.out.println("Cost manopera: ");
                            int cost = Integer.parseInt(scanner.nextLine());

                            System.out.println("Durata: ");
                            int durata = Integer.parseInt(scanner.nextLine());

                            Operatie operatie = new Operatie(id, tip_o, denumire, durata, cost);
                            Add.AddOperatie(operatie);
                            Show.ShowOperatii();
                            System.out.println("Operatia a fost adaugata.");
                        }
                        case 5 -> {
                            menu = 1;
                        }
                        case 6 -> {
                            menu = 2;
                        }
                        case 7->
                                {
                                    menu =3;
                                }
                        case 10 -> { //Exit
                            System.out.println("La revedere! ");
                            option = 12;
                        }
                    }
                }
                case 1 -> {
                    switch (option) {
                        case 1 -> {
                            System.out.println("Inserati CNP-ul clientului al carui nume doriti sa il modificati: ");
                            scanner.skip("\n");

                            String cnp = scanner.nextLine();

                            System.out.println("Inserati noul nume: ");
                            String nume = scanner.nextLine();

                            System.out.println("Numele a fost schimbat.");
                            Update.UpdateNumeClient(clienti, cnp, nume);
                        }
                        case 2 -> {
                            System.out.println("Inserati CNP-ul angajatului al carui nume doriti sa il modificati: ");
                            scanner.skip("\n");

                            String cnp = scanner.nextLine();

                            System.out.println("Inserati noul nume: ");
                            String nume = scanner.nextLine();

                            System.out.println("Numele a fost schimbat.");
                            Update.UpdateNumeAngajat(angajati, cnp, nume);
                        }
                        case 3 -> {
                            System.out.println("Inserati numarul piesei pe care doriti sa o modificati ");
                            scanner.skip("\n");

                            int nr_oem = scanner.nextInt();

                            System.out.println("Inserati denumirea: ");
                            String denumire = scanner.nextLine();

                            System.out.println("Denumirea a fost schimbata.");
                            Update.UpdateDenumirePiesa(piese, nr_oem, denumire);
                        }

                        case 4 -> {
                            System.out.println("Inserati id-ul operatiei pe care doriti sa o modificati ");
                            scanner.skip("\n");

                            int id = scanner.nextInt();

                            System.out.println("Inserati denumirea: ");
                            String denumire = scanner.nextLine();

                            System.out.println("Denumirea a fost schimbata.");
                            Update.UpdateDenumireOperatie(operatii, id, denumire);
                        }

                        case 9 -> {
                            menu = 0;
                        }
                    }
                }
                case 2 -> {
                    switch (option) {
                        case 1 -> {
                            System.out.println("Inserati CNP-ul clientului pe care doriti sa il stergeti: ");
                            scanner.skip("\n");

                            String cnp = scanner.nextLine();


                            System.out.println("Clientul a fost sters.");
                            Delete.DeleteClient(clienti, cnp);
                        }
                        case 2 -> {
                            System.out.println("Inserati CNP-ul angajatului pe care doriti sa il stergeti: ");
                            scanner.skip("\n");

                            String cnp = scanner.nextLine();


                            System.out.println("Angajatul a fost sters.");
                            Delete.DeleteAngajat(angajati, cnp);
                        }
                        case 3 -> {
                            System.out.println("Inserati numarul piesei pe care doriti sa o stergeti ");
                            scanner.skip("\n");

                            int nr_oem = scanner.nextInt();


                            System.out.println("Piesa a fost stearsa.");
                            Delete.DeletePiesa(piese, nr_oem);
                        }

                        case 4 -> {
                            System.out.println("Inserati id-ul operatiei pe care doriti sa o stergeti ");
                            scanner.skip("\n");

                            int id = scanner.nextInt();


                            System.out.println("Operatia a fost stearsa.");
                            Delete.DeleteOperatie(operatii, id);
                        }
                        case 9 -> {
                            menu = 0;
                        }
                    }
                }
                case 3 -> {
                    switch (option) {
                        case 1 -> {
                            Show.ShowClienti();
                        }
                        case 2 -> {
                            Show.ShowAngajati();
                        }
                        case 3 -> {
                            Show.ShowPiese();
                        }

                        case 4 -> {
                            Show.ShowOperatii();
                        }
                        case 9 -> {
                            menu = 0;
                        }
                    }
                }

            }
        }
    }
}
