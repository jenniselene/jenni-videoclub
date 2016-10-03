/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoclub;

/**
 *
 * @author Jenni Mondragon
 */

import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Videoclub {

    static class Plataforma {
        public List<String> nombrePlataforma = new ArrayList<>();

        private Plataforma () {
            nombrePlataforma.add("Sin clasificar");
            nombrePlataforma.add("XBox One");
            nombrePlataforma.add("PS 4");
            nombrePlataforma.add("Wii U");
            nombrePlataforma.add("PS Vita");
            nombrePlataforma.add("XBox 360");
            nombrePlataforma.add("PS3");
            nombrePlataforma.add("Wii");
        }
            
        private void listaPlataformas() {
            int tam = nombrePlataforma.size();
            for (int i=0; i<tam; i++) {
                System.out.printf("%3d) %s\n", i, nombrePlataforma.get(i));
            }
        }

        private String getPlataforma(int i) {
            return nombrePlataforma.get(i);
        }
        
        private int addPlataforma(String nombre) {
            nombrePlataforma.add(nombre);
            return nombrePlataforma.indexOf(nombre);
        }

    }

    static class Estilo {
        public List<String> nombreEstilo = new ArrayList<>();

    /* Género: 0 sin clasificar, 1 acción, 2 fantasía, 3 drama, 4 comedia, 5 aventura */
        private Estilo () {
            nombreEstilo.add("Sin clasificar");
            nombreEstilo.add("Deportes");
            nombreEstilo.add("First Person Shooter");
            nombreEstilo.add("Plataformas");
            nombreEstilo.add("RPG");
            nombreEstilo.add("Peleas");
        }
            
        private void listaEstilos() {
            int tam = nombreEstilo.size();
            for (int i=0; i<tam; i++) {
                System.out.printf("%3d) %s\n", i, nombreEstilo.get(i));
            }
        }

        private String getEstilo(int i) {
            return nombreEstilo.get(i);
        }
        
        private int addEstilo(String nombre) {
            nombreEstilo.add(nombre);
            return nombreEstilo.indexOf(nombre);
        }

    }

    static private class Producto {
        int id;   /* Identificador unico de producto */
        String nombre;
        float costo;
        int diasRenta; /* Dias que se presta al momento de rentar */
        boolean rentado; /* Se encuentra rentado ? */
        Date ultimaFechaRenta; /* Fecha de ultima vez que se rento */

        private Producto(int i, String n, float c, int dias) {
            setId(i);
            setNombre(n);
            setCosto(c);
            setDiasRenta(dias);
            setRentado(false);
            setFechaRenta(new Date());
        }
        
        private Producto(int i, String n, float c, int dias, Date d) {
            setId(i);
            setNombre(n);
            setCosto(c);
            setDiasRenta(dias);
            setRentado(false);
            setFechaRenta(d);
        }

        private int setId (int numeroId) {
            id = numeroId;
            return id;
        }

        private int getId (int numeroId) {
            return id;
        }

        private String setNombre(String str) {
            nombre = str;
            return nombre;
        }

        private String getNombre() {
            return nombre;
        }

        private int setDiasRenta(int dias) {
            diasRenta = dias;
            return diasRenta;
        }

        private int getDiasRenta() {
            return diasRenta;
        }

        private float setCosto(float c) {
            costo = c;
            return costo;
        }
        
        private float getCosto() {
            return costo;
        }
        
        private boolean setRentado(boolean r) {
            rentado = r;
            return rentado;
        }
        
        private boolean getRentado() {
            return rentado;
        }
        
        private Date setFechaRenta(Date fecha) {
            ultimaFechaRenta = fecha;
            return ultimaFechaRenta;
        }

        private Date getFechaRenta() {
            return ultimaFechaRenta;
        }
    }

    static class Pelicula extends Producto {
      static class Genero {
            public List<String> nombreGenero = new ArrayList<>();

        /* Género: 0 sin clasificar, 1 acción, 2 fantasía, 3 drama, 4 comedia, 5 aventura */
            private Genero () {
                nombreGenero.add("Sin clasificar");
                nombreGenero.add("Accion");
                nombreGenero.add("Fantasia");
                nombreGenero.add("Drama");
                nombreGenero.add("Comedia");
                nombreGenero.add("Aventura");
            }

            private void listaGeneros() {
                int tam = nombreGenero.size();
                for (int i=0; i<tam; i++) {
                    System.out.printf("%3d) %s\n", i, nombreGenero.get(i));
                }
            }

            private String getGenero(int i) {
                return nombreGenero.get(i);
            }

            private int addGenero(String nombre) {
                nombreGenero.add(nombre);
                return nombreGenero.indexOf(nombre);
            }

      }

      private int numGenero;
      private int anioProduccion;

      public Pelicula() {
          super(0, "", 0, 0);
      }

      public Pelicula(int id, String nombre, float costo, int diasRenta) {
          super(id, nombre, costo, diasRenta);
          setGenero(0);
          setAnio(0);
      }
      
      public Pelicula(int id, String nombre, float costo, int diasRenta, int g) {
          super(id, nombre, costo, diasRenta);
          numGenero = g;
          anioProduccion = 0;
      }

      public Pelicula(int id, String nombre, float costo, int diasRenta, int g, int anio) {
          super(id, nombre, costo, diasRenta);
          numGenero = g;
          anioProduccion = anio;
      }

      public Pelicula(int id, String nombre, float costo, int diasRenta, int numGenero, int anio, Date fechaRentado) {
          super(id, nombre, costo, diasRenta, fechaRentado);
          setGenero(numGenero);
          setAnio(anio);
      }

      private void setRentado(boolean b) {
          super.setRentado(b);
      }

      private boolean getRentado() {
          return super.getRentado();
      }

      private String getNombre() {
          return super.getNombre();
      }

      private void setNombre(String n) {
          super.setNombre(n);
      }

      private int setAnio(int anio) {
          anioProduccion = anio;
          return anioProduccion;
      }
            
      private int getAnio() {
          return anioProduccion;
      }
      
      private int setGenero(int num) {
          numGenero = num;
          return numGenero;
      }

      private int getGenero() {
          return numGenero;
      }

      private String getGeneroStr() {
          Genero g = new Genero();
          return g.getGenero(numGenero);
      }
      private void pideDatosPeli() {
            //Pelicula p;
            String titulo;
            int num;
            int anio;
            float c;
            int dias;
            Genero genero = new Genero();
            Random aleatorio = new Random();

            Scanner scan = new Scanner(System.in);

            super.id = aleatorio.nextInt();
            super.setRentado(true);
            super.setFechaRenta(new Date());

            System.out.print("Titulo de la pelicula: ");
            titulo = scan.nextLine();
            super.setNombre(titulo);

            System.out.println("Indica un genero ");
            genero.listaGeneros();
            System.out.print("?: ");
            num = scan.nextInt();
            setGenero(num);

            System.out.print("Anio de produccion: ");
            anio = scan.nextInt();
            setAnio(anio);

            System.out.print("Costo: ");
            c = scan.nextFloat();
            super.setCosto(c);

            System.out.print("Dias de renta: ");
            dias = scan.nextInt();
            super.setDiasRenta(dias);

      }
    
    }

    static class Juego extends Producto {
      private int plataforma;
      private int estilo;

      public Juego() {
          super(0, "", 0, 0);
          setPlataforma(0);
          setEstilo(0);
      }

      public Juego(int i, String n, float c, int dias) {
          super(i, n, c, dias);
          setPlataforma(0);
          setEstilo(0);
      }

      public Juego(int i, String n, float c, int dias, int p) {
          super(i, n, c, dias);
          setPlataforma(p);
          setEstilo(0);
      }

      public Juego(int i, String n, float c, int dias, int plataf, int estil) {
          super(i, n, c, dias);
          setPlataforma(plataf);
          setEstilo(estil);
      }

      private Juego(int i, String n, float c, int dias, int plataf, int estil, Date fecha) {
          super(i, n, c, dias, fecha);
          setPlataforma(plataf);
          setEstilo(estil);
      }


      private int setPlataforma(int plat) {
          plataforma = plat;
          return plataforma;
      }
      
      private int getPlataforma() {
          return plataforma;
      }
      
      private String getPlataformaStr() {
          Plataforma p = new Plataforma();
          return p.getPlataforma(plataforma);
      }
      
      private int setEstilo(int est){
          estilo = est;
          return estilo;
      }

      private int getEstilo(){
          return estilo;
      }
      
      private String getNombre() {
          return super.getNombre();
      }
      
      private boolean getRentado() {
          return super.getRentado();
      }

      private void pideDatosVJ() {
        String titulo;
        int numPlat, numEst;
        float c;
        int dias;
        Plataforma p = new Plataforma();
        Estilo e = new Estilo();
        Random aleatorio = new Random();

        Scanner scan = new Scanner(System.in);

        super.id = aleatorio.nextInt();
        super.setRentado(true);
        super.setFechaRenta(new Date());

        System.out.print("Titulo del videojuego: ");
        titulo = scan.nextLine();
        super.setNombre(titulo);

        System.out.println("Indica una plataforma ");
        p.listaPlataformas();
        System.out.print("?: ");
        numPlat = scan.nextInt();
        setPlataforma(numPlat);

        System.out.println("Indica clasificacion del juego:");
        e.listaEstilos();
        System.out.print("?: ");
        numEst = scan.nextInt();
        setEstilo(numEst);

        System.out.print("Costo: ");
        c = scan.nextFloat();
        super.setCosto(c);

        System.out.print("Dias de renta: ");
        dias = scan.nextInt();
        super.setDiasRenta(dias);
      }

    }
    

    static void imprimeMenu() {
        System.out.print("\n\n\n\n");
        System.out.println("Mostrar: (t)odos los productos | (p)eliculas | (v)ideojuegos ");
        System.out.println("Buscar: pelicula(s) | video(j)uegos. Mostrar (c)antidad rentados");
        System.out.println("Listar titulos de: (x)Box One | (w)ii U | PS (4)");
        System.out.println("(u) Salir del programa");
    }

    static int listaPeliculas(List <Pelicula> peliculas) {
        Pelicula p;
        int tam = peliculas.size();
        System.out.printf("Encontradas %d peliculas:\n", tam);
        System.out.printf("Titulo                                   Anio  %-20s Rentada\n", "Genero");
        for (int i=0; i<tam; i++) {
            p = peliculas.get(i);
            System.out.printf("%-40s %4d  %-20s ", p.getNombre(), p.getAnio(), p.getGeneroStr());
            if (p.getRentado())
                System.out.print("SI");
            else
                System.out.print("NO");
            System.out.printf("\n");
        }
        return tam;
    }

    static int listaVj(List <Juego> vj) {
      int tam = vj.size();
      Juego j;
      
      System.out.printf("Encontrados %d videojuegos:\n", tam);
      System.out.printf("Titulo                    Plataforma   Rentado\n");
      for (int i=0; i<tam; i++) {
          j = vj.get(i);
          System.out.printf("%-28s %-12s ", j.getNombre(), j.getPlataformaStr());
          if (j.getRentado())
              System.out.print("SI");
          else
              System.out.print("NO");
            System.out.printf("\n");
      }
      return tam;
    }

    static int buscaPeliculas(List <Pelicula> pelicula, String nBuscado) {
        int indice = -1;
        int tam = pelicula.size();
        int i;
        String subS; 
        
        for (i=0; i<tam; i++) {
            subS = pelicula.get(i).nombre.toLowerCase(Locale.US);
            indice = subS.indexOf(nBuscado.toLowerCase(Locale.US));
            if (indice>=0)
                break;
        }
        
        if (indice<0)
            return -1;
        else
            return(i);
    }

    static int buscaVJs(List <Juego> juegos, String nBuscado) {
        int indice = -1;
        int tam = juegos.size();
        int i;
        String subS; 
        
        for (i=0; i<tam; i++) {
            subS = juegos.get(i).nombre.toLowerCase(Locale.US);
            indice = subS.indexOf(nBuscado.toLowerCase(Locale.US));
            if (indice>=0)
                break;
        }
        
        if (indice<0)
            return -1;
        else
            return(i);
    }

    private static void imprimeStatusPeli(Pelicula p) {
        System.out.println("Nombre de pelicula                       Anio Rentada");
        System.out.printf("%-40s %4d ", p.getNombre(), p.getAnio());
        if (p.rentado)
            System.out.printf("SI %s\n", p.ultimaFechaRenta.toString());
        else
            System.out.println("NO");
    }
    
    private static void imprimeStatusJuego(Juego p) {
        System.out.println("Nombre de juego                          Plataforma Rentado");
        System.out.printf("%-40s %20d ", p.getNombre(), p.getPlataforma());
        if (p.rentado)
            System.out.printf("SI %s\n", p.ultimaFechaRenta.toString());
        else
            System.out.println("NO");
    }

    private static void listaPeliRentadas(List<Pelicula> Pelis) {
        int tam = Pelis.size();
        int j=0;
        Pelicula p;
        
        System.out.println("Peliculas rentadas:");
        for (int i=0; i<tam; i++) {
            p = Pelis.get(i);
            if (p.getRentado()) {
                System.out.printf("%s (%s)\n", p.getNombre(), p.getAnio());
                j++;
            }
        }
        System.out.printf("Total: %d", j);
    }
    
    private static void listaJuegosXBoxOne(List<Juego>vj) {
        int tam = vj.size();
        int j=0;
        Juego p;
        
        System.out.println("Juegos de XBox One:");
        for (int i=0; i<tam; i++) {
            p = vj.get(i);
            if (p.getPlataforma()==1) {
                System.out.printf("%s\n", p.getNombre());
                j++;
            }
        }
        System.out.printf("Total: %d", j);
         
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List <Pelicula> peliculas = new ArrayList<>();
        Pelicula peli = new Pelicula();
        Pelicula p;
        
        List <Juego> juegos = new ArrayList<>();
        Juego jgo = new Juego();

        Scanner scan = new Scanner(System.in);
        int opcion = -1;
        String menOpc = "";
        int i;
        String sBusqueda;

        Date fecha = new Date();
        long tiempo = fecha.getTime()-86400000; // Restamos un dia

        fecha.setTime(tiempo);
        /****** Peliculas *****/
        // para efectos demostrativos, agregamos dos peliculas rentadas el día de ayer
        p = new Pelicula(10, "Revenant, The", 23, 3, 1, 2015, fecha);
        p.setRentado(true);  // La marcamos como rentada
        peliculas.add(p);
        p = new Pelicula(15, "Ghostbusters", 25, 3, 4, 2016, fecha);
        peliculas.add(p);
        do {
            try {
                System.out.println("Cuantas peliculas quieres agregar al sistema?");
                opcion = scan.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("ERROR: valor invalido, intenta de nuevo...");
                scan.next(); /* Descarta el token generado por la excepcion */
            }
        }
        while (opcion == -1);
        
        for (i=0; i<opcion; i++) {
            System.out.printf("Introduce datos de pelicula %3d:\n", i+1);
            peli.pideDatosPeli();
            System.out.println("****");
            peliculas.add(peli);
        }
        
        /****** Videojuegos *****/
        opcion = -1;
        do {
            try {
                System.out.println("Cuantos videojuegos quieres agregar al sistema?");
                if (scan.hasNextInt())
                    opcion = scan.nextInt();
                else {
                    System.out.println("Entrada invalida");
                    scan.next();
                }
            }
            catch (InputMismatchException e) {
                System.out.println("ERROR: valor invalido, intenta de nuevo...");
                scan.next(); /* Descarta el token generado por la excepcion */
            }
        }
        while (opcion == -1);
        for (i=0; i<opcion; i++) {
            System.out.printf("Introduce datos de videojuego %3d:\n", i+1);
            jgo.pideDatosVJ();
            System.out.println("****");
            juegos.add(jgo);
        }
     
        jgo = new Juego(55, "Super Mario Galaxy", 25, 5, 7, 3, fecha);
        juegos.add(jgo);
        jgo = new Juego(56, "Final Fantasy VII", 25, 5, 6, 4, fecha);
        juegos.add(jgo);
        jgo = new Juego(59, "Street Fighter XXV", 25, 5, 1, 5, fecha);
        juegos.add(jgo);

        do {
            imprimeMenu();
            menOpc = scan.nextLine();
            
            switch(menOpc) {
                case "p":
                case "P":
                    listaPeliculas(peliculas);
                    break;
                case "v":
                case "V":
                    listaVj(juegos);
                    break;
                case "t":
                case "T":
                    listaPeliculas(peliculas);
                    System.out.println();
                    listaVj(juegos);
                    break;
                case "s":
                case "S":
                    System.out.print("Que pelicula quieres buscar?: ");
                    sBusqueda = scan.nextLine();
                    i = buscaPeliculas(peliculas, sBusqueda);
                    if (i<0)
                        System.out.println("Pelicula no encontrada...");
                    else
                        imprimeStatusPeli(peliculas.get(i));
                    break;
                case "j":
                case "J":
                    System.out.print("Que juego quieres buscar?: ");
                    sBusqueda = scan.nextLine();
                    i = buscaVJs(juegos, sBusqueda);
                    if (i<0)
                        System.out.println("Juego no encontrado...");
                    else
                        imprimeStatusJuego(juegos.get(i));
                    break;
                case "u":
                case "U":
                    System.out.println("Salir...");
                    break;
                case "c":
                case "C":
                    listaPeliRentadas(peliculas);
                    break;
                case "x":
                case "X":
                    listaJuegosXBoxOne(juegos);
                    break;
                case "w":
                case "W":
                case "4":
                    System.out.println("Opcion no implementada...");
                    break;
                default:
                     System.out.printf("Opcion #%s# no reconocida, intenta de nuevo...", menOpc);
                     break;
            }
        }
        while (!menOpc.equalsIgnoreCase("u"));
    }
    
}
