package equipment;

public class Server extends Equipment {
    private static final int SERVER_REPLACE_YEAR = 7;

    public Server(String equipmentName, int useYear) {
        super(equipmentName, "서버", useYear);
    }

    @Override
    public boolean isReplaceTarget() {
        return getUseYear() >= SERVER_REPLACE_YEAR;
    }
}
