package equipment;

public class Equipment {
    private String equipmentName;
    private int useYear;
    private String type;
    private static final int REPLACE_YEAR = 5;

    public Equipment(String equipmentName, String type, int useYear) {
        this.equipmentName = equipmentName;
        this.type = type;
        this.useYear = useYear;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public String getType() {
        return type;
    }

    public int getUseYear() {
        return useYear;
    }

    public boolean isReplaceTarget() {
        return useYear >= REPLACE_YEAR;
    }
}
