package math;

public class Methods {
  public static final String ANSI_RESET = "\u001B[0m"; // Resetear estilos
  public static final String ANSI_RED = "\u001B[31m"; // Rojo
  public static final String ANSI_BOLD = "\u001B[1m"; // Negrita

  public static void main(String[] args) {
    // Redondear
    System.out.println(ANSI_RED + "Math.round()" + ANSI_RESET);
    System.out.println("Round 4.3: " + Math.round(4.3));
    System.out.println("Round 4.6: " + Math.round(4.6));
    System.out.println("Round 157.9: " + Math.round(157.9));
    System.out.println();

    // Redondear hacia arriba
    System.out.println(ANSI_RED + "Math.ceil()" + ANSI_RESET);
    System.out.println("Round up 1024.7: " + Math.ceil(1024.7));
    System.out.println("Round up 10.3: " + Math.ceil(10.3));
    System.out.println("Round up -129.10: " + Math.ceil(-129.10));
    System.out.println("Round up -25.92: " + Math.ceil(-25.92));
    System.out.println();

    // Redondear hacia abajo
    System.out.println(ANSI_RED + "Math.floor()" + ANSI_RESET);
    System.out.println("Round down 1024.7: " + Math.floor(1024.7));
    System.out.println("Round down 10.3: " + Math.floor(10.3));
    System.out.println("Round down -129.10: " + Math.floor(-129.10));
    System.out.println("Round down -25.92: " + Math.floor(-25.92));
    System.out.println();

    // Max
    System.out.println(ANSI_RED + "Math.max()" + ANSI_RESET);
    System.out.println("Max: " + Math.max(24.26, 24.75));
    System.out.println();

    // Min
    System.out.println(ANSI_RED + "Math.min()" + ANSI_RESET);
    System.out.println("Min: " + Math.min(24.26, 24.75));
    System.out.println();

    // Raiz cuadrada
    System.out.println(ANSI_RED + "Math.sqrt()" + ANSI_RESET);
    System.out.println("Square root: " + Math.sqrt(1936));
    System.out.println("Square root: " + Math.sqrt(16384));
    System.out.println();

    // Valor absoluto
    System.out.println(ANSI_RED + "Math.abs()" + ANSI_RESET);
    System.out.println(Math.abs(-10));
    System.out.println();

    // Números pseudoaleatorios
    // Formúla Math.floor(Math.random() * N)
    System.out.println(ANSI_RED + "Math.random()" + ANSI_RESET);
    System.out.println(ANSI_RED + "Entre 0 y 10." + ANSI_RESET);
    System.out.println((int) (Math.random() * 11));
    System.out.println(Math.floor(Math.random() * 11));
    System.out.println();

    // Número aleatorio entre el 1 y el 100
    // Formúla Math.floor(Math.random() * N + 1)
    System.out.println(ANSI_RED + "1 y 10" + ANSI_RESET);
    System.out.println((int) ((Math.random() * 10) + 1));
    System.out.println(Math.floor(Math.random() * 10) + 1);
    System.out.println();

    // Número aleatorio entre el 10 y 20
    // Formúla (Math.random() * (max - min + 1)) + min
    System.out.println(ANSI_RED + "Entre un min y max: 10 y 20" + ANSI_RESET);
    System.out.println((int) ((Math.random() * (10 - 20 + 1)) + 10));
  }
}
