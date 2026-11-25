package equipment;

public class Equipment {
    private final String equipmentName;
    private final int useYear;
    private final String type;
    private static final int REPLACE_YEAR = 5;

    public Equipment(String equipmentName, String type, int useYear) {
        if (useYear < 0) {
            throw new IllegalArgumentException("사용연수는 0이상이어야 합니다 : " + useYear);
        }
        if (equipmentName == null || equipmentName.isBlank()) {
            throw new IllegalArgumentException("장비이름은 반드시 입력되어야 합니다 : " + equipmentName);
        }
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
