import java.util.Scanner;

public class pita {
   public static void main(String[] args) {
 
      int a, b, i, j, k, cnt=0, cnt2=0;
      double dbC;

      Scanner sc = new Scanner(System.in);

      System.out.print("직각 삼각형의 한 변의 범위(길이)를 입력하세요. : ");

      a = sc.nextInt();

      System.out.print("직각 삼각형의 다른 한 변의 범위(길이)를 입력하세요. : ");

      b = sc.nextInt();

      dbC = Math.sqrt((a * a) + (b * b));
      System.out.println("직각 삼각형의 빗변의 최대 범위(길이(자연수))는 " + (int)dbC);

      System.out.println("\n직각 삼각형의 (직각을 낀) 두 변의 최대 범위가 각각 " + a + "와 " + b + "인 직각 삼각형의 자연수 조합은 다음과 같습니다.");

      for(i = 1; i <= a; i++){
         for(j = 1; j <= b; j++){
            for(k = 1; k <= (int)dbC; k++){
               if(i * i + j * j == k * k) {
                  cnt++;
                  cnt2++;
                  System.out.println(i + "\t" + j + "\t" + k + "\t" + cnt + "번 " + "\t" + cnt2);
               }else{
                  cnt++;
               }
            }
         }
      }
      sc.close();
   }
}
