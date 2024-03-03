public enum Days {
    MONDAY("Дуйшомбу куну java сабагым бар"),
    TUESDAY("Шейшемби js сабагым бар"),
    WEDNESDAY("Шаршемби english сабагым бар"),
    THURSDAY("Бейшемби softskils сабагым бар"),
    FRIDAY("Жума typing"),
    SATURDAY("Ишемби кайталоо сабагы"),
    DUNDAY("Жекшемби сабагым жок");

    private String name;



    Days(String name) {
        this.name = name;
    }

    String getTranslation(){
        return name;
    }


    @Override
    public String toString() {
        return "Days{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}
