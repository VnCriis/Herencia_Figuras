class Cuadrado extends Regulares {
    // Constructor
    public Cuadrado(double lado) {
        super("Cuadrado");
        this.medida = lado;
    }

    // Sobrescribe el método para calcular el área
    @Override
    public double calcularArea() {
        return medida * medida;
    }

    // Sobrescribe el método para calcular el perímetro
    @Override
    public double calcularPerimetro() {
        return 4 * medida;
    }

    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println(getNombre() + " - Lado: " + medida);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println();
    }
}