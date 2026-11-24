package equipment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EquipmentMain {
    public static void main(String[] args) {
        List<Equipment> equipments = new ArrayList<>();
        equipments.add(new Equipment("노트북-A", "노트북", 5));
        equipments.add(new Server("서버-B", 6));
        equipments.add(new Equipment("데스크탑-C", "데스크탑", 7));
        equipments.add(new Equipment("프린터-D", "프린터", 3));
        equipments.add(new Equipment("마우스-E", "마우스", 7));
        equipments.add(new Equipment("모니터-F", "모니터", 2));
        equipments.add(new Equipment("노트북-B", "노트북", 2));

        int no = 1;
        int replaceYes = 0;
        for (Equipment equipment : equipments) {
            System.out.print("[" + no + "] " + equipment.getEquipmentName() + " (" + equipment.getType() + ", " + equipment.getUseYear() + "년 )");
            if (equipment.isReplaceTarget()) {
                System.out.print(" -> 교체 대상");
                replaceYes++;
            }
            no++;
            System.out.println();
        }
        System.out.println("교체 대상: " + replaceYes + "대 / 전체: " + equipments.size() + "대");

        Map<String, Integer> countByType = new HashMap<>();
        for (Equipment equipment : equipments) {
            String type = equipment.getType();
            int current = countByType.getOrDefault(type, 0);
            countByType.put(type, current+1);
        }
        System.out.println("=== 종류별 보유 현황 ===");
        for (String type : countByType.keySet()) {
            System.out.println(type + ": " + countByType.get(type) + "대");
        }
    }
}
