public abstract class Hero implements ActionHuman{
    private static String experiencia;
    protected static int salud;
     protected int energia;

   //Constructor de la clase heroe
    public Hero(int saludInicial, int energiaIncial) {
        salud = saludInicial;
        energia = energiaIncial;
    }


    public abstract void usarSuperpoder();

    public abstract void ataque();
}
