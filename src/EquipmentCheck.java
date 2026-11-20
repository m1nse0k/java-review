public class EquipmentCheck {
    public static void main(String[] args) {
        final int REPLACE_YEAR = 5;

        String[] equipmentNames = {"노트북-A", "데스크탑-B", "프린터-C", "서버-D", "모니터-E" };

        int[] eqUseYear = {3, 6, 2, 7, 1};

        int replaceCount = 0;

        for (int i = 0; i < equipmentNames.length; i++) {
            System.out.print("[" + (i+1) + "] ");
            System.out.print(equipmentNames[i]);
            System.out.print(" (" + eqUseYear[i] + "년 )");
            if (eqUseYear[i]>=REPLACE_YEAR) {
                System.out.print(" -> 교체 대상");
                replaceCount +=1;
            }
            System.out.println();
        }
        System.out.println("교체 대상: " + replaceCount + "대");
    }
}
