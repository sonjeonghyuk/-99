package week02.HomeWork;


import java.util.*;

public class Week_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String CollectionName = sc.nextLine(); // 저장할 자료구조명을 입력받기 (Set, List, Map)
        String title = sc.nextLine();  // Scanner을 이용해서 제목 입력받기


        switch (CollectionName) {
            case "List" :
                ArrayList<String> strList = new ArrayList<>();
                while (true) {  // 한줄씩 받아서 내용 저장하기 위함
                    String str1 = sc.nextLine();
                    if(Objects.equals(str1,"끝")){
                        break;
                    }
                    strList.add(str1);
                }
                System.out.println("[ List로 저장된 " + title + " ] "); //  괄호로 감싸준 제목 출력
                for(int i=0; i<strList.size(); i++){
                    int num = i+1;
                    System.out.println(num + ". " + strList.get(i));

                }
                break; // switch 문에서 case 가 끝나면 break 를 걸어줘야함.

            case "Map" :
                Map<Integer, String> strMap = new HashMap<>();
                int lineNumber = 1;
                while (true) {  // 한줄씩 받아서 내용 저장하기 위함
                    String str1 = sc.nextLine();
                    if(Objects.equals(str1,"끝")){
                        break;
                    }
                    strMap.put(lineNumber++, str1);
                }
                System.out.println("[ Map으로 저장된 " + title + " ] "); //  괄호로 감싸준 제목 출력
                for(int i=0; i<strMap.size(); i++){
                    int num = i+1;
                    System.out.println(num + ". " + strMap.get(i+1));

                } break;

            case "Set" :
                Set<String> strSet = new HashSet<>();

                while (true) {  // 한줄씩 받아서 내용 저장하기 위함
                    String str1 = sc.nextLine();
                    if(Objects.equals(str1,"끝")){
                        break;
                    }
                    strSet.add(str1);
                }
                System.out.println("[ Set으로 저장된 " + title + " ] "); //  괄호로 감싸준 제목 출력

                Iterator iterator = strSet.iterator();

                for(int i=0; i<strSet.size(); i++){
                    int num = i+1;
                    System.out.println(num + ". " + iterator.next());

                } break;

            default:
                System.out.println("저장할 수 없는 자료구조입니다.");

        }

    }
}
