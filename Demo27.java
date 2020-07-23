package Demo;

public class Demo27 {public static void main(String[] args) {
    int j=0;
    int i=0;
    int count=0;
    char[] heavenlyStems = { '甲' , '乙' , '丙' , '丁' , '戊' , '己' , '庚' , '辛' , '壬' , '癸' };
    char[] earthlyBranches = { '子' , '丑' , '寅' , '卯' , '辰' , '巳' ,
            '午' , '未' , '申' , '酉' , '戌' , '亥' };
    char[] chinesezodiac = { '鼠','牛','虎','兔','龙','蛇','马','羊','猴','鸡','狗','猪' };

    for(;i<11;){
        if(i==10){
            i=0;
        }
        if(j==12){
            j=0;
        }
        for(;j<13;){
            System.out.print(heavenlyStems[i]+","+earthlyBranches[j]+" ");
            count++;
            j++;
            if(count%12==0){
                System.out.println();
            }
            break;
        }
        i++;
        if(count==60){
            break;
        }
    }


}
}
