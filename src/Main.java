public class Main {
    public static void main(String[] args) {
        GryffindorStudent potter = new GryffindorStudent("Гарри", "Поттер",
                100, 100, 100, 100, 100);
        GryffindorStudent granger = new GryffindorStudent("Гермиона", "Грейнджер",
                90, 90, 90, 90, 90);
        GryffindorStudent weasley = new GryffindorStudent("Рон", "Уизли",
                60, 60, 60, 60, 60);
        SlytherinStudent malfoy = new SlytherinStudent("Драко", "Мафлой",
                100, 100, 100, 100, 100, 100, 100);
        SlytherinStudent montague = new SlytherinStudent("Грэхэм", "Монтегю",
                90, 90, 90, 90, 90, 90, 90);
        SlytherinStudent goyle = new SlytherinStudent("Грегори", "Гойл",
                80, 80, 80, 80, 80, 80, 80);
        HufflepuffStudent smith = new HufflepuffStudent("Захария", "Смит",
                70, 70, 70, 70, 70);
        HufflepuffStudent diggory = new HufflepuffStudent("Седрик", "Диггори",
                60, 60, 60, 60, 60);
        HufflepuffStudent finchFletchley = new HufflepuffStudent("Джастин", "Финч-Флетчли",
                50, 50, 50, 50, 50);
        RavenclawStudent chang = new RavenclawStudent("Чжоу", "Чанг",
                100, 100, 100, 100, 100, 100);
        RavenclawStudent patil = new RavenclawStudent("Падма", "Патил",
                90, 90, 90, 90, 90, 90);
        RavenclawStudent belby = new RavenclawStudent("Маркус", "Белби",
                80, 80, 80, 80, 80, 80);
        potter.printInfo();
        montague.printInfo();
        smith.printInfo();
        chang.printInfo();
        potter.compareWith(granger);
        montague.compareWith(malfoy);
        smith.compareWith(finchFletchley);
        chang.compareWith(belby);
        potter.printStudentInfo();
        potter.compareStudentWith(smith);
    }
}