package Gun47.Enum;

public enum Aylar {
    OCAK (31, 1, "Ocak"),
    SUBAT (28, 2, "Subat"),
    MART (31, 3, "Mart"),
    NISAN (30, 4, "Nisan"),
    MAYIS (31, 5, "Mayis"),
    HAZIRAN (30, 6, "Haziran"),
    TEMMUZ (31, 7, "Temmuz"),
    AGUSTOS (31, 8, "Agustos"),
    EYLUL (30, 9, "Eylul"),
    EKIM (31, 10, "Ekim"),
    KASIM (30, 11, "Kasim"),
    ARALIK (31, 12, "Aralik");

    private final int gunMiktari;
    private final int ayNo;
    private final String name;

    Aylar(int gunMiktari, int ayNo, String name) {
        this.gunMiktari=gunMiktari;
        this.ayNo=ayNo;
        this.name=name;
    }

    public int getGunMiktari() {
        return gunMiktari;
    }

    public int getAyNo() {
        return ayNo;
    }

    public String getName() {
        return name;
    }
}
