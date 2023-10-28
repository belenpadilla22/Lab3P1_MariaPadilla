/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p1_mariapadilla;

import java.util.Scanner;

/**
 *
 * @author belen
 */
public class Lab3P1_MariaPadilla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println(" 1. Sucesiones y mas sucesiones ");
        System.out.println(" 2. Pocket Monsters ");
        System.out.println(" 3. Asterisco en casa ");
        System.out.println();
        char resp = 's';
        while (resp == 's' || resp == 'S') {
            System.out.println(" Ingrese una opcion: ");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println(" Ingrese un numero inicial: ");
                    int a = leer.nextInt();
                    int a2 = a;
                    System.out.println(" Ingrese la diferencia: ");
                    int d = leer.nextInt();
                    int d2 = d;
                    System.out.println(" Ingrese la cantidad: ");
                    int cant = leer.nextInt();
                    for (int i = 1; i <= cant; i++) {
                        if (i < cant) {
                            System.out.print(a + " , ");
                        } else {
                            System.out.println(a);
                        }
                        if (i == 1) {
                            a = a + d;
                        } else {
                            a = a + d + 1;
                            d = d + 1;
                        }

                    }

                    System.out.println();
                    System.out.println(" Que numero desea ver en la sucecion: ");
                    int num = leer.nextInt();
                    for (int i = 1; i <= num - 1; i++) {
                        if (i == 1) {
                            a2 = a2 + d2;
                        } else {
                            a2 = a2 + d2 + 1;
                            d2 = d2 + 1;
                        }

                    }
                    System.out.println(a2);
                    break;
                case 2:
                    int ataque1,
                     ataque2,
                     vida1,
                     vida2;
                    double defensa1,
                     defensa2;
                    System.out.println(" Ingrese el modo de pelea pokemon desea: ");
                    System.out.println(" 1.- Hasta la muerte ");
                    System.out.println(" 2.- Por rondas ");
                    int modo = leer.nextInt();
                    System.out.println();
                    System.out.println(" Estadisticas de los pokemones ");
                    System.out.println(" Sylveon Vida: 280 Ataque:80 Defensa:15% ");
                    System.out.println(" Gyarados Vida:300 Ataque:50 Defensa:10% ");
                    System.out.println(" Giratina Vida:300 Ataque:75 Defensa:25%");
                    System.out.println(" Dragonite Vida:250 Ataque:75 Defensa:20%");
                    System.out.println();
                    System.out.println(" Ingrese una pelea determinada: ");
                    System.out.println(" 1.- Sylveon vrs Dradonite ");
                    System.out.println(" 2.- Gyarados vrs Giratina ");
                    System.out.println(" 3.- Dragonite vrs Giratina ");
                    System.out.println(" 4.- Giratina vrs Sylveon ");
                    int pelea = leer.nextInt();
                    System.out.println();
                    switch (pelea) {
                        case 1:
                            vida1 = 280;
                            ataque1 = 80;
                            defensa1 = 0.15;
                            vida2 = 250;
                            ataque2 = 75;
                            defensa2 = 0.2;
                            int rondas = 1;
                            if (modo == 1) {
                                while (vida1 > 0 && vida2 > 0) {
                                    System.out.println(" Ronda " + rondas);

                                    System.out.println(" Vida de pokemon 1: " + vida1);
                                    System.out.println(" Vida de pokemon 2: " + vida2);
                                    System.out.println(" Pokemon 1 ha atacado ");
                                    System.out.println(" Pokemon 2 ha atacado ");
                                    vida1 -= ataque2 * (1 - defensa1);
                                    vida2 -= ataque1 * (1 - defensa2);
                                    if (vida1 <= 0) {
                                        vida1 = 0;
                                    }
                                    if (vida2 <= 0) {
                                        vida2 = 0;
                                    }

                                    System.out.println(" Vida de pokemon 1: " + vida1);
                                    System.out.println(" Vida de pokemon 2: " + vida2);
                                    rondas++;

                                }
                            } else {
                                while (vida1 > 0 && vida2 > 0 && rondas <= 10) {
                                    System.out.println(" Ronda " + rondas);

                                    System.out.println(" Vida de pokemon 1: " + vida1);
                                    System.out.println(" Vida de pokemon 2: " + vida2);
                                    System.out.println(" Pokemon 1 ha atacado ");
                                    System.out.println(" Pokemon 2 ha atacado ");
                                    vida1 -= ataque2 * (1 - defensa1);
                                    vida2 -= ataque1 * (1 - defensa2);
                                    if (vida1 <= 0) {
                                        vida1 = 0;
                                    }
                                    if (vida2 <= 0) {
                                        vida2 = 0;
                                    }

                                    System.out.println(" Vida de pokemon 1: " + vida1);
                                    System.out.println(" Vida de pokemon 2: " + vida2);
                                    rondas++;

                                }

                            }
                            break;
                        case 2:
                            vida1 = 300;
                            ataque1 = 50;
                            defensa1 = 0.1;
                            vida2 = 300;
                            ataque2 = 70;
                            defensa2 = 0.25;
                            rondas = 1;
                            if (modo == 1) {
                                while (vida1 > 0 && vida2 > 0) {
                                    System.out.println(" Ronda " + rondas);

                                    System.out.println(" Vida de pokemon 1: " + vida1);
                                    System.out.println(" Vida de pokemon 2: " + vida2);
                                    System.out.println(" Pokemon 1 ha atacado ");
                                    System.out.println(" Pokemon 2 ha atacado ");
                                    vida1 -= ataque2 * (1 - defensa1);
                                    vida2 -= ataque1 * (1 - defensa2);
                                    if (vida1 <= 0) {
                                        vida1 = 0;
                                    }
                                    if (vida2 <= 0) {
                                        vida2 = 0;
                                    }

                                    System.out.println(" Vida de pokemon 1: " + vida1);
                                    System.out.println(" Vida de pokemon 2: " + vida2);
                                    rondas++;

                                }
                            } else {
                                while (vida1 > 0 && vida2 > 0 && rondas <= 10) {
                                    System.out.println(" Ronda " + rondas);

                                    System.out.println(" Vida de pokemon 1: " + vida1);
                                    System.out.println(" Vida de pokemon 2: " + vida2);
                                    System.out.println(" Pokemon 1 ha atacado ");
                                    System.out.println(" Pokemon 2 ha atacado ");
                                    vida1 -= ataque2 * (1 - defensa1);
                                    vida2 -= ataque1 * (1 - defensa2);
                                    if (vida1 <= 0) {
                                        vida1 = 0;
                                    }
                                    if (vida2 <= 0) {
                                        vida2 = 0;
                                    }

                                    System.out.println(" Vida de pokemon 1: " + vida1);
                                    System.out.println(" Vida de pokemon 2: " + vida2);
                                    rondas++;

                                }

                            }
                            break;
                        case 3: vida1 = 250;
                            ataque1 = 75;
                            defensa1 = 0.2;
                            vida2 = 300;
                            ataque2 = 70;
                            defensa2 = 0.25;
                            rondas = 1;
                            if (modo == 1) {
                                while (vida1 > 0 && vida2 > 0) {
                                    System.out.println(" Ronda " + rondas);

                                    System.out.println(" Vida de pokemon 1: " + vida1);
                                    System.out.println(" Vida de pokemon 2: " + vida2);
                                    System.out.println(" Pokemon 1 ha atacado ");
                                    System.out.println(" Pokemon 2 ha atacado ");
                                    vida1 -= ataque2 * (1 - defensa1);
                                    vida2 -= ataque1 * (1 - defensa2);
                                    if (vida1 <= 0) {
                                        vida1 = 0;
                                    }
                                    if (vida2 <= 0) {
                                        vida2 = 0;
                                    }

                                    System.out.println(" Vida de pokemon 1: " + vida1);
                                    System.out.println(" Vida de pokemon 2: " + vida2);
                                    rondas++;

                                }
                            } else {
                                while (vida1 > 0 && vida2 > 0 && rondas <= 10) {
                                    System.out.println(" Ronda " + rondas);

                                    System.out.println(" Vida de pokemon 1: " + vida1);
                                    System.out.println(" Vida de pokemon 2: " + vida2);
                                    System.out.println(" Pokemon 1 ha atacado ");
                                    System.out.println(" Pokemon 2 ha atacado ");
                                    vida1 -= ataque2 * (1 - defensa1);
                                    vida2 -= ataque1 * (1 - defensa2);
                                    if (vida1 <= 0) {
                                        vida1 = 0;
                                    }
                                    if (vida2 <= 0) {
                                        vida2 = 0;
                                    }

                                    System.out.println(" Vida de pokemon 1: " + vida1);
                                    System.out.println(" Vida de pokemon 2: " + vida2);
                                    rondas++;

                                }

                            }
                            break;
                        case 4: 
                            vida1 = 300;
                            ataque1 = 70;
                            defensa1 = 0.25;
                            vida2 = 280;
                            ataque2 = 80;
                            defensa2 = 0.15;
                            rondas = 1;
                            if (modo == 1) {
                                while (vida1 > 0 && vida2 > 0) {
                                    System.out.println(" Ronda " + rondas);

                                    System.out.println(" Vida de pokemon 1: " + vida1);
                                    System.out.println(" Vida de pokemon 2: " + vida2);
                                    System.out.println(" Pokemon 1 ha atacado ");
                                    System.out.println(" Pokemon 2 ha atacado ");
                                    vida1 -= ataque2 * (1 - defensa1);
                                    vida2 -= ataque1 * (1 - defensa2);
                                    if (vida1 <= 0) {
                                        vida1 = 0;
                                    }
                                    if (vida2 <= 0) {
                                        vida2 = 0;
                                    }

                                    System.out.println(" Vida de pokemon 1: " + vida1);
                                    System.out.println(" Vida de pokemon 2: " + vida2);
                                    rondas++;

                                }
                            } else {
                                while (vida1 > 0 && vida2 > 0 && rondas <= 10) {
                                    System.out.println(" Ronda " + rondas);

                                    System.out.println(" Vida de pokemon 1: " + vida1);
                                    System.out.println(" Vida de pokemon 2: " + vida2);
                                    System.out.println(" Pokemon 1 ha atacado ");
                                    System.out.println(" Pokemon 2 ha atacado ");
                                    vida1 -= ataque2 * (1 - defensa1);
                                    vida2 -= ataque1 * (1 - defensa2);
                                    if (vida1 <= 0) {
                                        vida1 = 0;
                                    }
                                    if (vida2 <= 0) {
                                        vida2 = 0;
                                    }

                                    System.out.println(" Vida de pokemon 1: " + vida1);
                                    System.out.println(" Vida de pokemon 2: " + vida2);
                                    rondas++;

                                }

                            }
                            break;    
                    }
                    break;

                    
               

                case 3:
                    int fila = 0;
                    int columna = 0;
                    System.out.println(" Ingrese un numero impar y mayor a 7 : ");
                    int numero = leer.nextInt();
                    while (numero < 7 || numero % 2 == 0) {
                        System.out.println(" Debe ingresar un numero impar y mayor a 7 ");
                        numero = leer.nextInt();
                    }
                    if (numero % 2 != 0 && numero >= 7) {
                        fila = numero;
                        columna = numero;
                        int x = 1;
                        int y = 1;
                        for (int i = 1; i <= fila; i++) {
                            for (int j = 1; j <= columna; j++) {
                                if (i == 1 || i == fila || j == 1 || j == columna) {
                                    System.out.print("*");
                                } else {
                                    if (i == j) {
                                        if ((j == (columna / 2) + 1) && (j == (columna / 2) + 1)) {
                                            System.out.print("|");
                                        } else {
                                            System.out.print(">");
                                        }
                                    } else {
                                        if ((j == (columna / 2) + 1) && (j == (columna / 2) + 1)) {
                                            System.out.print("|");
                                        } else if (j == columna - i + 1) {
                                            System.out.print("<");
                                            x++;
                                            y++;
                                        } else {
                                            System.out.print(" ");
                                        }
                                    }

                                }

                            }
                            System.out.println();
                        }

                    }
                    break;
            }
            System.out.println(" Desea continuar [s/n] : ");
            resp = leer.next().charAt(0);
        }

    }
}
