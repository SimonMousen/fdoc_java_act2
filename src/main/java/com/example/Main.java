package com.example;

public class Main {
    public static void main(String[] args) {
        
        // WHILE
        // 1
        System.out.println("Numeros del 1 al 10:");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        
        // 2
        System.out.println("Suma acumulativa de 1 a 5:");
        int n = 5;
        int suma = 0;
        int contador = 1;
        while (contador <= n) {
            suma += contador;
            System.out.println("Sumando " + contador + ", total acumulado: " + suma);
            contador++;
        }
        System.out.println("Total suma: " + suma);
        
        // 3
        System.out.println("Buscar numero 7 en arreglo:");
        int[] numeros = {2, 5, 8, 7, 1, 9};
        int numeroBuscado = 7;
        int indice = 0;
        boolean encontrado = false;
        
        while (indice < numeros.length && !encontrado) {
            System.out.println("Buscando en posición " + indice + ": " + numeros[indice]);
            if (numeros[indice] == numeroBuscado) {
                encontrado = true;
                System.out.println("Numero " + numeroBuscado + " encontrado en posición " + indice);
                break;
            }
            indice++;
        }
        if (!encontrado) {
            System.out.println("Numero no encontrado");
        }
        

        // DO-WHILE
        // 1
        System.out.println("Menu interactivo:");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("MENU");
            System.out.println("1. Opción A");
            System.out.println("2. Opción B");
            System.out.println("3. Opción C");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1: System.out.println("Ejecutando Opción A"); break;
                case 2: System.out.println("Ejecutando Opción B"); break;
                case 3: System.out.println("Ejecutando Opción C"); break;
                case 0: System.out.println("Saliendo.."); break;
                default: System.out.println("Opción inválida");
            }
        } while (opcion != 0);
        
        // 2
        System.out.println("Suma de numeros (ingrese 0 para terminar):");
        int numero;
        int sumaTotal = 0;
        
        do {
            System.out.print("Ingrese un numero (0 para terminar): ");
            numero = scanner.nextInt();
            sumaTotal += numero;
            System.out.println("Suma acumulada: " + sumaTotal);
        } while (numero != 0);
        System.out.println("Suma final: " + sumaTotal);
        
        // 3
        System.out.println("Validación de contraseña:");
        String contraseñaCorrecta = "java123";
        String contraseñaIngresada;
        
        do {
            System.out.print("Ingrese la contraseña: ");
            contraseñaIngresada = scanner.next();
            
            if (contraseñaIngresada.equals(contraseñaCorrecta)) {
                System.out.println("Contraseña correcta");
            } else {
                System.out.println("Contraseña incorrecta. Intente nuevamente.");
            }
        } while (!contraseñaIngresada.equals(contraseñaCorrecta));
        

        // FOR
        // 1
        System.out.println("Números pares del 2 al 20:");
        for (int j = 2; j <= 20; j += 2) {
            System.out.print(j + " ");
        }
        
        // 2
        System.out.println("Factorial de 5:");
        int numeroFactorial = 5;
        long factorial = 1;
        
        for (int k = 1; k <= numeroFactorial; k++) {
            factorial *= k;
            System.out.println(k + "! = " + factorial);
        }
        System.out.println("Factorial de " + numeroFactorial + " es: " + factorial);
        
        // 3
        System.out.println("Suma de elementos del arreglo:");
        int[] arregloEnteros = {10, 20, 30, 40, 50};
        int sumaArreglo = 0;
        
        for (int m = 0; m < arregloEnteros.length; m++) {
            System.out.println("Elemento [" + m + "]: " + arregloEnteros[m]);
            sumaArreglo += arregloEnteros[m];
        }
        System.out.println("Suma total del arreglo: " + sumaArreglo);
        

        // FOR-EACH
        // 1
        System.out.println("Suma con for-each:");
        int[] numerosParaSuma = {5, 10, 15, 20, 25};
        int sumaForEach = 0;
        
        for (int num : numerosParaSuma) {
            System.out.println("Sumando: " + num);
            sumaForEach += num;
        }
        System.out.println("Suma total: " + sumaForEach);
        
        // 2
        System.out.println("Lista de palabras:");
        String[] palabras = {"Java", "Python", "JavaScript", "C#", "PHP"};
        
        for (String palabra : palabras) {
            System.out.println("Lenguaje: " + palabra);
        }
        
        // 3
        System.out.println("Promedio de calificaciones:");
        double[] calificacionesEstudiantes = {8.5, 9.0, 7.5, 8.0, 9.5};
        double sumaCalifs = 0;
        
        for (double calif : calificacionesEstudiantes) {
            sumaCalifs += calif;
        }
        
        double promedioFinal = sumaCalifs / calificacionesEstudiantes.length;
        System.out.println("Promedio: " + promedioFinal);
        

        // BREAK Y CONTINUE
        // 1
        System.out.println("Break - Detener al encontrar numero negativo:");
        int[] numerosArray = {2, 4, -1, 6, 8};
        
        for (int num : numerosArray) {
            if (num < 0) {
                System.out.println("Numero negativo encontrado");
                break;  
            }
            System.out.println("Procesando numero: " + num);
        }
        
        // 2
        System.out.println("Continue - Omitir numeros impares:");
        for (int x = 1; x <= 10; x++) {
            if (x % 2 != 0) {
                continue;
            }
            System.out.println("Numero par: " + x);
        }
        
        // 3
        System.out.println("Combinar break y continue:");
        int[] datos = {2, 15, 8, 25, 3, 30, 12, 40};
        int umbral = 30;
        
        for (int dato : datos) {
            if (dato > umbral) {
                System.out.println("Superado el umbral de " + umbral);
                break;
            }
            if (dato < 10) {
                System.out.println("Numero " + dato + " menor que 10");
                continue;
            }
            System.out.println("Procesando número válido: " + dato);
        }
        scanner.close();
    }
}