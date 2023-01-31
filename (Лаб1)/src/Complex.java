/**
 * Класс комплексных чисел вида а+bi
 */
public class Complex {
    public float a,b;
    /**
     * Конструкторы класса с параметрами и без
     */
    public  Complex(float  x,float y){a=x;b=y;};
    public Complex(){a=0;b=0;}
    /**
     * show() вывод комплексного числа в виде a+bi
     */
    public void   show(){ if(a!=0){System.out.format("%.3f",a);};if(b>0){System.out.print('+');System.out.format("%.3f",b);} else if(b<=0){System.out.format("%.3f",b);};if(b!=0){System.out.print('i');}}
    /**
     * Complex_sum() возвращает сумму двух комлексных чисел
     */
    public static Complex Complex_sum(Complex X,Complex Y){
        Complex c3=new Complex(X.a+Y.a,X.b+Y.b);
        return c3;

    };
    /**
     * Complex_dif() возвращает разность двух комлексных чисел
     */
    public static Complex Complex_dif(Complex X,Complex Y){
        Complex c3=new Complex(X.a-Y.a,X.b-Y.b);
        return c3;
    }
    /**
     * Complex_mul() возвращает произведение двух комлексных чисел
     */
    public static Complex Complex_mul(Complex X,Complex Y){
        Complex c3=new Complex((X.a*Y.a)+((X.b*Y.b)*(-1)),(X.a*Y.b)+(X.b*Y.a));
        return c3;
    }
    /**
     * Complex_div() возвращает частное двух комлексных чисел
     */
    public static void Complex_div(Complex X,Complex Y) {
        float x_a=X.a,x_b=X.b,y_a=Y.a,y_b=Y.b;
        float y_b_s=y_b*(-1);


        float   temp_down=(y_a*y_a)+((y_b*y_b_s)*(-1)),
                temp_1up=(x_a*y_a)+((x_b*y_b_s)*(-1)),
                temp_2up=(x_a*y_b_s)+(x_b*y_a);
        temp_1up/=temp_down;
        temp_2up/=temp_down;
        System.out.print(temp_1up);
        if(temp_2up<0){System.out.print(temp_2up);System.out.print('i');}
        else{System.out.print('+');System.out.print(temp_2up);System.out.print('i');}
    }
    /**
     * Complex_mod() возвращает модуль  комплексного числа(sqrt(b^2+a^2))
     */
    public static void Complex_mod(Complex X){
       System.out.println(Math.sqrt(Math.pow(X.a,2)+Math.pow(X.b,2)));
    }
    /**
     * Complex_arg() возвращает аргумент комплексного числа
     */
    public static void Complex_arg(Complex X){
        System.out.println(Math.atan(X.a/X.b));
    }

}
