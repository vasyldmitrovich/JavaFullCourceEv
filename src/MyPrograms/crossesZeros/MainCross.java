/*
package MyPrograms.crossesZeros;

import java.util.Scanner;

public class MainCross {

        public static final String POROGNYA = "     ";
        public static final String KRESTUK = "  X  ";
        public static final String NULYK = "  O  ";
        public static String aktuvnuyGravec;
        public static final int RYADKIV = 3, STOVPCHUKIV = 3;
        public static String[][] sitka = new String[RYADKIV][STOVPCHUKIV];
        public static int statusGru;
        public static final int STATUS_GRU_TRUVAE = 0, STATUS_NICHYYA = 1,
                STATUS_PEREMOGA_X = 3, STATUS_PEREMOGA_O = 4 ;
        public static Scanner in = new Scanner(System.in);


        public static void main(String[] args) {
            PochatuGru();
            do {
                OtrymatuVvedeniGravtsya();
                ProanalizyvatuSitky();
                VuvestySitky();
                if (statusGru == STATUS_PEREMOGA_X) {
                    System.out.println("X WIN!!!");
                } else if (statusGru == STATUS_PEREMOGA_O) {
                    System.out.println("O WIN!!!");
                } else if (statusGru == STATUS_NICHYYA) {
                    System.out.println("It is DRAW!!! By");
                }
                aktuvnuyGravec = (aktuvnuyGravec == KRESTUK ? NULYK : KRESTUK);
            }while (statusGru == STATUS_GRU_TRUVAE) ;
        }

        public static void PochatuGru() {
            for (int ryad = 0; ryad < RYADKIV; ryad++) {
                for (int stovp = 0; stovp < STOVPCHUKIV; stovp++) {
                    sitka[ryad][stovp] = POROGNYA;
                }
            }
            aktuvnuyGravec = KRESTUK;
            VuvestySitky();
        }//Start

        public static void OtrymatuVvedeniGravtsya() {
            boolean vvedennyaDiysne = false;
            do {
                System.out.println(" Playing " + aktuvnuyGravec + "enter row (1-3) separated by a space ");
                int ryad = in.nextInt() - 1;
                int stovp = in.nextInt() - 1;
                if (ryad >= 0 && ryad < RYADKIV && stovp >= 0 && stovp < STOVPCHUKIV && sitka[ryad][stovp] == POROGNYA) {
                    sitka[ryad][stovp] = aktuvnuyGravec;
                    vvedennyaDiysne = true;
                } else {
                    System.out.println("Entered values (" + (ryad + 1) + "," + (stovp + 1)
                            + ") could not be used, please try again ");
                }
            }
            while (!vvedennyaDiysne);
        } //EnterNumbers

        public static void ProanalizyvatuSitky() {
            String peremogec = ZnaytuPeremojcya();
            if (peremogec.equals(KRESTUK)) {
                statusGru = STATUS_PEREMOGA_X;
            } else if (peremogec.equals(NULYK)) {
                statusGru = STATUS_PEREMOGA_O;
            } else if (ChyVsiKlitunkuZapovnenni()) {
                statusGru = STATUS_NICHYYA;
            } else {
                statusGru = STATUS_GRU_TRUVAE;
            }
        }// FieldAnalysis

        public static boolean ChyVsiKlitunkuZapovnenni() {
            for (int ryad = 0; ryad < RYADKIV; ryad++) {
                for (int stovp = 0; stovp < STOVPCHUKIV; stovp++) {
                    if (sitka[ryad][stovp] == POROGNYA) {
                        return false;
                    }
                }
            }
            return true;
        } //FieldsAreFull

        public static String ZnaytuPeremojcya() {
            int iKilkistOdnakova;
            for (int ryad = 0; ryad < RYADKIV; ryad++) {
                iKilkistOdnakova = 0;
                for (int stovp = 0; stovp < STOVPCHUKIV; stovp++) {
                    if (sitka[ryad][0] != POROGNYA && sitka[ryad][0] == sitka[ryad][stovp]) {
                        iKilkistOdnakova++;
                    }
                }
                if (iKilkistOdnakova == 3) {
                    return sitka[ryad][0];
                }
            }
            ///////////////////////////////////////
            for (int stovp = 0; stovp < STOVPCHUKIV; stovp++) {
                iKilkistOdnakova = 0;
                for (int ryad = 0; ryad < RYADKIV; ryad++) {
                    if (sitka[0][stovp] != POROGNYA && sitka[0][stovp] == sitka[ryad][stovp]) {
                        iKilkistOdnakova++;
                    }
                }
                if (iKilkistOdnakova == 3) {
                    return sitka[0][stovp];
                }
            }
            /////////////////////////////////////
            if (sitka[0][0] != POROGNYA && sitka[0][0] == sitka[1][1] && sitka[0][0] == sitka[2][2]) {
                return sitka[0][0];
            }

            if (sitka[0][2] != POROGNYA && sitka[1][1] == sitka[0][2] && sitka[0][2] == sitka[2][0]) {
                return sitka[0][2];
            }
            return POROGNYA;
        } //WINNER

        public static void VuvestySitky() {
            for (int ryad = 0; ryad < RYADKIV; ryad++) {
                for (int stovp = 0; stovp < STOVPCHUKIV; stovp++) {
                    System.out.print(sitka[ryad][stovp]);
                    if (stovp != STOVPCHUKIV - 1) {
                        System.out.print("|");
                    }
                }
                System.out.println();
                if (ryad != RYADKIV - 1) {
                    System.out.println("------------------");
                }
            }
            System.out.println();
        } //PRINTNETTING

    }
*/
