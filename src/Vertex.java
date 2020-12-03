class Vertex {
    private static final String lastName = "dasd";
    private static final String lastName2 = "dasd";
    private String label = " ada";
    private String name = " dasd";

    Vertex(String label) {

        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label, String name) {
        this.label = label;
        this.name = "";
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "label='" + label + '\'' +
                '}';
    }
}