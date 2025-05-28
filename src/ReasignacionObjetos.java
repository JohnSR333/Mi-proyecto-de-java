public class ReasignacionObjetos {
    String nombre;
}

class Main {
    public static void main(String[] args) {
        ReasignacionObjetos persona = new ReasignacionObjetos();
        persona.nombre = "Ana";
        reasignarPersona(persona);
        System.out.println("Nombre después de reasignarPersona: " + persona.nombre);  // Debería imprimir Ana
    }

    public static void reasignarPersona(ReasignacionObjetos persona) {
        persona = new ReasignacionObjetos();  // Creamos un nuevo objeto
        persona.nombre = "María";
    }
}
