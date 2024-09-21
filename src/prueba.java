public class prueba {
    public static void main(String[] args) {
        Personaje thor = new Personaje("thor", 1000, 105);
        GodsMythologicalBeings diosThor = new GodsMythologicalBeings(thor, "trueno");
        System.out.println(diosThor.getCharacterName());
    }
}
