class Figuras {
    double medida;
    String nombre;

    public Figuras(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para calcular el área
    public double calcularArea() {
        return 0; // Este método se sobrescribirá en las subclases
    }

    // Método para calcular el perímetro
    public double calcularPerimetro() {
        return 0; // Este método se sobrescribirá en las subclases
    }
}