package equipment;

import java.util.ArrayList;
import java.util.List;

public class StreamPractice {
    public static void main(String[] args) {
        List<Equipment> equipments = new ArrayList<>();
        equipments.add(new Equipment("노트북-A", "노트북", 5));
        equipments.add(new Server("서버-B", 6));
        equipments.add(new Equipment("데스크탑-C", "데스크탑", 7));
        equipments.add(new Equipment("프린터-D", "프린터", 3));
        equipments.add(new Equipment("마우스-E", "마우스", 7));
        equipments.add(new Equipment("모니터-F", "모니터", 2));
        equipments.add(new Equipment("노트북-B", "노트북", 2));

        List<String> notebooks = equipments.stream()
                .filter(e -> e.getType().equals("노트북"))
                .map(e -> e.getEquipmentName())
                .toList();
        System.out.println("노트북 목록");
        System.out.println(notebooks);

        long count = equipments.stream().filter(e -> e.getUseYear() <=3).count();
        System.out.print("3년 이하 장비 : " + count + "대");
    }
}