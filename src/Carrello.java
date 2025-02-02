import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) throws Exception {

        Prodotto[] arrayProdotti = new Prodotto[20];
        
        //Per comodità creo uno schermo e un processore qui
        Schermo schermo = new Schermo(5, true, "2k");
        Processore processore = new Processore("Super CPU", 32, "MediaTek");

        Scanner input = new Scanner(System.in);
        System.out
                .println("Scegliere il tipo di prodotto: Smartphone, Televisore, Cuffie. Digitare Fine per terminare");
        String scelta = input.nextLine();

        int indiceArrayProdotti = 0;
        while (indiceArrayProdotti < arrayProdotti.length && !scelta.equalsIgnoreCase("Fine")) {

            if (scelta.equalsIgnoreCase("Smartphone")) {
                System.out.println("Nome:");
                String nome = input.nextLine();

                System.out.println("Marca: ");
                String marca = input.nextLine();

                System.out.println("Prezzo: ");
                float prezzo = input.nextFloat();

                System.out.println("Iva: ");
                float iva = input.nextFloat();

                System.out.println("Codice IMEI: ");
                int codiceImei = input.nextInt();

                System.out.println("Memoria: ");
                int memoria = input.nextInt();

                input.nextLine();

                Smartphone smartphone = new Smartphone(nome, marca, prezzo, iva, codiceImei, memoria, processore, schermo);

                arrayProdotti[indiceArrayProdotti] = smartphone;
                indiceArrayProdotti++;

                System.out.println("Prodotto aggiunto al carrello.");

            }

            else if (scelta.equalsIgnoreCase("Televisore")) {
                System.out.println("Nome:");
                String nome = input.nextLine();

                System.out.println("Marca: ");
                String marca = input.nextLine();

                System.out.println("Prezzo: ");
                float prezzo = input.nextFloat();

                System.out.println("Iva: ");
                float iva = input.nextFloat();

                System.out.println("Dimensione: ");
                int dimensione = input.nextInt();

                input.nextLine();

                System.out.println("SmartTV (true o false): ");
                boolean smart = input.nextBoolean();

                input.nextLine();

                Televisore televisore = new Televisore(nome, marca, prezzo, iva, dimensione, smart, schermo);

                arrayProdotti[indiceArrayProdotti] = televisore;
                indiceArrayProdotti++;

                System.out.println("Prodotto aggiunto al carrello.");
            }

            else if (scelta.equalsIgnoreCase("Cuffie")) {
                System.out.println("Nome:");
                String nome = input.nextLine();

                System.out.println("Marca: ");
                String marca = input.nextLine();

                System.out.println("Prezzo: ");
                float prezzo = input.nextFloat();

                System.out.println("Iva: ");
                float iva = input.nextFloat();

                input.nextLine();

                System.out.println("Colore: ");
                String colore = input.nextLine();

                System.out.println("Wireless o Cablate: ");
                String tipo = input.nextLine();

                Cuffie cuffie = new Cuffie(nome, marca, prezzo, iva, colore, tipo);

                arrayProdotti[indiceArrayProdotti] = cuffie;
                indiceArrayProdotti++;

                System.out.println("Prodotto aggiunto al carrello.");
            }

            else
                System.out.println("Scelta non valida.");

            System.out.println(
                    "Scegliere il tipo di prodotto: Smartphone, Televisore, Cuffie. Digitare Fine per visualizzare il carrello");
            scelta = input.nextLine();

        }

        //Stampo il carrello
        if (indiceArrayProdotti > 0) {
            for (int i = 0; i < indiceArrayProdotti; i++) {
                System.out.println(arrayProdotti[i].getNome());
            }
        } else
            System.out.println("Il carrello è vuoto");

        
        //Chiedo la tessera sconto e calcolo il prezzo scontato oppure no
        System.out.println("Hai la tessera sconto? Digita true oppure false");
        boolean tessera = input.nextBoolean();
        input.close();

        float totale = 0;

        if( tessera )
            {
                for(int i = 0; i < indiceArrayProdotti; i++){
                    totale += arrayProdotti[i].calcolaPrezzoConSconto();
                }

            }
        else {

            for(int i = 0; i < indiceArrayProdotti; i++){
                totale += arrayProdotti[i].getPrezzoConIva();
            }

        }
        
        System.out.println("Il totale è: " + totale + " euro");
    }


}
