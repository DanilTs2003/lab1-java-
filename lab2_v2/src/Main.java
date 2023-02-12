//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Укажите путь к первому файлу: ");
        String path1 = in.nextLine();
        System.out.print("Укажите путь ко второму файлу: ");
        String path2 = in.nextLine();
        Counter count = new Counter(path1, path2);
        count.run();
    }
}

