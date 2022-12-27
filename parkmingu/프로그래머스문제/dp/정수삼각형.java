package parkmingu.프로그래머스문제.dp;

public class 정수삼각형 {
    public int solution(int[][] triangle) {
        /*
        [
            [7], 
            [3, 8], 
            [8, 1, 0], 
            [2, 7, 4, 4], 
            [4, 5, 2, 6, 5]

            [ ], 
            [ ,  ], 
            [ ,  ,  ], 
            [ ,  ,  ,  ], 
            [ ,  ,  ,  ,  ]
        ]
        */
        // triangle과 같은 크기의 배열을 생성(데이터를 저장할곳)

        int answer = 0;
        // 대각선의 값이 존재할 경우
        int max = 0;
        int maxAnswer = 0;

        // 같은 크기의 배열을 생성
        // 두번째 차원의 값은 원하는대로 채울수 있음
        int[][] triangle_copy = new int[triangle.length][];

        for(int i = 0; i < triangle.length; i++){
            for(int j =0; j <triangle[i].length; j ++){
                
            }
        }

        // 첫번째 값은 기본적으로 추가
        triangle_copy[0][0] = triangle[0][0];

        for(int i = 0; i < triangle.length-1; i++){
            // max는 사용후 초기화
            max = 0;
            for(int j = 0; j < triangle[i].length; j++){
                // 첫번째 칸 바로밑 계산
                if(j == 0){
                    triangle_copy[i+1][j] = triangle_copy[i][j] + triangle[i+1][j];
                }
                // // 두번째 칸부터는 아래에 이전 칸의 대각선합의 값이 들어와 있을것이므로 비교해서 대입함
                else if((triangle_copy[i][j] + triangle[i+1][j]) > max){
                    triangle_copy[i+1][j] = triangle_copy[i][j] + triangle[i+1][j];
                }

                // // 비어있는 대각으로 더하기
                if(triangle_copy[i+1][j+1] == 0){
                    triangle_copy[i+1][j+1] = triangle_copy[i][j] + triangle[i+1][j+1];
                    max = triangle_copy[i+1][j+1];
                }
            }
        }

        for(int j = 0; j < triangle[triangle.length-1].length; j++){
            maxAnswer = triangle_copy[triangle.length-1][j];
            if(maxAnswer > answer){
                answer = maxAnswer;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        정수삼각형 a = new 정수삼각형();
        int[][] qq = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
        System.out.println(a.solution(qq));
    }
}
