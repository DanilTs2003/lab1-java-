import java.util.ArrayList;
import java.util.Scanner;
/**
 * Класс Матрицы(row-строка col-столбец)
 */
public class Matrix {
    public int row,col;
    int is_comp=0;

    Complex[][] mtr; //двумерный массив
    /**
     * конструктор класса
     */
    public  Matrix(int r,int c){
        row=r;
        col=c;
        mtr=new Complex[r][c];
        for(int i=0;i<row;++i){
            for(int j=0;j<col;++j){
                mtr[i][j]=new Complex(0,0);
            }
        }
        };
    /**
     * метод заполнения матрицы
     */
    public  void fill(){
        Scanner in = new Scanner(System.in);//
        System.out.println("Введите числа матрицы:");
        for(int i=0;i<row;++i){
            for(int j=0;j<col;++j){
             int a,b;
                 mtr[i][j].a=in.nextFloat();
                 mtr[i][j].b= in.nextFloat();

            }
        }}
    /**
     * метод вывода матрицы
     */
        public void show(){
            for(int i=0;i<row;++i){
                for(int j=0;j<col;++j){
                    int a,b;
                   mtr[i][j].show();
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    /**
     * метод транспонирования матрицы
     */
        public void tr() {
            int n = mtr.length;
            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    Complex tmp = mtr[j][i];
                    mtr[j][i] = mtr[i][j];
                    mtr[i][j] = tmp;
                }
            }
        }
    /**
     * метод произведения матриц
     */

    public Matrix mtr_sub(Matrix x,Matrix y){
        Matrix result=new Matrix(x.row,y.col);
        for (int row = 0; row < result.mtr.length; row++) {
            for (int col = 0; col < result.mtr[row].length; col++) {
                result.mtr[row][col] = multiplyMatricesCell(x, y, row, col);
            }
        }
        return result;}
    Complex multiplyMatricesCell(Matrix firstMatrix, Matrix secondMatrix, int row, int col) {
        Complex cell=new Complex();
        for (int i = 0; i < secondMatrix.mtr.length; i++) {
            cell =Complex.Complex_sum(Complex.Complex_mul(firstMatrix.mtr[row][i] , secondMatrix.mtr[i][col]),cell);//cell += firstMatrix[row][i] * secondMatrix[i][col];
        }
        return cell;
    }

    }


