public class Reasignacion {
    static class Persona {
        String nombre;
    }

    public static void cambiarPersona(Persona persona) {
        persona = new Persona();  // Creamos un nuevo objeto
        persona.nombre = "Pedro";
        System.out.println("Dentro de cambiarPersona: " + persona.nombre);  // Imprime Pedro
    }

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.nombre = "Juan";
        cambiarPersona(persona);
        System.out.println("Después de cambiarPersona: " + persona.nombre);  // Imprime Juan
    }
}
