/*
 * Vaja6_1
 * 
 * V besedilnem načinu v navpični obliki izriŠite sinusno funkcijo v intervalu med 0 in 360 stopinj.
 * 
 * Uporabite konstante:
 * final float pi = 3.14159;	
 * final char znak = '*'; //  znak za izris krivulje
 * final int skal_fakt = 20; //  faktor razŠiritve (območje med -1 in 1 na npr. od -20 do 20)
 * final int min_kot = 0; //   začetni kot
 * final int max_kot = 360; // končni kot
 * final int korak = 9; // korak v stopinjah
 * 
 * Izpis zvezdic zamaknite v desno.
 * 
 * NapiŠite metode za:
 * - pretvorbo stopinj v radijane,
 * - določitev položaja zvezdice v posamezni vrstici,
 * - izris sinusne funkcije.
 * 
 * Kot          Izris sinusne krivulje
 *   0|                                     *                         0.0
 *   9|                                          *                        0.16
 *  18|                                              *                        0.31
 *  27|                                                   *                        0.45
 *  36|                                                       *                        0.59
 *  45|                                                          *                        0.71
 *  54|                                                             *                        0.81
 *  63|                                                                 *                        0.89
 *  72|                                                                  *                        0.95
 *  81|                                                                   *                        0.99
 *  90|                                                                   *                         1.0
 *  99|                                                                   *                        0.99
 * 108|                                                                  *                        0.95
 * 117|                                                                *                        0.89
 * 126|                                                             *                        0.81
 * 135|                                                          *                        0.71
 * 144|                                                       *                        0.59
 * 153|                                                   *                        0.45
 * 162|                                              *                        0.31
 * 171|                                          *                        0.16
 * 180|                                     *                   2.5e-06
 * 189|                                 *                      -0.16
 * 198|                            *                      -0.31
 * 207|                        *                      -0.45
 * 216|                   *                      -0.59
 * 225|                *                      -0.71
 * 234|             *                      -0.81
 * 243|          *                      -0.89
 * 252|         *                      -0.95
 * 261|       *                      -0.99
 * 270|       *                        -1.0
 * 279|       *                      -0.99
 * 288|         *                      -0.95
 * 297|          *                      -0.89
 * 306|             *                      -0.81
 * 315|                *                      -0.71
 * 324|                   *                      -0.59
 * 333|                        *                      -0.45
 * 342|                            *                      -0.31
 * 351|                                 *                      -0.16
 * 360|                                     *                  -5.1e-06
 */

package vaja6;

public class vaja6_1v2 {

	public static void main(String[] args) {
		// zanka 0 .. 360* korak
		final int korak = 10;
		double vrednostSinX, xVRadijanih;
		int mestoZvezdice;
		int x = 0;
		
		while (x <= 360) {
			xVRadijanih = x / (180/Math.PI);
			vrednostSinX = Math.sin(xVRadijanih);
			mestoZvezdice = (int) (vrednostSinX * 30 + 35);
			
			int i = 1;
			
			while (i < mestoZvezdice) {
				System.out.print(" ");
				i++;
			}
			
				System.out.println("*");
				x += korak;
		}
	}

}
