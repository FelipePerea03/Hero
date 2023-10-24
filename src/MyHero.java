public  class MyHero extends Hero  {
    private static final int experiencia = 0;
    private final String[] habilidades;



    public MyHero(String nombre, int nivel, int saludInicial, int energiaInicial, String arma) {
        super(saludInicial, energiaInicial);
        int experiencia1 = this.experiencia;
        boolean vivo = true;
        this.habilidades = new String[3];
    }

    public static void VersionDc() {

    }

    public static String getEnergia() {
        return null;
    }

    public static void setEnergia(String energia) {
        String energia1 = energia;

    }

    public static int getSalud() {
        return salud;

    }

    public static void setSalud(String salud) {
        MyHero.salud = Integer.parseInt(salud);
    }

    @Override
    public void usarhabilidadEspecial() {
        System.out.println(getNombre() + " utiliza una habilidad especial.");
    }

    @Override
    public void usarSuperpoder() {
        energia -= 10;
        System.out.println(energia + " utiliza un superpoder. Energía restante: " + energia);
    }

    @Override
    public void ataque() {
        salud -= 20;
        System.out.println(salud + "Uf, te hicieron daño [-20]");
    }



    public static String getNombre() {
        return "Mr overman";
    }

    public void setNombre(String nombre) {
    }

    public static int getExperiencia() {
        return experiencia;
    }


}
