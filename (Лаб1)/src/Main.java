//Класс с комплексными числами                     +
//функция для создания  комплексных чисел          +
//Функция сложения                                 +
//Функция вычитания                                +
//Функция умножения                                +
//Функция деления                                  +
//Функция аргумента                                +
//Функция модуля                                   +
//Класс Матриц(+комплексных чисел)                 +
//Функция Сложение Матриц                          +
//Функция вычитания матриц                         +
//Функция Транспонирования                         +
//Функция умножения матриц                         11


import java.util.Scanner;
import java.lang.String;
import java.lang.Object;
import java.lang.Math;
import java.lang.Object;

/**
 * главная функция
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//
        /**
         * выбор метода работы
         */
        System.out.println("1 Работа с комплексными числами\n2 Работа с матрицами");
        int choice = in.nextInt();
        switch (choice) {
            case 1:
                    boolean bool = false;

                    Complex c1 = new Complex(0, 0);
                    Complex c2 = new Complex(0, 0);
                    System.out.println("Введите выражение: ");
                    String str = in.next();
                /**
                 * считывание первого числа(a1+b1i) из выражения вида (a1+b1i)+(a2+b2i)
                 */
                    if (str.equals("x")) {
                        break;
                    }
                    System.out.print(str + '=');
                    for (int i = 0; i < str.length(); ++i) {
                        if (str.toCharArray()[i] == '|') {
                            ++i;
                        }
                        if (str.toCharArray()[i] == '(') {
                            int c_min = 1;
                            if (str.toCharArray()[i + 1] == '-') {
                                c_min = -1;
                                ++i;
                            }
                            //find_first_num

                            String temps = "";
                            String temps_p="";
                            while (str.toCharArray()[i + 1] != '+' && str.toCharArray()[i + 1] != '-' && str.toCharArray()[i + 1] != ',') {
                                ++i;
                                temps += str.toCharArray()[i];
                            }
                            ++i;
                            if(str.toCharArray()[i] == ','){
                                while (str.toCharArray()[i + 1] != '+' && str.toCharArray()[i + 1] != '-') {
                                    ++i;
                                    temps_p += str.toCharArray()[i];
                                }
                            }

                            int temp = 0;
                            for (int k = temps.length(); k > 0; k--) {
                                c1.a +=(((int)temps.toCharArray()[k - 1]) - 48) * Math.pow(10, temp);
                                temp++;
                            }

                            if(!temps_p.isEmpty()){
                                temp=-1;
                                for (int u = 0; u < temps_p.length(); u++) {
                                    c1.a +=(((int)temps_p.toCharArray()[u]) - 48.0) * Math.pow(10, temp);
                                    temp--;
                            }}
                            c1.a *= c_min;
                            //find_second_num
                            int tmp = 1;
                            if (str.toCharArray()[i+1] == '-') {
                                tmp = -1;
                            }
                            i+=1;
                            temp = 0;
                            temps = "";
                            temps_p="";
                            while (str.toCharArray()[i + 1] != 'i' && str.toCharArray()[i + 1] != ',' ) {
                                ++i;
                                temps += str.toCharArray()[i];
                            }
                            i++;
                            if(str.toCharArray()[i]==',') {
                                while (str.toCharArray()[i + 1] != '+' && str.toCharArray()[i + 1] != '-' && str.toCharArray()[i+1]!='i') {
                                    ++i;
                                    temps_p += str.toCharArray()[i];
                            }}

                            i += 2;
                            for (int k = temps.length(); k > 0; k--) {
                                c1.b += (int) (temps.toCharArray()[k - 1] - 48) * Math.pow(10, temp);
                                temp++;
                            }
                            if(!temps_p.isEmpty()){
                                temp=-1;
                                for (int u = 0; u < temps_p.length(); u++) {
                                    c1.b +=(((int)temps_p.toCharArray()[u]) - 48.0) * Math.pow(10, temp);
                                    temp--;
                                }i++;}

                            if (tmp == -1) {
                                c1.b *= tmp;
                            }
                            int way = 0;
                            switch (str.toCharArray()[i]) {
                                case '+':
                                    way = 1;
                                    break;
                                case '-':
                                    way = 2;
                                    break;
                                case '*':
                                    way = 3;
                                    break;
                                case '/':
                                    way = 4;
                                    break;
                                case '|':
                                    way = 5;
                                case '&':
                                    way = 6;
                                    break;
                                default:
                                    way = 1;
                                    break;
                            }
                            ++i;
                        /**
                         * считывание второго числа(a2+b2i) из выражения вида (a1+b1i)+(a2+b2i)
                         */
                        if(way!=5 && way!=6){
                        if(i!=str.length()-1)    {
                            temps = "";
                            temps_p="";
                            c_min = 1;
                            if (str.toCharArray()[i + 1] == '-') {
                                c_min = -1;
                                ++i;
                            }
                            while (str.toCharArray()[i + 1] != '+' && str.toCharArray()[i + 1] != '-'&& str.toCharArray()[i + 1] != ',') {
                                ++i;
                                temps += str.toCharArray()[i];
                            }
                            ++i;
                            if(str.toCharArray()[i] == ','){
                                while (str.toCharArray()[i + 1] != '+' && str.toCharArray()[i + 1] != '-') {
                                    ++i;
                                    temps_p += str.toCharArray()[i];
                                }
                            }
                            i++;
                            temp = 0;
                            for (int k = temps.length(); k > 0; k--) {
                                c2.a += (int) (temps.toCharArray()[k - 1] - 48) * Math.pow(10, temp);
                                temp++;
                            }
                            if(!temps_p.isEmpty()){
                                temp=-1;
                                for (int u = 0; u < temps_p.length(); u++) {
                                    c2.a +=(((int)temps_p.toCharArray()[u]) - 48.0) * Math.pow(10, temp);
                                    temp--;
                                }}
                            c2.a*=c_min;
                            tmp = 1;
                            if (str.toCharArray()[i] == '-') {
                                tmp = -1;
                            }

                            temp = 0;
                            temps = "";
                            temps_p="";
                            while (str.toCharArray()[i + 1] != 'i' && str.toCharArray()[i + 1] != ',') {
                                ++i;
                                temps += str.toCharArray()[i];
                            }
                            i++;
                            if(str.toCharArray()[i] == ','){
                                while (str.toCharArray()[i + 1] != 'i') {
                                    ++i;
                                    temps_p += str.toCharArray()[i];
                                }
                            }
                            if(!temps_p.isEmpty()){
                                temp=-1;
                                for (int u = 0; u < temps_p.length(); u++) {
                                    c2.b +=(((int)temps_p.toCharArray()[u]) - 48.0) * Math.pow(10, temp);
                                    temp--;
                                }}
                            temp =0;
                            for (int k = temps.length(); k > 0; k--) {
                                c2.b += (int) (temps.toCharArray()[k - 1] - 48) * Math.pow(10, temp);
                                temp++;
                            }
                            if (tmp == -1) {
                                c2.b *= tmp;
                            }
                        }
        }
                            /**
                             * выполняется действие выбранное пользователем
                             */
                    switch (way){
                        case 1:
                            Complex.Complex_sum(c1,c2).show();
                            break;
                        case 2:
                            Complex.Complex_dif(c1,c2).show();
                            break;
                        case 3:
                            Complex.Complex_mul(c1,c2).show();
                            break;
                        case 4:
                            Complex.Complex_div(c1,c2);
                            break;
                        case 5:
                            Complex.Complex_mod(c1);
                            break;
                        case 6:
                            Complex.Complex_arg(c1);
                            break;
                    }
                    break;
                        }
                    }
                    break;
            case 2:
                /**
                 * работа с матрицами Matrix[] MTR=new Matrix[10] - массив из 10 матриц
                 */
            Matrix[] MTR=new Matrix[10];
            int ch=0;
            int point=0;
            while(true){
            if(point==10){point=0;}
            System.out.println("1 Добавить матрицу\n2 вывести матрицу по индексу\n3 Сложить матрицы\n4 Вычесть матрицы\n5 Транспонирование\n6 Умножение матриц\n");
            ch=in.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Введите количество строк и столбцов:");
                    int row=in.nextInt();
                    int col=in.nextInt();
                    MTR[point]=new Matrix(row,col);
                    MTR[point].fill();
                    point++;
                    break;
                case 2:
                    int index=in.nextInt();
                    MTR[index].show();
                    break;
                case 3:
                    int i1,i2;
                    System.out.println("Введите индексы матриц:");
                    i1=in.nextInt();
                    i2=in.nextInt();
                    if(MTR[i1].row!=MTR[i2].row || MTR[i1].col!=MTR[i2].col){ System.out.println("Матрицы разного размера");}
                    else {
                        MTR[point]=new Matrix(MTR[i1].row,MTR[i1].col);
                        for (int i = 0; i < MTR[i1].row; ++i) {
                            for (int j = 0; j < MTR[i1].col; ++j) {
                                MTR[point].mtr[i][j]=Complex.Complex_sum(MTR[i1].mtr[i][j],MTR[i2].mtr[i][j]);
                            }
                        }
                    }
                point++;
                break;
                case 4:
                    int i_1,i_2;
                    System.out.println("Введите индексы матриц:");
                    i_1=in.nextInt();
                    i_2=in.nextInt();
                    if(MTR[i_1].row!=MTR[i_2].row || MTR[i_1].col!=MTR[i_2].col){ System.out.println("Матрицы разного размера");}
                    else {
                        MTR[point]=new Matrix(MTR[i_1].row,MTR[i_1].col);
                        for (int i = 0; i < MTR[i_1].row; ++i) {
                            for (int j = 0; j < MTR[i_1].col; ++j) {
                                MTR[point].mtr[i][j]=Complex.Complex_dif(MTR[i_1].mtr[i][j],MTR[i_2].mtr[i][j]);
                            }
                        }
                    }
                    point++;
                    break;
                case 5:
                    System.out.println("Введите индексы матриц:");
                    i_1=in.nextInt();
                    if(MTR[i_1].col!=MTR[i_1].row){System.out.println("Матрицы не квадратная");}
                    else{MTR[i_1].tr();}
                    break;
                case 6:
                    System.out.println("Введите индексы матриц:");
                    i_1=in.nextInt();
                    i_2=in.nextInt();
                    MTR[point]=new Matrix(MTR[i_1].row,MTR[i_2].col);
                    MTR[point]=MTR[point].mtr_sub(MTR[i_1],MTR[i_2]);
                    point++;
                    break;
            }
        }}

    }
}