package Objetos;

public class Acetaminophen {
    private String nombre;
    private String fabricante;
    private String consumicion;

    public Acetaminophen(String nombre, String fabricante, String consumicion) {
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.consumicion = consumicion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("--------[medicamento]--------");
        sb.append("\nNombre del medicamento = ").append(nombre);
        sb.append("\nfabricante del medicamento = ").append(fabricante);
        sb.append("\nVía de administracion= ").append(consumicion);
        return sb.toString();
    }
    
    //clase interna
    public class Posología{
        private String usuario;
        private String dosis;
        private String tiempo;
        private String recomendaciones;

        public Posología(String usuario, String dosis, String tiempo,
                String recomendaciones) {
            this.usuario = usuario;
            this.dosis = dosis;
            this.tiempo = tiempo;
            this.recomendaciones = recomendaciones;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("\nUsuario = ").append(usuario);
            sb.append("\nDosis = ").append(dosis);
            sb.append("\nPeriodo = ").append(tiempo);
            sb.append("\nRecomendaciones = ").append(recomendaciones);
            return sb.toString();
        }  
    }  
}
